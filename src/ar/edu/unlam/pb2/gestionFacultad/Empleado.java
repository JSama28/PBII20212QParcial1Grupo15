package ar.edu.unlam.pb2.gestionFacultad;

public class Empleado extends Persona {
	private Integer anioIngreso;
	private Integer nro_despacho;
		
	public Empleado(String nombre, String apellido, Integer dni, String estadoCivil, Integer anioIngreso, Integer nro_despacho) {
		super(nombre, apellido, dni, estadoCivil);
		this.anioIngreso = anioIngreso;
		this.nro_despacho = nro_despacho;		
	}
		
	@Override//muestro los datos del objeto
	public String mostrarInformacion(){
		return "Nombre= "+ super.getNombre() + ", Apellido=" + super.getApellido() + ", Dni= " + super.getDni()
	    + ",Estado_Civil= " + super.getEstadoCivil()+", A�o_Ingreso= " + getAnioIngreso() + ", Numero_Despacho= " + getNro_despacho();
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

}
