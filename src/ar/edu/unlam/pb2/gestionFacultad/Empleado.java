package ar.edu.unlam.pb2.gestionFacultad;

public class Empleado extends Persona {
	private Integer anioIngreso;
	private Integer nroDespacho;
	
	public Empleado(String nombre, String apellido, Integer dni, String estadoCivil, Integer anioIngreso,
			Integer nroDespacho) {
		super(nombre, apellido, dni, estadoCivil);
		this.anioIngreso = anioIngreso;
		this.nroDespacho = nroDespacho;
	}

			
	@Override
	public void cambiarEstadoCivil(Integer dni,String nuevoEstado){
		super.cambiarEstadoCivil(dni, nuevoEstado);
				
	}
		
	@Override
	public String MostarInformacion(){
		return "Nombre= "+ super.getNombre() + ", Apellido=" + super.getApellido() + ", Dni= " + super.getDni()
	    + ",Estado_Civil= " + super.getEstadoCivil()+", Año_Ingreso= " + getAnioIngreso() + ", Numero_Despacho= " + getNroDespacho();
	}

	public Integer getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(Integer anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	public Integer getNroDespacho() {
		return nroDespacho;
	}

	public void setNroDespacho(Integer nroDespacho) {
		this.nroDespacho= nroDespacho;
	}
	
	
	
	

}
