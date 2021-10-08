package ar.edu.unlam.pb2.gestionFacultad;

public class Persona {
	private String nombrePersona;
	private String apellido;
	private Integer id;
	private String estadoCivil;
	
	public Persona(String nombrePersona, String apellido, Integer id, String estadoCivil) {
		this.nombrePersona = nombrePersona;
		this.apellido = apellido;
		this.id = id;
		this.estadoCivil = estadoCivil;
	}
	
	public void cambiarEstadoCivil(Integer identificador,String nuevoEstado){
		if(id.equals(identificador)) {
			this.estadoCivil=nuevoEstado;
		}		
	}
	
	@Override
	public String toString() {
		return "Persona [nombrePersona=" + getNombrePersona() + ", apellido=" + getApellido() + ", id=" +getId() + ", estadoCivil="
				+ getEstadoCivil()+ "]";
	}

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

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
