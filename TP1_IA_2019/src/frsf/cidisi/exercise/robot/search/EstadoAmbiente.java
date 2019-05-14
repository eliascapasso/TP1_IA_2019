package frsf.cidisi.exercise.robot.search;

import java.util.ArrayList;

import dominio.Interseccion;
import dominio.Mapa;
import dominio.Producto;
import dominio.Supermercado;
import frsf.cidisi.faia.state.EnvironmentState;

/**
 * This class represents the real world state.
 */
public class EstadoAmbiente extends EnvironmentState {
	
	//TODO: Setup Variables
    private Mapa mapa;
    private Interseccion posicionAgente;
    private ArrayList<Supermercado> listaSupermercados;
    private ArrayList<Interseccion> listaInterseccionesBloqueadas;
    private ArrayList<Producto> listaPromociones;
	
    public EstadoAmbiente() {
        
			 mapa = new Mapa();
			 posicionAgente = new Interseccion();
			 listaSupermercados = new ArrayList<Supermercado>();
        
        this.initState();
    }

    /**
     * This method is used to setup the initial real world.
     */
    @Override
    public void initState() {

        //TODO: Complete Method
    }

    /**
     * String representation of the real world state.
     */
    @Override
    public String toString() {
        String str = "";

        //TODO: Complete Method

        return str;
    }

	public Mapa getMapa() {
		return mapa;
	}

	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}

	public Interseccion getPosicionAgente() {
		return posicionAgente;
	}

	public void setPosicionAgente(Interseccion posicionAgente) {
		this.posicionAgente = posicionAgente;
	}

	public ArrayList<Supermercado> getListaSupermercados() {
		return listaSupermercados;
	}

	public void setListaSupermercados(ArrayList<Supermercado> listaSupermercados) {
		this.listaSupermercados = listaSupermercados;
	}

	public ArrayList<Interseccion> getListaInterseccionesBloqueadas() {
		return listaInterseccionesBloqueadas;
	}

	public void setListaInterseccionesBloqueadas(
			ArrayList<Interseccion> listaInterseccionesBloqueadas) {
		this.listaInterseccionesBloqueadas = listaInterseccionesBloqueadas;
	}

	public ArrayList<Producto> getListaPromociones() {
		return listaPromociones;
	}

	public void setListaPromociones(ArrayList<Producto> listaPromociones) {
		this.listaPromociones = listaPromociones;
	}
	
}

