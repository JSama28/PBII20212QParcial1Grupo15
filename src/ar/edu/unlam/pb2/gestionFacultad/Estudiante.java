package ar.edu.unlam.pb2.gestionFacultad;

import java.util.ArrayList;

public class Estudiante extends Persona {
	private ArrayList<Curso> cursos;
	
	public Estudiante(String nombrePersona, String apellido, Integer dni, String estadoCivil) {
		super(nombrePersona, apellido, dni, estadoCivil);
		cursos = new ArrayList<Curso>();
	}

	public void registrarseACurso(Curso nuevoCurso) {
		 cursos.add(nuevoCurso);
	}		

	@Override
	public String mostrarInformacion(){ 
		return "Nombre=" + super.getNombre()+ ", Apellido=" + super.getApellido() + ", Dni=" + super.getDni() + ", Estado_Civil=" + super.getEstadoCivil();
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	
}
