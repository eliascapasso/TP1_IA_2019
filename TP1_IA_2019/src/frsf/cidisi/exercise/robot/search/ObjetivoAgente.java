

package frsf.cidisi.exercise.robot.search;

import dominio.Interseccion;
import frsf.cidisi.faia.agent.search.GoalTest;
import frsf.cidisi.faia.state.AgentState;

public class ObjetivoAgente extends GoalTest {

    @Override
    public boolean isGoalState (AgentState agentState) {
    	EstadoAgente estadoAgente = (EstadoAgente) agentState;
    	
    	Interseccion posicionAlvear = estadoAgente.getListaDestinos().get(0).getUbicacion();
    	Interseccion posicionPatricia = estadoAgente.getListaDestinos().get(1).getUbicacion();
    	Interseccion posicionKilbel = estadoAgente.getListaDestinos().get(2).getUbicacion();
    	
    	if(!posicionAlvear.equals(estadoAgente.getPosicionActual())) return false;
    	if(!posicionPatricia.equals(estadoAgente.getPosicionActual())) return false;
    	if(!posicionKilbel.equals(estadoAgente.getPosicionActual())) return false;
    	if(!(estadoAgente.getListaProductos().size() == 0)) return false;
    	
    	return true;
    }
}