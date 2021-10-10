package ar.edu.unlam.pb2.gestionFacultad;

import java.util.Arrays;

public class Estudiante extends Persona {
	private Curso[]cursos;
	private Integer cantidadDeMateriasPorAlumno=10;
	private Integer cantidadDeMateriasInscriptas;

	public Estudiante(String nombrePersona, String apellido, Integer id, String estadoCivil) {
		super(nombrePersona, apellido, id, estadoCivil);
		this.cursos=new Curso[cantidadDeMateriasPorAlumno];
		this.cantidadDeMateriasInscriptas=0;
	}

/*  Estoy terminando este metodo porque me tira error
	public void registrarACurso(Curso nuevoCurso) {
		//cursos[cantidadDeMateriasInscriptas++] = nuevoCurso;
		System.out.println(""+nuevoCurso);
		for (int i = 0; i < cantidadDeMateriasInscriptas; i++) {
				cursos[i] = nuevoCurso;
				cantidadDeMateriasInscriptas++;
				
			}
	
	}
	
	public Curso[] obtenerListadoDeCursosInscriptos(String programacion) {
		Curso resultado[] = new Curso[cantidadDeMateriasPorAlumno];
		Integer cantidadDeCursosAgregadasAlListado= 0;

		for (int i = 0; i < cantidadDeMateriasInscriptas; i++) {
			if (cursos[i].getNombreCurso().equals(programacion)) {
				resultado[cantidadDeCursosAgregadasAlListado++] = cursos[i];
			}
		}
		return resultado;
	}*/
		

	@Override
	public void cambiarEstadoCivil(Integer identificador,String nuevoEstado){
		super.cambiarEstadoCivil(identificador, nuevoEstado);
				
	}

	@Override
	public String toString() {
		return "Estudiante [cursos=" + Arrays.toString(cursos) + ", NombrePersona=" + super.getNombrePersona()
				+ ", Apellido=" + super.getApellido() + ", Id=" + super.getId() + ", EstadoCivil=" + super.getEstadoCivil()
				+ "]";
	}

	public Curso[] getCursos() {
		return cursos;
	}

	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}
	
	
}
