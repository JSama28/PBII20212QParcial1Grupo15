package ar.edu.unlam.pb2.gestionFacultad;

public class Empleado extends Persona {
	private Integer anioIngreso;
	private Integer nro_despacho;
	
	public Empleado() {
		super();
	}
	
	public void resignarDespacho() {}
	
	@Override
	public Boolean cambiarEstadoCivil() {
		return false;
	}
	
	@Override
	public void mostarDatos() {}
   
	
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
	
	
	
	
	

}
