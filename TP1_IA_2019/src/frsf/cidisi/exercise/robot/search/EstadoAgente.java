package frsf.cidisi.exercise.robot.search;

import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;

/**
 * Represent the internal state of the Agent.
 */
public class EstadoAgente extends SearchBasedAgentState {
	
	//TODO: Setup Variables
    private String destino;
    //private Other mapa;
    private int posicionActual;
    private int listaIntersecciones;
    private int listaInterseccionesBloqueadas;
	

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
   	
     public String getdestino(){
        return destino;
     }
     public void setdestino(String arg){
        destino = arg;
     }
//     public Other getmapa(){
//        return mapa;
//     }
//     public void setmapa(Other arg){
//        mapa = arg;
//     }
     public int getposicionActual(){
        return posicionActual;
     }
     public void setposicionActual(int arg){
        posicionActual = arg;
     }
     public int getlistaIntersecciones(){
        return listaIntersecciones;
     }
     public void setlistaIntersecciones(int arg){
        listaIntersecciones = arg;
     }
     public int getlistaInterseccionesBloqueadas(){
        return listaInterseccionesBloqueadas;
     }
     public void setlistaInterseccionesBloqueadas(int arg){
        listaInterseccionesBloqueadas = arg;
     }
	
}

