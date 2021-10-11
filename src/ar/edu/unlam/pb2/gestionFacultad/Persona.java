package ar.edu.unlam.pb2.gestionFacultad;

public class Persona {
	private String nombre;
	private String apellido;
	private Integer dni;
	private String estadoCivil;
	
	public Persona(String nombre, String apellido, Integer dni, String estadoCivil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.estadoCivil = estadoCivil;
	}

	public void cambiarEstadoCivil(Integer dni,String nuevoEstado){
		if(this.dni==dni) {
			this.estadoCivil=nuevoEstado;
		}	
	}
	
	public String mostrarInformacion() {
		return "Nombre=" + getNombre() + ", Apellido=" + getApellido() + ", Dni=" +getDni() + ", Estado_Civil="+ getEstadoCivil();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
