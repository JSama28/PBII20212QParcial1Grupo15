package ar.edu.unlam.pb2.gestionFacultad;

public class Departamento {
	private String nombreDepartamento;
	private Profesor[] profesores;
	private static int cantidadDepartamento=0;
	
	public Departamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
		this.profesores=new Profesor[Profesor.getCantidadProfesor()];
		this.cantidadDepartamento++;
	}

	
	public void cambiarDepartamentoAProfesor(){
		
	}

	
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

	public static int getCantidadDepartamento() {
		return cantidadDepartamento;
	}

	public static void setCantidadDepartamento(int cantidadDepartamento) {
		Departamento.cantidadDepartamento = cantidadDepartamento;
	}
	
	
	

}
