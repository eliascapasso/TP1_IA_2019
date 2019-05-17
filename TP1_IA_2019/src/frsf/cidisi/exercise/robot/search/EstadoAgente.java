package frsf.cidisi.exercise.robot.search;

import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import java.util.ArrayList;
import dominio.Interseccion;
import dominio.Mapa;
import dominio.Cuadra;
import dominio.Producto;
import dominio.Supermercado;

/**
 * Represent the internal state of the Agent.
 */
public class EstadoAgente extends SearchBasedAgentState {
	
	//TODO: Setup Variables
    private ArrayList<Supermercado> listaDestinos;
    private Mapa mapa;
    private Interseccion posicionActual;
    private ArrayList<Cuadra> listaCuadrasBloqueadas;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Interseccion> rutaAgente;
	
	public EstadoAgente() {
        this.initState();
    }

    /**
     * This method clones the state of the agent. It's used in the search
     * process, when creating the search tree.
     */
    @Override
    public SearchBasedAgentState clone() {
    	EstadoAgente newState = new EstadoAgente();
        newState.setListaDestinos(this.getListaDestinos());
        newState.setRutaAgente(this.getRutaAgente());
        newState.setListaCuadrasBloqueadas(this.getListaCuadrasBloqueadas());
        newState.setPosicionActual(this.getPosicionActual());
        newState.setMapa(this.getMapa().clone());
        
        return newState;
    }

    /**
     * This method is used to update the Agent State when a Perception is
     * received by the Simulator.
     */
    @Override
    public void updateState(Perception p) {
        AgentePerception perception = (AgentePerception) p;
    	
    	
    	ArrayList<Cuadra> listaCuadrasBloqueadas = perception.getListaCuadrasBloqueadas();
    	
    	for(Cuadra c: listaCuadrasBloqueadas){
    		if(!this.getListaCuadrasBloqueadas().contains(c)){
    			this.listaCuadrasBloqueadas.add(c);
    		}
    	}
    }

    /**
     * This method is optional, and sets the initial state of the agent.
     */
    @Override
    public void initState() {
    	/////////// MAPA //////////
    	mapa = Mapa.crearMapa();
    	
    	/////////// DESTINOS //////////
    	this.listaDestinos = Mapa.getListaDestinos();
    	
    	/////////// UBICACION AGENTE //////////
    	this.posicionActual = Mapa.getPosicionOrigenAgente();
    	
    	/////////// RUTA DEL AGENTE //////////
    	rutaAgente = new ArrayList<Interseccion>();
    	rutaAgente.add(Mapa.getPosicionOrigenAgente());
    	
    	/////////// LISTA DE PRODUCTOS //////////
    	this.listaProductos = new ArrayList<Producto>();
    	Producto p1 = new Producto();
    	p1.setNombre("p1");
    	p1.setPrecio(0);
    	
    	Producto p2 = new Producto();
    	p2.setNombre("p2");
    	p2.setPrecio(0);
    	
    	Producto p3 = new Producto();
    	p3.setNombre("p3");
    	p3.setPrecio(0);
    	
    	Producto p4 = new Producto();
    	p4.setNombre("p4");
    	p4.setPrecio(0);
    	
    	Producto p5 = new Producto();
    	p5.setNombre("p5");
    	p5.setPrecio(0);
    	
    	Producto p6 = new Producto();
    	p6.setNombre("p6");
    	p6.setPrecio(0);
    	
    	Producto p7 = new Producto();
    	p7.setNombre("p7");
    	p7.setPrecio(0);
    	
    	Producto p8 = new Producto();
    	p8.setNombre("p8");
    	p8.setPrecio(0);
    	
    	Producto p9 = new Producto();
    	p9.setNombre("p9");
    	p9.setPrecio(0);
    	
    	/////////// CUADRAS BLOQUEADAS //////////
    	listaCuadrasBloqueadas = new ArrayList<Cuadra>();
    	listaCuadrasBloqueadas.addAll(Mapa.listaCuadrasBloqueadas);
    }

    /**
     * This method returns the String representation of the agent state.
     */
    @Override
    public String toString() {
        String str = "";

        str = "\n";
        str += "Posicion del agente: ";
        str += posicionActual.toString()+"\n";
        str += "Ruta agente: ";
        str += rutaAgente.toString();
        str += "\nCuadras Bloqueadas: " + this.getListaCuadrasBloqueadas().toString() + "\n";

        return str;
    }

    /**
     * This method is used in the search process to verify if the node already
     * exists in the actual search.
     */
    @Override
    public boolean equals(Object obj) {
    	EstadoAgente estadoAgente = (EstadoAgente) obj;
    	return estadoAgente.getPosicionActual().equals(this.getPosicionActual());
    }

    //TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
   	
    public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
     public ArrayList<Supermercado> getListaDestinos(){
        return listaDestinos;
     }
     public void setListaDestinos(ArrayList<Supermercado> arg){
        listaDestinos = arg;
     }

	public Mapa getMapa() {
		return mapa;
	}

	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}

	public Interseccion getPosicionActual() {
		return posicionActual;
	}

	public void setPosicionActual(Interseccion posicionActual) {
		this.posicionActual = posicionActual;
	}

	public ArrayList<Cuadra> getListaCuadrasBloqueadas() {
		return listaCuadrasBloqueadas;
	}

	public void setListaCuadrasBloqueadas(ArrayList<Cuadra> listaCuadrasBloqueadas) {
		this.listaCuadrasBloqueadas = listaCuadrasBloqueadas;
	}

	public ArrayList<Interseccion> getRutaAgente() {
		return rutaAgente;
	}

	public void setRutaAgente(ArrayList<Interseccion> rutaAgente) {
		this.rutaAgente = rutaAgente;
	}
	
	public void agregarInterseccionRuta(Interseccion i){
		this.rutaAgente.add(i);
	}
	
}

