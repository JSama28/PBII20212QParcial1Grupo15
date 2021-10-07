package ar.edu.unlam.pb2.gestionFacultad;

public class Departamento {
	private String nombreDepartamento;
	private Profesor[] profesores;
	
	public Departamento() {
		
	}
	
	public void cambiarDepartamentoAProfesor(){}

	
	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public Profesor[] getProfesores() {
		return profesores;
	}

	public void setProfesores(Profesor[] profesores) {
		this.profesores = profesores;
	}
	
	
	

}
