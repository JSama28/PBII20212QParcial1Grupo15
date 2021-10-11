package ar.edu.unlam.pb2.gestionFacultad;

public class Profesor extends Empleado {
	private Departamento departamentos;
	private static int cantidadProfesores=0;
	

	public Profesor(String nombre, String apellido, Integer dni, String estadoCivil, Integer anioIngreso,
			Integer nroDespacho) {
		super(nombre, apellido, dni, estadoCivil, anioIngreso, nroDespacho);
		this.departamentos =departamentos;
		this.cantidadProfesores++;

	}
	

	@Override
	public void cambiarEstadoCivil(Integer dni,String nuevoEstado){
		super.cambiarEstadoCivil(dni, nuevoEstado);
				
	}
	
	@Override
	public String mostrarInformacion(){
		return "Nombre=" + super.getNombre()+ ", Apellido=" + super.getApellido() + ", Dni=" + super.getDni()+ ", Estado_Civil=" + super.getEstadoCivil()+", Año_Ingreso=" + super.getAnioIngreso()
				+ ", Numero_Despacho=" + super.getNroDespacho();
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
