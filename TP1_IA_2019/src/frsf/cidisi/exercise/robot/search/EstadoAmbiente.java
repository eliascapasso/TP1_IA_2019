package frsf.cidisi.exercise.robot.search;

import java.util.ArrayList;
import java.util.Collection;

import dominio.Interseccion;
import dominio.Mapa;
import dominio.Cuadra;
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
    private ArrayList<Cuadra> listaCuadrasBloqueadas;
	
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
    	//Solo se obtiene el mapa ya que en el estado del agente se lo crea
    	this.mapa = Mapa.getMapa();
    	
    	this.posicionAgente = Mapa.posicionOrigenAgente;
    	
    	this.listaSupermercados = Mapa.listaDestinos;
    	
    	this.listaCuadrasBloqueadas = Mapa.listaCuadrasBloqueadas;
    }

    /**
     * String representation of the real world state.
     */
    @Override
    public String toString() {
        String str = "";

        str += "Estado del Ambiente:\n";
        
        str += "Posicion del agente: ";
        str = posicionAgente.toString();

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

	public ArrayList<Cuadra> getListaCuadrasBloqueadas() {
		return listaCuadrasBloqueadas;
	}

	public void setListaCuadrasBloqueadas(
			ArrayList<Cuadra> listaCuadrasBloqueadas) {
		this.listaCuadrasBloqueadas = listaCuadrasBloqueadas;
	}
}

