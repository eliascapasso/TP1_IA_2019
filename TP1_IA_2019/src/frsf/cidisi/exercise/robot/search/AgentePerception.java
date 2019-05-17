package frsf.cidisi.exercise.robot.search;

import java.util.ArrayList;

import dominio.Interseccion;
import dominio.Cuadra;
import dominio.Producto;
import dominio.Supermercado;
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
	private ArrayList<Supermercado> listaPromocionesSupermercados;
	private ArrayList<Cuadra> listaCuadrasBloqueadas;
	
    public  AgentePerception() {
    	listaPromocionesSupermercados = new ArrayList<Supermercado>();
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
        EstadoAmbiente estadoAmbiente = environment.getEnvironmentState();
       
        listaPromocionesSupermercados.addAll(estadoAmbiente.getListaSupermercados());
        listaCuadrasBloqueadas.addAll(estadoAmbiente.getListaCuadrasBloqueadas());
    }
    
    @Override
    public String toString() {
    	String str = "\n";
        str += "Cuadras Bloqueadas: \n";
        for(Cuadra c: listaCuadrasBloqueadas){
        	str += "Calle: " + c.getNombreCalle() + "\n" +
        	"Interseccion 1: " + c.getOrigen().toString() + "\n" +
        	"Interseccion 2: " + c.getDestino().toString() + "\n";
        }
        
        str += "Promociones: \n";
        for(Supermercado s: listaPromocionesSupermercados){
        	str += "Supermercado: " + s.getNombre() + "\n";
        	for(Producto p: s.getListaPromociones()){
        		str += "-> Producto: " + p.getNombre() + ", " + "Precio: " + p.getPrecio() + "\n";
        	}
        }
        
        return str;
    }

	public ArrayList<Supermercado> getListaPromocionesSupermercados() {
		return listaPromocionesSupermercados;
	}

	public void setListaPromocionesSupermercados(
			ArrayList<Supermercado> listaPromocionesSupermercados) {
		this.listaPromocionesSupermercados = listaPromocionesSupermercados;
	}

	public ArrayList<Cuadra> getListaCuadrasBloqueadas() {
		return listaCuadrasBloqueadas;
	}

	public void setListaCuadrasBloqueadas(ArrayList<Cuadra> listaCuadrasBloqueadas) {
		this.listaCuadrasBloqueadas = listaCuadrasBloqueadas;
	}
	
}
