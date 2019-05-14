package dominio;

import java.util.ArrayList;

public class Mapa {
	private ArrayList<Interseccion> listaIntersecciones;
	private ArrayList<Calle> listaCalles;
	
	public Mapa() {
		super();
		this.listaIntersecciones = new ArrayList<Interseccion>();
		this.listaCalles = new ArrayList<Calle>();
	}
	public ArrayList<Interseccion> getListaIntersecciones() {
		return listaIntersecciones;
	}
	public void setListaIntersecciones(ArrayList<Interseccion> listaIntersecciones) {
		this.listaIntersecciones = listaIntersecciones;
	}
	public ArrayList<Calle> getListaCalles() {
		return listaCalles;
	}
	public void setListaCalles(ArrayList<Calle> listaCalles) {
		this.listaCalles = listaCalles;
	}
	
	public void init(){
		//TODO: Cargar lista de intersecciones y calles
	}
}
