package ar.edu.unlam.pb2.gestionFacultad;

public class Estudiante extends Persona {
	private Curso cursos;

	public Estudiante() {
		super();
	}
	
	public void inscribirseACurso() {}
	
	@Override
	public Boolean cambiarEstadoCivil() {
		return false;
	}
	
	@Override
	public void mostarDatos() {}

	
	public Curso getCursos() {
		return cursos;
	}

	public void setCursos(Curso cursos) {
		this.cursos = cursos;
	}
	
	
}
