package ar.edu.unlam.pb2.gestionFacultad;

public class Personal extends Empleado {
	private Seccion seccion;

	public Personal() {
		super();
	}
	
	@Override
	public Boolean cambiarEstadoCivil() {
		return false;
	}
	
	@Override
	public void mostarDatos() {}

	
	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}
	
	
	
}
