package ar.edu.unlam.pb2.gestionFacultad;

import java.util.Arrays;

public class Estudiante extends Persona {
	private Curso[]cursos;
	private Facultad facultad;
	private Integer cantidadDeMateriasPorAlumno=9;
	private Integer cantidadDeMateriasInscriptas;
	private static int cantidadEstudiantes=0;
	
	public Estudiante(String nombrePersona, String apellido, Integer dni, String estadoCivil) {
		super(nombrePersona, apellido, dni, estadoCivil);
		this.cursos=new Curso[cantidadDeMateriasPorAlumno];
		this.cantidadDeMateriasInscriptas=0;
		cantidadEstudiantes++;
	}

	/*revisar*/
	public void registrarseACurso(Integer dni, Curso nuevoCurso) {
		for (int i = 0; i <cursos.length; i++) {
			for(int j=0;j<facultad.getCantidadDeCursos();j++) {
			    if(this.cursos[i] != null) {
			      if(facultad.getCursos().equals(nuevoCurso)) {
			         if(super.getDni().equals(dni)) {
				this.cursos[i] = nuevoCurso;
				return;
			         
			  }
		   }
		}
	  }
	}
  }		

	@Override
	public void cambiarEstadoCivil(Integer dni,String nuevoEstado){
		super.cambiarEstadoCivil(dni, nuevoEstado);
				
	}

	@Override
	public String MostarInformacion(){ 
		return "Nombre=" + super.getNombre()+ ", Apellido=" + super.getApellido() + ", Dni=" + super.getDni() + ", Estado_Civil=" + super.getEstadoCivil();
	}

	public Curso[] getCursos() {
		return cursos;
	}

	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}
	
	public static int getCantidadEstudiantes() {
		return cantidadEstudiantes;
	}
	
	
}
