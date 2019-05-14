package frsf.cidisi.exercise.robot.search;

import java.util.ArrayList;

import dominio.Interseccion;
import dominio.Producto;
import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;

public class AgentePerception extends Perception {

	//TODO: Setup Statics
    //public static int UNKNOWN_PERCEPTION = -1;   
	
	
	//TODO: Setup Sensors
	private boolean promocion;
	private boolean cortecalle;
	private boolean manifestacion;
	private boolean PerceptionName;
	private ArrayList<Producto> listaPromociones;
	private ArrayList<Interseccion> listaInterseccionesBloqueadas;
	
    public  AgentePerception() {
    	//TODO: Complete Method
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
       
    }
    
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();

        //TODO: Complete Method

        return str.toString();
    }

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	public boolean isCortecalle() {
		return cortecalle;
	}

	public void setCortecalle(boolean cortecalle) {
		this.cortecalle = cortecalle;
	}

	public boolean isManifestacion() {
		return manifestacion;
	}

	public void setManifestacion(boolean manifestacion) {
		this.manifestacion = manifestacion;
	}

	public boolean isPerceptionName() {
		return PerceptionName;
	}

	public void setPerceptionName(boolean perceptionName) {
		PerceptionName = perceptionName;
	}

	public ArrayList<Producto> getListaPromociones() {
		return listaPromociones;
	}

	public void setListaPromociones(ArrayList<Producto> listaPromociones) {
		this.listaPromociones = listaPromociones;
	}

	public ArrayList<Interseccion> getListaInterseccionesBloqueadas() {
		return listaInterseccionesBloqueadas;
	}

	public void setListaInterseccionesBloqueadas(
			ArrayList<Interseccion> listaInterseccionesBloqueadas) {
		this.listaInterseccionesBloqueadas = listaInterseccionesBloqueadas;
	}
	
	
}
