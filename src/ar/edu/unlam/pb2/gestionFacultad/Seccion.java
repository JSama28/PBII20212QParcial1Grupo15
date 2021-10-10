package ar.edu.unlam.pb2.gestionFacultad;

public class Seccion {
	private String nombreSeccion;
	private Personal[] personal;
	private static int cantidadSeccion=0;
	
	public Seccion(String nombreSeccion) {
		this.nombreSeccion = nombreSeccion;
		this.cantidadSeccion++;
	}
	
	
	public void cambiarDeSeccionElPersonal() {
		
	}

	
	public String getNombreSeccion() {
		return nombreSeccion;
	}

	public void setNombreSeccion(String nombreSeccion) {
		this.nombreSeccion = nombreSeccion;
	}

	public Personal[] getPersonal() {
		return personal;
	}

	public void setPersonal(Personal[] personal) {
		this.personal = personal;
	}

	public static int getCantidadSeccion() {
		return cantidadSeccion;
	}
	
	
	
	

}
