package frsf.cidisi.exercise.robot.search;

import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import java.util.ArrayList;

import dominio.Interseccion;
import dominio.Mapa;
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
    private ArrayList<Interseccion> listaIntersecciones;
    private ArrayList<Interseccion> listaInterseccionesBloqueadas;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Producto> listaPromociones;
	
	public EstadoAgente() {
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
        
    	//AgentePerception perception = (AgentePerception) p;
    }

    /**
     * This method is optional, and sets the initial state of the agent.
     */
    @Override
    public void initState() {
    	/////////// DESTINOS //////////
    	this.listaDestinos = new ArrayList<Supermercado>();
    	
    	Supermercado alvear = new Supermercado();
    	alvear.setNombre("alvear");
    	alvear.setUbicacion(new Interseccion(85 ,"Av. Gral. Paz, Estaninlao Zeballos"));
    	ArrayList<Producto> productosAlvear = new ArrayList<Producto>();
    	//productosAlvear.add(new Producto())
    	
    	Supermercado patricia = new Supermercado();
    	patricia.setNombre("patricia");
    	patricia.setUbicacion(new Interseccion(138 ,"Antonia Godoy, Angel Casanello"));
    	
    	Supermercado kilbel = new Supermercado();
    	kilbel.setNombre("kilbel");
    	kilbel.setUbicacion(new Interseccion(11 ,"Av. Gral. Paz, Javier de la Rosa"));
    	
    	this.listaDestinos.add(alvear);
    	this.listaDestinos.add(patricia);
    	this.listaDestinos.add(kilbel);
    	
    	/////////// UBICACION AGENTE //////////
    	
    	this.posicionActual = new Interseccion();
    	posicionActual.setIdInterseccion(100);
    	posicionActual.setNombreInterseccion("Antonia Godoy, Juan Castelli");
    	
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
	public ArrayList<Producto> getListaPromociones() {
		return listaPromociones;
	}

	public void setListaPromociones(ArrayList<Producto> listaPromociones) {
		this.listaPromociones = listaPromociones;
	}
     public ArrayList<Supermercado> getListaDestinos(){
        return listaDestinos;
     }
     public void setListaDestinos(ArrayList<Supermercado> arg){
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

