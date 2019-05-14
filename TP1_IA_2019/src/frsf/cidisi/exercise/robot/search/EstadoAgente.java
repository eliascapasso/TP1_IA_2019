package frsf.cidisi.exercise.robot.search;

import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import java.util.ArrayList;

import dominio.Interseccion;
import dominio.Mapa;
import dominio.Producto;

/**
 * Represent the internal state of the Agent.
 */
public class EstadoAgente extends SearchBasedAgentState {
	
	//TODO: Setup Variables
    private ArrayList<Interseccion> listaDestinos;
    private Mapa mapa;
    private Interseccion posicionActual;
    private ArrayList<Interseccion> listaIntersecciones;
    private ArrayList<Interseccion> listaInterseccionesBloqueadas;
    private ArrayList<Producto> listaProductos;
	
	public EstadoAgente() {
    
    	//TODO: Complete Method
    	/*
			// destino = initData0;
			// mapa = initData1;
			// posicionActual = initData2;
			// listaIntersecciones = initData3;
			// listaInterseccionesBloqueadas = initData4;
        */
        this.initState();
    }

    /**
     * This method clones the state of the agent. It's used in the search
     * process, when creating the search tree.
     */
    @Override
    public SearchBasedAgentState clone() {
        
		//TODO: Complete Method
		
        return null;
    }

    /**
     * This method is used to update the Agent State when a Perception is
     * received by the Simulator.
     */
    @Override
    public void updateState(Perception p) {
        
        //TODO: Complete Method
    }

    /**
     * This method is optional, and sets the initial state of the agent.
     */
    @Override
    public void initState() {
        
	//TODO: Complete Method

    }

    /**
     * This method returns the String representation of the agent state.
     */
    @Override
    public String toString() {
        String str = "";

        //TODO: Complete Method

        return str;
    }

    /**
     * This method is used in the search process to verify if the node already
     * exists in the actual search.
     */
    @Override
    public boolean equals(Object obj) {
       
       //TODO: Complete Method
        
        return true;
    }

    //TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
   	
    public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
     public ArrayList<Interseccion> getListaDestinos(){
        return listaDestinos;
     }
     public void setListaDestinos(ArrayList<Interseccion> arg){
        listaDestinos = arg;
     }
     public Mapa getmapa(){
        return mapa;
     }
     public void setmapa(Mapa arg){
        mapa = arg;
     }
     public Interseccion getposicionActual(){
        return posicionActual;
     }
     public void setposicionActual(Interseccion arg){
        posicionActual = arg;
     }
     public ArrayList<Interseccion> getlistaIntersecciones(){
        return listaIntersecciones;
     }
     public void setlistaIntersecciones(ArrayList<Interseccion> arg){
        listaIntersecciones = arg;
     }
     public ArrayList<Interseccion> getlistaInterseccionesBloqueadas(){
        return listaInterseccionesBloqueadas;
     }
     public void setlistaInterseccionesBloqueadas(ArrayList<Interseccion> arg){
        listaInterseccionesBloqueadas = arg;
     }
	
}

