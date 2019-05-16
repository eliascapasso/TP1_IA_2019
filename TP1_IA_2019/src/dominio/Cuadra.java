package dominio;

public class Cuadra {
	private String nombreCalle;
	private Interseccion origen;
	private Interseccion destino;
	public Cuadra() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cuadra(String nombreCalle, Interseccion origen, Interseccion destino) {
		super();
		this.nombreCalle = nombreCalle;
		this.origen = origen;
		this.destino = destino;
	}
	public Interseccion getOrigen() {
		return origen;
	}
	public void setOrigen(Interseccion origen) {
		this.origen = origen;
	}
	public Interseccion getDestino() {
		return destino;
	}
	public void setDestino(Interseccion destino) {
		this.destino = destino;
	}
	public String getNombreCalle() {
		return nombreCalle;
	}
	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}
	
}
