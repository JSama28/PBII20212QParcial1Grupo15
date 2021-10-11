package ar.edu.unlam.pb2.gestionFacultad;

public class Profesor extends Empleado {
	private Departamento departamentos;
	private static int cantidadProfesores=0;
	

	public Profesor(String nombre, String apellido, Integer dni, String estadoCivil, Integer anioIngreso,
			Integer nroDespacho) {
		super(nombre, apellido, dni, estadoCivil, anioIngreso, nroDespacho);
		cantidadProfesores++;
	}
	

	@Override
	public void cambiarEstadoCivil(Integer dni,String nuevoEstado){
		super.cambiarEstadoCivil(dni, nuevoEstado);
				
	}
	
	@Override
	public String mostrarInformacion(){
		return super.mostrarInformacion() + "\nDepartamento: " + getDepartamentos().getNombreDepartamento();
	}

	public Departamento getDepartamentos() {
		return departamentos;
	}


	public void setDepartamentos(Departamento departamentos) {
		this.departamentos = departamentos;
	}


	public static int getCantidadProfesores() {
		return cantidadProfesores;
	}

}
