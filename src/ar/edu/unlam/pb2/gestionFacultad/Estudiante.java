package ar.edu.unlam.pb2.gestionFacultad;

import java.util.ArrayList;

public class Estudiante extends Persona {
	private ArrayList<Curso> cursos;
	
	public Estudiante(String nombre, String apellido, Integer dni, String estadoCivil) {
		super(nombre, apellido, dni, estadoCivil);
		cursos = new ArrayList<Curso>();
	}

	public void registrarseACurso(Curso nuevoCurso) {
		 cursos.add(nuevoCurso);
	}		

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;

	}
	
}
