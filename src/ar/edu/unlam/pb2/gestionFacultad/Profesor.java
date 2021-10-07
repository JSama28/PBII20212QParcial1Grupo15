package ar.edu.unlam.pb2.gestionFacultad;

public class Profesor extends Empleado {
	private Departamento departamentos;

	public Profesor() {
		super();
	}
	
	@Override
	public Boolean cambiarEstadoCivil() {
		return false;
	}
	
	@Override
	public void mostarDatos() {}

	public Departamento getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamento departamentos) {
		this.departamentos = departamentos;
	}
	
}
