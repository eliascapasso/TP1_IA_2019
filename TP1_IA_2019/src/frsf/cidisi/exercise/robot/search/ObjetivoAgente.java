

package frsf.cidisi.exercise.robot.search;

import frsf.cidisi.faia.agent.search.GoalTest;
import frsf.cidisi.faia.state.AgentState;

public class ObjetivoAgente extends GoalTest {

    @Override
    public boolean isGoalState (AgentState agentState) {
    	EstadoAgente estadoAgente = (EstadoAgente) agentState;
    	
    	return (estadoAgente.getListaDestinos().contains(estadoAgente.getposicionActual())) 
    			&& (estadoAgente.getListaProductos().size() == 0);
    }
}