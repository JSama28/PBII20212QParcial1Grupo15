package ar.edu.unlam.pb2.gestionFacultad;

public class Profesor extends Empleado {
	private Departamento departamento;	

	public Profesor(String nombre, String apellido, Integer dni, String estadoCivil, Integer anioIngreso,
			Integer nro_despacho) {
		super(nombre, apellido, dni, estadoCivil, anioIngreso, nro_despacho);
	}
	
	@Override
	public String mostrarInformacion(){
		return "Nombre=" + super.getNombre()+ ", Apellido=" + super.getApellido() + ", Dni=" + super.getDni()+ ", Estado_Civil=" + super.getEstadoCivil()+", A�o_Ingreso=" + super.getAnioIngreso()
				+ ", Numero_Despacho=" + super.getNro_despacho()+", Departamento=" +getDepartamento();
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
