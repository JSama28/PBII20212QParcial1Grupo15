package ar.edu.unlam.pb2.gestionFacultad;

public class Empleado extends Persona {
	private Integer anioIngreso;
	private Integer nro_despacho;
	private Integer legajo;
	
	public Empleado(String nombrePersona, String apellido, Integer id, String estadoCivil, Integer anioIngreso,
			  Integer nro_despacho,Integer legajo) {
			super(nombrePersona, apellido, id, estadoCivil);
			this.anioIngreso = anioIngreso;
			this.nro_despacho = nro_despacho;
			this.legajo=legajo;
		}
	

	public void resignarNuevoDespacho(Integer legajo,Integer nuevoDespacho){
		if(legajo.equals(legajo)) {
			this.nro_despacho=nuevoDespacho;
		}		
	}
	
	@Override//cambio el estado civil de un empleado
	public void cambiarEstadoCivil(Integer identificador,String nuevoEstado){
		super.cambiarEstadoCivil(identificador, nuevoEstado);
				
	}
		
	@Override//muestro los datos del objeto
	public String toString() {
		return "Empleado [anioIngreso= " + getAnioIngreso() + ", nro_despacho= " + getNro_despacho() +", legajo= " + getLegajo() + ", Nombre= "
				+ getNombrePersona() + ", Apellido=" + getApellido() + ", Id()= " + getId()
				+ ",EstadoCivil= " + getEstadoCivil() + "]";
	}
   
	
	public Integer getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(Integer anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	public Integer getNro_despacho() {
		return nro_despacho;
	}

	public void setNro_despacho(Integer nro_despacho) {
		this.nro_despacho = nro_despacho;
	}


	public Integer getLegajo() {
		return legajo;
	}


	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	
	
	
	
	
	

}
