package dominio;

public class Interseccion {
	private int idInterseccion;
	private String nombreInterseccion;
	public Interseccion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Interseccion(int idInterseccion, String nombreInterseccion) {
		super();
		this.idInterseccion = idInterseccion;
		this.nombreInterseccion = nombreInterseccion;
	}

	public int getIdInterseccion() {
		return idInterseccion;
	}
	public void setIdInterseccion(int idInterseccion) {
		this.idInterseccion = idInterseccion;
	}
	public String getNombreInterseccion() {
		return nombreInterseccion;
	}
	public void setNombreInterseccion(String nombreInterseccion) {
		this.nombreInterseccion = nombreInterseccion;
	}
	
	public String toString() {
        return this.idInterseccion + " - " + this.nombreInterseccion;
    } 
}
