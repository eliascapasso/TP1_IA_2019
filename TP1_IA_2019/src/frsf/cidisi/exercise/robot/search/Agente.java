package frsf.cidisi.exercise.robot.search;

import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import frsf.cidisi.exercise.robot.search.actions.TrasladarseA;
import frsf.cidisi.exercise.robot.search.actions.Comprar;

import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.Problem;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgent;
import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.solver.search.*;

import dominio.Interseccion;
import dominio.Mapa;

public class Agente extends SearchBasedAgent {

    public Agente() {

        // The Agent Goal
        ObjetivoAgente agGoal = new ObjetivoAgente();

        // The Agent State
        EstadoAgente agState = new EstadoAgente();
        agState.initState();
        this.setAgentState(agState);

        // Create the operators
        Vector<SearchAction> operators = new Vector<SearchAction>();
        // TrasladarseA
        ArrayList<Interseccion> listaI = Mapa.getMapa().getListaIntersecciones();
        for(Interseccion i: listaI){
        	operators.addElement(new TrasladarseA(i));	
        }	
        //operators.addElement(new TrasladarseA(new Interseccion(11, "Av. Gral. Paz, Javier de la Rosa")));
        //Comprar
        //operators.addElement(new Comprar());	

        // Create the Problem which the agent will resolve
        Problem problem = new Problem(agGoal, agState, operators);
        this.setProblem(problem);
    }

    /**
     * This method is executed by the simulator to ask the agent for an action.
     */
    @Override
    public Action selectAction() {

        // Create the search strategy
        //IStepCostFunction cost = new CostFunction();
        //IEstimatedCostFunction heuristic = new Heuristic(); 
        //AStarSearch strategy = new AStarSearch(cost, heuristic);
        Strategy strategy = new UniformCostSearch(new CostFunction());

        // Create a Search object with the strategy
        Search searchSolver = new Search(strategy);

        /* Generate an XML file with the search tree. It can also be generated
         * in other formats like PDF with PDF_TREE */
        searchSolver.setVisibleTree(Search.XML_TREE);

        // Set the Search searchSolver.
        this.setSolver(searchSolver);

        // Ask the solver for the best action
        Action selectedAction = null;
        try {
            selectedAction =
                    this.getSolver().solve(new Object[]{this.getProblem()});
        } catch (Exception ex) {
            Logger.getLogger(Agente.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Return the selected action
        return selectedAction;
    }

    /**
     * This method is executed by the simulator to give the agent a perception.
     * Then it updates its state.
     * @param p
     */
    @Override
    public void see(Perception p) {
        this.getAgentState().updateState(p);
    }
}
