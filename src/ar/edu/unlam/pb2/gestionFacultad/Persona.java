package ar.edu.unlam.pb2.gestionFacultad;

public class Persona {
	private String nombrePersona;
	private String apellido;
	private Integer id;
	private Boolean estadoCivil= false;
	
	public Persona(){
		
	}
	
	public Boolean cambiarEstadoCivil() {
		return false;
	}
	
	public void mostarDatos() {}

	
	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(Boolean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
	

}
