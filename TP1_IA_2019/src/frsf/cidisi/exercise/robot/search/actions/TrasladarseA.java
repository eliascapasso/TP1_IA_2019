package frsf.cidisi.exercise.robot.search.actions;

import java.util.ArrayList;

import dominio.Interseccion;
import dominio.Mapa;
import dominio.Cuadra;

import frsf.cidisi.exercise.robot.search.EstadoAgente;
import frsf.cidisi.exercise.robot.search.EstadoAmbiente;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class TrasladarseA extends SearchAction {
	Interseccion interseccion;
	ArrayList<Interseccion> adyacentes;
	
	public TrasladarseA(Interseccion i) {
    	this.interseccion = i;
    	
    	adyacentes = new ArrayList<Interseccion>();
    	for(Cuadra c: Mapa.getMapa().getListaCuadras()){
    		if(c.getDestino().equals(i))
    			adyacentes.add(c.getOrigen());
    	} 
	}
	
    /**
     * This method updates a tree node state when the search process is running.
     * It does not updates the real world state.
     */
    @Override
    public SearchBasedAgentState execute(SearchBasedAgentState s) {
        EstadoAgente estadoAgente = (EstadoAgente) s;
        
        // TODO: Use this conditions
        // PreConditions:   
        if(adyacentes.contains(estadoAgente.getPosicionActual())
        		&& !estadoAgente.getListaCuadrasBloqueadas().contains(estadoAgente.getMapa().buscarCuadra(estadoAgente.getPosicionActual(), interseccion))){
        	    
        	// PostConditions:
        	estadoAgente.setPosicionActual(interseccion);
        	estadoAgente.agregarInterseccionRuta(interseccion);
        	return estadoAgente;
        	
        }
        return null;
    }

    /**
     * This method updates the agent state and the real world state.
     */
    @Override
    public EnvironmentState execute(AgentState ast, EnvironmentState est) {
        EstadoAmbiente environmentState = (EstadoAmbiente) est;
        EstadoAgente agState = ((EstadoAgente) ast);

        // TODO: Use this conditions
        // PreConditions:
        if(adyacentes.contains(agState.getPosicionActual())
        		&& !agState.getListaCuadrasBloqueadas().contains(agState.getMapa().buscarCuadra(agState.getPosicionActual(), interseccion))){
        	
        	// PostConditions:
        	agState.setPosicionActual(interseccion);
        	agState.agregarInterseccionRuta(interseccion);
        	
        	environmentState.setPosicionAgente(interseccion);
            
            return environmentState;
        }

        return null;
    }

    /**
     * This method returns the action cost.
     */
    @Override
    public Double getCost() {
        return new Double(0);
    }

    /**
     * This method is not important for a search based agent, but is essensial
     * when creating a calculus based one.
     */
    @Override
    public String toString() {
        return "TrasladarseA: " + interseccion.toString();
    }
}