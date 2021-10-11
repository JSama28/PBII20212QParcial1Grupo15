package ar.edu.unlam.pb2.gestionFacultad;

public class Personal extends Empleado {
	private Seccion seccion;

	public Personal(String nombre, String apellido, Integer dni, String estadoCivil, Integer anioIngreso, Integer nro_despacho, Seccion seccion) {
		super(nombre, apellido, dni, estadoCivil, anioIngreso, nro_despacho);
		this.seccion=seccion;
	}
	
	@Override
	public String mostrarInformacion() {
		return "Nombre=" + super.getNombre()+ ", Apellido=" + super.getApellido() + ", Dni=" + super.getDni() + ", Estado_Civil=" + super.getEstadoCivil()+ ", A�o_Ingreso=" + super.getAnioIngreso() +", Numero_Despacho=" + super.getNro_despacho()+",Seccion=" +getSeccion();
	}

	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}
	
}
