package ar.edu.unlam.pb2.gestionFacultad;

public class Estudiante extends Persona {
	private Curso[]cursosInscriptos;
	private Facultad facultad;
	private Integer cantidadDeMateriasPorAlumno=9;
	private Integer cantidadDeMateriasInscriptas;
	private static int cantidadEstudiantes=0;

	public Estudiante(String nombre, String apellido, Integer dni, String estadoCivil) {
		super(nombre, apellido, dni, estadoCivil);
		this.cursosInscriptos=new Curso[cantidadDeMateriasPorAlumno];
		this.cantidadDeMateriasInscriptas=0;
		cantidadEstudiantes++;
	}

	/*revisar*/
	public void registrarseACurso(Integer dni, Curso nuevoCurso) {
		for (int i = 0; i <cursosInscriptos.length; i++) {
			for(int j=0;j<facultad.getCantidadDeCursos();j++) {
			    if(this.cursosInscriptos[i] != null) {
			      if(facultad.getCursos().equals(nuevoCurso)) {
			         if(super.getDni().equals(dni)) {
				this.cursosInscriptos[i] = nuevoCurso;
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
		return cursosInscriptos;
	}

	public void setCursos(Curso[] cursosInscriptos) {
		this.cursosInscriptos = cursosInscriptos;
	}
	

	public static int getCantidadEstudiantes() {
		return cantidadEstudiantes;
	}
	
	
}
