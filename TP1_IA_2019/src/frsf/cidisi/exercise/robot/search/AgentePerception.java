package frsf.cidisi.exercise.robot.search;

import java.util.ArrayList;

import dominio.Interseccion;
import dominio.Cuadra;
import dominio.Producto;
import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;

public class AgentePerception extends Perception {

	//TODO: Setup Statics
    //public static int UNKNOWN_PERCEPTION = -1;   
	
	
	//TODO: Setup Sensors
//	private boolean promocion;
//	private boolean cortecalle;
//	private boolean manifestacion;
//	private boolean PerceptionName;
	private ArrayList<Producto> listaPromociones;
	private ArrayList<Cuadra> listaCuadrasBloqueadas;
	
    public  AgentePerception() {
    	listaPromociones = new ArrayList<Producto>();
    	listaCuadrasBloqueadas = new ArrayList<Cuadra>();
    }

    public AgentePerception(Agent agent, Environment environment) {
        super(agent, environment);
    }

    /**
     * This method is used to setup the perception.
     */
    @Override
    public void initPerception(Agent agentIn, Environment environmentIn) {
        Agente agent = (Agente) agentIn;
        AmbienteZonaCostanera environment = (AmbienteZonaCostanera) environmentIn;
        EstadoAmbiente environmentState = environment.getEnvironmentState();
       
        Interseccion esquinaInicial = environmentState.getPosicionAgente();
        
        for(Cuadra c: environment.getEnvironmentState().getListaCuadrasBloqueadas())
			if(!listaCuadrasBloqueadas.contains(c))
				listaCuadrasBloqueadas.add(c);
        //environmentState.contains(esquinaInicial,listaCalleBloqueadas,listaCalleDemoradas);
    }
    
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();

        //TODO: Complete Method

        return str.toString();
    }

	public ArrayList<Producto> getListaPromociones() {
		return listaPromociones;
	}

	public void setListaPromociones(ArrayList<Producto> listaPromociones) {
		this.listaPromociones = listaPromociones;
	}

	public ArrayList<Cuadra> getListaCuadrasBloqueadas() {
		return listaCuadrasBloqueadas;
	}

	public void setListaCuadrasBloqueadas(ArrayList<Cuadra> listaCuadrasBloqueadas) {
		this.listaCuadrasBloqueadas = listaCuadrasBloqueadas;
	}
	
}
