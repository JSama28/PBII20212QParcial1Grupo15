package ar.edu.unlam.pb2.gestionFacultad;

public class Facultad {
	private String nombre;
	private Estudiante[]estudiantes;
	private Profesor[]profesores;
	private Personal[]personalDeServicios;
	private Curso[]cursos;
	private Integer cantidadDeCursos;
	private Integer cantidadDeEstudiantes;
	private Integer cantidadDeProfesores;
	private Integer cantidadDePersonalDeServicio;
	
	public Facultad(String nombre,Integer cantidadDeEstudiantes,Integer cantidadDeProfesores,Integer cantidadDePersonalDeServicio,Integer cantidadDeCursos){
		this.estudiantes = new Estudiante[cantidadDeEstudiantes];
		this.profesores = new Profesor[cantidadDeProfesores];
		this.personalDeServicios = new Personal[cantidadDePersonalDeServicio];
		this.cursos=new Curso[cantidadDeCursos];
		
	}
	
	/*********Dar alta*********/
	public void DarAltaCurso(Curso nuevoCurso) {
		for(int i = 0; i <= this.cursos.length; i++) {
			if(this.cursos[i] == null) {
				this.cursos[i] = nuevoCurso;
				return ;
			}
		}	
	}
	
	public void DarAltaEstudiante(Estudiante nuevoEstudiante) {
		for(int i = 0; i <= this.estudiantes.length; i++) {
			if(this.estudiantes[i] == null) {
				this.estudiantes[i] = nuevoEstudiante;
				return ;
			}
		}	
	}
	
	public void DarAltaProfesor(Profesor nuevoProfesor) {
		for(int i = 0; i <= this.profesores.length; i++) {
			if(this.profesores[i] == null) {
				this.profesores[i] = nuevoProfesor;
				return;
			}
		}	
	}
	
	public void DarAltaPersonal(Personal nuevoPersonal) {
		for(int i = 0; i <= this.personalDeServicios.length; i++) {
			if(this.personalDeServicios[i] == null) {
				this.personalDeServicios[i] = nuevoPersonal;
				return;
			}
		}	
	}
	
	
	/***********Dar baja*************/
	public void DarBajaEstudiante(Integer dni) {
		for(int i=0;i<estudiantes.length;i++) {
			if(dni==null){
				System.out.println("No hay archivos cargados");
			}else
			if(estudiantes[i].getDni().equals(dni)) {
				estudiantes[i]=null;
				return;
			}
		}
	}
	
	public void DarBajaProfesor(Integer dni) {
		for(int i=0;i<profesores.length;i++) {
			if(dni==null){
				System.out.println("No hay archivos cargados");
			}else
			 if(profesores[i].getDni().equals(dni)) {
				profesores[i]=null;
				return;
			}
		}
	}
	
	public void DarBajaPersonal(Integer dni) {
		for(int i=0;i<personalDeServicios.length;i++) {
		  if(dni==null){
				System.out.println("No hay archivos cargados");
			}else
			if(personalDeServicios[i].getDni().equals(dni)) {
				personalDeServicios[i]=null;
				return;
			}
		}
	}
	
	/*********cambiar de despacho a personal***********/
	public void resignarDespachoAPersonal(Integer dni, Integer nuevoNumeroDespacho) {
		for(int i=0;i<personalDeServicios.length;i++) {
			  if(personalDeServicios[i].getDni().equals(dni)) {
				  personalDeServicios[i].setNro_despacho(nuevoNumeroDespacho);
		  }
	   }
	}

	/**************cambiar profesor de departamento**********/
	public void cambioDeLugarDeTrabajo(Integer dni, Departamento nuevoDepartamento) {
		for(int i=0;i<profesores.length;i++) {
		  if(profesores[i].getDni().equals(dni)) {
			 profesores[i].setDepartamento(nuevoDepartamento);
		  }
		}	
	  }

	/**************cambiar personal de una seccion**********/
	public void cambiarDeLugarUnPersonalDeServicio(Integer dni,Seccion nuevaSeccion) {
		for(int i=0;i<personalDeServicios.length;i++) {
			  if(personalDeServicios[i].getDni().equals(dni)) {
				  personalDeServicios[i].setSeccion(nuevaSeccion);
		  }
		}
	  }
	
    public Estudiante[] getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Profesor[] getProfesores() {
		return profesores;
	}

	public void setProfesores(Profesor[] profesores) {
		this.profesores = profesores;
	}

	public Personal[] getPersonalDeServicios() {
		return personalDeServicios;
	}

	public void setPersonalDeServicios(Personal[] personalDeServicios) {
		this.personalDeServicios = personalDeServicios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Curso[] getCursos() {
		return cursos;
	}

	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}

	public Integer getCantidadDeCursos() {
		return cantidadDeCursos;
	}

	public void setCantidadDeCursos(Integer cantidadDeCursos) {
		this.cantidadDeCursos = cantidadDeCursos;
	}

	public Integer getCantidadDeEstudiantes() {
		return cantidadDeEstudiantes;
	}

	public void setCantidadDeEstudiantes(Integer cantidadDeEstudiantes) {
		this.cantidadDeEstudiantes = cantidadDeEstudiantes;
	}

	public Integer getCantidadDeProfesores() {
		return cantidadDeProfesores;
	}

	public void setCantidadDeProfesores(Integer cantidadDeProfesores) {
		this.cantidadDeProfesores = cantidadDeProfesores;
	}

	public Integer getCantidadDePersonalDeServicio() {
		return cantidadDePersonalDeServicio;
	}

	public void setCantidadDePersonalDeServicio(Integer cantidadDePersonalDeServicio) {
		this.cantidadDePersonalDeServicio = cantidadDePersonalDeServicio;
	}



}
