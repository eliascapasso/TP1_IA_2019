package dominio;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private ArrayList<Producto> listaProductos;
	private Interseccion ubicacion;
	
	public Supermercado() {
		super();;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public Interseccion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Interseccion ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	
}
