

package frsf.cidisi.exercise.robot.search;

import frsf.cidisi.faia.agent.search.GoalTest;
import frsf.cidisi.faia.state.AgentState;

public class ObjetivoAgente extends GoalTest {

    @Override
    public boolean isGoalState (AgentState agentState) {
    
    	// TODO: Complete Method
        if  (true) //( estadoAgente.getDestino().contains(estadoAgente.getPosicionAcual()) && estadoAgente.getListaProductos().isEmpty())
        	{
            return true;
        	}
        return false;
	}
}