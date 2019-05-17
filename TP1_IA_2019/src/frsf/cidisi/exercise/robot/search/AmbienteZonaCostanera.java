package frsf.cidisi.exercise.robot.search;

import java.util.ArrayList;

import dominio.Cuadra;
import dominio.Interseccion;
import dominio.Producto;
import dominio.Supermercado;
import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;

public class AmbienteZonaCostanera extends Environment {

    public AmbienteZonaCostanera() {
        // Create the environment state
        this.environmentState = new EstadoAmbiente();
    }

    public EstadoAmbiente getEnvironmentState() {
        return (EstadoAmbiente) super.getEnvironmentState();
    }

    /**
     * This method is called by the simulator. Given the Agent, it creates
     * a new perception reading, for example, the agent position.
     * @param agent
     * @return A perception that will be given to the agent by the simulator.
     */
    @Override
    public  AgentePerception getPercept() {
        // Create a new perception to return
         AgentePerception perception = new AgentePerception();
		
         perception.getListaCuadrasBloqueadas().clear();
         perception.getListaPromocionesSupermercados().clear();
         
        ArrayList<Cuadra> listaCuadrasBloqueadas = this.getEnvironmentState().getListaCuadrasBloqueadas();
        ArrayList<Supermercado> listaPromocionesSupermercados = this.getEnvironmentState().getListaSupermercados();
        
        perception.setListaCuadrasBloqueadas(listaCuadrasBloqueadas);
        perception.setListaPromocionesSupermercados(listaPromocionesSupermercados);
        
        return perception;
    }

    
    public String toString() {
        return environmentState.toString();
    }

    public boolean agentFailed(Action actionReturned) {

        EstadoAmbiente envState = this.getEnvironmentState();

        // TODO: Complete Method        

        return false;
    }

	//TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
    
}
