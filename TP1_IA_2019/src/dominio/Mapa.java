package dominio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Mapa {
	private ArrayList<Interseccion> listaIntersecciones;
	private ArrayList<Cuadra> listaCuadras;
	public static Mapa mapa;
	public static Interseccion posicionOrigenAgente;
	public static ArrayList<Supermercado> listaDestinos = new ArrayList<Supermercado>();
	public static ArrayList<Cuadra> listaCuadrasBloqueadas = new ArrayList<Cuadra>();
	
	public Mapa() {
		super();
		this.listaIntersecciones = new ArrayList<Interseccion>();
		this.listaCuadras = new ArrayList<Cuadra>();
	}
	
	public ArrayList<Interseccion> getListaIntersecciones() {
		return listaIntersecciones;
	}
	
	public void setListaIntersecciones(ArrayList<Interseccion> listaIntersecciones) {
		this.listaIntersecciones = listaIntersecciones;
	}
	
	public ArrayList<Cuadra> getListaCalles() {
		return listaCuadras;
	}
	
	public void setListaCalles(ArrayList<Cuadra> listaCalles) {
		this.listaCuadras = listaCalles;
	}
	
	public void agregarInterseccion(Interseccion interseccion){
		listaIntersecciones.add(interseccion);
	}
	
	public Interseccion buscarInterseccionPorId(int id){
		for(Interseccion i: listaIntersecciones)
			if(i.getIdInterseccion() == id)
				return i;
		return null;
	}
	
	public void agregarCalle(Cuadra calle){
		listaCuadras.add(calle);
	}
	
	public ArrayList<Cuadra> getListaCuadras() {
		return listaCuadras;
	}

	public void setListaCuadras(ArrayList<Cuadra> listaCuadras) {
		this.listaCuadras = listaCuadras;
	}

	public static Mapa getMapa() {
		return mapa;
	}

	public static void setMapa(Mapa mapa) {
		Mapa.mapa = mapa;
	}

	public static Interseccion getPosicionOrigenAgente() {
		return posicionOrigenAgente;
	}

	public static void setPosicionOrigenAgente(Interseccion posicionOrigenAgente) {
		Mapa.posicionOrigenAgente = posicionOrigenAgente;
	}

	public static ArrayList<Supermercado> getListaDestinos() {
		return listaDestinos;
	}

	public static void setListaDestinos(ArrayList<Supermercado> listaDestinos) {
		Mapa.listaDestinos = listaDestinos;
	}

	public static ArrayList<Cuadra> getListaCuadrasBloqueadas() {
		return listaCuadrasBloqueadas;
	}

	public static void setListaCuadrasBloqueadas(
			ArrayList<Cuadra> listaCuadrasBloqueadas) {
		Mapa.listaCuadrasBloqueadas = listaCuadrasBloqueadas;
	}

	public static Mapa crearMapa(){
		
		/////////// MAPA //////////
		mapa = importarExcel("");
		
		/////////// POSICION AGENTE //////////
		posicionOrigenAgente = mapa.buscarInterseccionPorId(100);
		
		/////////// SUPERMERCADOS //////////
		Supermercado alvear = new Supermercado();
    	alvear.setNombre("alvear");
    	alvear.setUbicacion(new Interseccion(85 ,"Av. Gral. Paz, Estaninlao Zeballos"));
    	ArrayList<Producto> productosAlvear = new ArrayList<Producto>();
    	productosAlvear.add(new Producto("p1", 5));
    	productosAlvear.add(new Producto("p2", 20));
    	productosAlvear.add(new Producto("p4", 80));
    	productosAlvear.add(new Producto("p6", 40));
		listaDestinos.add(alvear);
		
		Supermercado patricia = new Supermercado();
    	patricia.setNombre("patricia");
    	patricia.setUbicacion(new Interseccion(138 ,"Antonia Godoy, Angel Casanello"));
    	ArrayList<Producto> productosPatricia = new ArrayList<Producto>();
    	productosPatricia.add(new Producto("p1", 10));
    	productosPatricia.add(new Producto("p5", 5));
    	productosPatricia.add(new Producto("p6", 40));
    	productosPatricia.add(new Producto("p9", 35));
		listaDestinos.add(patricia);
		
		Supermercado kilbel = new Supermercado();
    	kilbel.setNombre("kilbel");
    	kilbel.setUbicacion(new Interseccion(11 ,"Av. Gral. Paz, Javier de la Rosa"));
    	ArrayList<Producto> productosKilbel = new ArrayList<Producto>();
    	productosKilbel.add(new Producto("p1", 12));
    	productosKilbel.add(new Producto("p3", 10));
    	productosKilbel.add(new Producto("p5", 15));
    	productosKilbel.add(new Producto("p7", 10));
    	productosKilbel.add(new Producto("p8", 10));
		listaDestinos.add(kilbel);
		
		/////////// PROMOCIONES //////////
		productosAlvear.add(new Producto("p6", 30));
		ArrayList<Producto> promocionesAlvear = new ArrayList<Producto>();
		alvear.setListaPromociones(promocionesAlvear);
		
		productosPatricia.add(new Producto("p9", 30));
		ArrayList<Producto> promocionesPatricia = new ArrayList<Producto>();
		alvear.setListaPromociones(promocionesPatricia);
		
		productosKilbel.add(new Producto("p5", 5));
		ArrayList<Producto> promocionesKilbel = new ArrayList<Producto>();
		alvear.setListaPromociones(promocionesKilbel);
		
		/////////// CUADRAS BLOQUEADAS //////////
		listaCuadrasBloqueadas.add(new Cuadra("Javier de la Rosa", new Interseccion(11, "Av. Gral. Paz, Javier de la Rosa"), new Interseccion(1, "Av. Gral. Paz, Regimiento 12 de infantería")));
		
		return mapa;
	}
	
	public static Mapa importarExcel(String src){
		InputStream inputStream = null;
		BufferedReader br = null;
		String linea = "";
		String separadorLinea = ";";
		
		inputStream = Mapa.class.getClassLoader().getResourceAsStream(src);
		br = new BufferedReader(new InputStreamReader(inputStream ));
		Mapa mapa = new Mapa();
		try {
			while ((linea = br.readLine()) != null) {
				String[] lectura = linea.split(separadorLinea);
				
				if (lectura[0].equals("I")) {//Esquina
					//lectura[1]: id
					//lectura[2]: interseccion
					Interseccion nuevaInterseccion = new Interseccion(Integer.parseInt(lectura[1]),lectura[2]);
					//nuevaInterseccion.setDibujo(new Integer[]{Integer.parseInt(lectura[3]),Integer.parseInt(lectura[4])});
					
					mapa.agregarInterseccion(nuevaInterseccion);
				}
				else if(lectura[0].equals("C")) {//Cuadra
					//lectura[1]: nombre de la cuadra
					//lectura[2]: origen 
					//lectura[3]: destino 
					Interseccion origen = null;
					Interseccion destino = null;
					origen = mapa.buscarInterseccionPorId(Integer.parseInt(lectura[2]));
					destino = mapa.buscarInterseccionPorId(Integer.parseInt(lectura[3]));
					
					Cuadra nuevaCuadra = new Cuadra(lectura[1],
												origen, 
												destino);
				
					mapa.agregarCalle(nuevaCuadra);
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return mapa;
	}
}
