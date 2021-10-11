package ar.edu.unlam.pb2.gestionFacultad;

public class Personal extends Empleado {
	private Seccion secciones;
	private static int cantidadPersonales=0;
	
	public Personal(String nombre, String apellido, Integer dni, String estadoCivil, Integer anioIngreso,
		Integer nroDespacho, Seccion secciones) {
		super(nombre, apellido, dni, estadoCivil, anioIngreso, nroDespacho);
		this.secciones=secciones;
		cantidadPersonales++;

	}

	@Override
	public void cambiarEstadoCivil(Integer dni,String nuevoEstado){
		super.cambiarEstadoCivil(dni, nuevoEstado);
				
	}
	
	@Override
	public String mostrarInformacion() {
		return "\nNombre: " + super.getNombre()+ "\nApellido: " + super.getApellido() + "\nDni: " + super.getDni() + "\nEstado_Civil: " + super.getEstadoCivil()+ "\nAnio_Ingreso: " + super.getAnioIngreso() +"\nNumero_Despacho: " + super.getNroDespacho()+"\nSeccion: " + getSecciones().getNombreSeccion() + "\n";
	}

	public Seccion getSecciones() {
		return secciones;

	}

	public void setSecciones(Seccion secciones) {
		this.secciones = secciones;
	}

	public static int getCantidadPersonales() {
		return cantidadPersonales;
	}
	
}
