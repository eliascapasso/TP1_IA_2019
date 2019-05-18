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
	
	public void agregarInterseccion(Interseccion interseccion){
		listaIntersecciones.add(interseccion);
	}
	
	public Interseccion buscarInterseccionPorId(int id){
		for(Interseccion i: listaIntersecciones)
			if(i.getIdInterseccion() == id)
				return i;
		return null;
	}
	
	public void agregarCuadra(Cuadra cuadra){
		listaCuadras.add(cuadra);
	}
	
	public Cuadra buscarCuadra(Interseccion origen, Interseccion destino){
		for(Cuadra c: this.getListaCuadras()){
			if(c.getOrigen().equals(origen)&&c.getDestino().equals(destino))
				return c;
		}
		return null;
		
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
		return Mapa.listaCuadrasBloqueadas;
	}

	public static void setListaCuadrasBloqueadas(ArrayList<Cuadra> listaCuadrasBloqueadas) {
		Mapa.listaCuadrasBloqueadas = listaCuadrasBloqueadas;
	}

	public static Mapa crearMapa(){
		
		/////////// MAPA //////////
		mapa = importarExcel("Datos/Zona costanera.csv"); 
		
		/////////// POSICION AGENTE //////////
		posicionOrigenAgente = mapa.buscarInterseccionPorId(1);
		
		/////////// SUPERMERCADOS //////////
		Supermercado alvear = new Supermercado();
    	alvear.setNombre("alvear");
    	alvear.setUbicacion(new Interseccion(85 ,"Av. Gral. Paz, Estaninlao Zeballos"));
    	
    	Supermercado patricia = new Supermercado();
    	patricia.setNombre("patricia");
    	patricia.setUbicacion(new Interseccion(138 ,"Antonia Godoy, Angel Casanello"));
    	
    	Supermercado kilbel = new Supermercado();
    	kilbel.setNombre("kilbel");
    	kilbel.setUbicacion(new Interseccion(11 ,"Av. Gral. Paz, Javier de la Rosa"));
    	
    	/////////// PRODUCTOS SUPERMERCADOS //////////
    	ArrayList<Producto> productosAlvear = new ArrayList<Producto>();
    	productosAlvear.add(new Producto("p1", 5));
    	productosAlvear.add(new Producto("p2", 20));
    	productosAlvear.add(new Producto("p4", 80));
    	productosAlvear.add(new Producto("p6", 40));
    	alvear.setListaProductos(productosAlvear);
    	
    	ArrayList<Producto> productosPatricia = new ArrayList<Producto>();
    	productosPatricia.add(new Producto("p1", 10));
    	productosPatricia.add(new Producto("p5", 5));
    	productosPatricia.add(new Producto("p6", 40));
    	productosPatricia.add(new Producto("p9", 35));
    	patricia.setListaProductos(productosPatricia);
    	
    	ArrayList<Producto> productosKilbel = new ArrayList<Producto>();
    	productosKilbel.add(new Producto("p1", 12));
    	productosKilbel.add(new Producto("p3", 10));
    	productosKilbel.add(new Producto("p5", 15));
    	productosKilbel.add(new Producto("p7", 10));
    	productosKilbel.add(new Producto("p8", 10));
    	kilbel.setListaProductos(productosPatricia);
    	
    	/////////// PROMOCIONES SUPERMERCADOS//////////
		ArrayList<Producto> promocionesAlvear = new ArrayList<Producto>();
		promocionesAlvear.add(new Producto("p6", 30));
		alvear.setListaPromociones(promocionesAlvear);
		
		ArrayList<Producto> promocionesPatricia = new ArrayList<Producto>();
		promocionesPatricia.add(new Producto("p9", 30));
		patricia.setListaPromociones(promocionesPatricia);
		
		ArrayList<Producto> promocionesKilbel = new ArrayList<Producto>();
		promocionesKilbel.add(new Producto("p5", 5));
		kilbel.setListaPromociones(promocionesKilbel);
    	
    	listaDestinos.add(alvear);
    	listaDestinos.add(patricia);
		listaDestinos.add(kilbel);
		
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
				
				if (lectura[0].equals("I")) {//Interseccion
					//lectura[1]: id
					//lectura[2]: interseccion
					//lectura[3]: coordenada X
					//lectura[4]: coordenada X
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
				
					mapa.agregarCuadra(nuevaCuadra);
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return mapa;
	}
	
	@Override
	public Mapa clone(){
		Mapa mapa = new Mapa();
		mapa.setListaIntersecciones(listaIntersecciones);
		mapa.setListaCuadras(listaCuadras);
		
		return mapa;
	}
}
