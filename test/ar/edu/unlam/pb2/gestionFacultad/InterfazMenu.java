package ar.edu.unlam.pb2.gestionFacultad;

import java.util.Scanner;

public class InterfazMenu {
	 
	private static Facultad facultad;
	private static Scanner teclado = new Scanner(System.in);
	private static final Integer CANTIDAD_ESTUDIANTES = 10;
	private static final Integer CANTIDAD_PROFESORES = 4;
	private static final Integer CANTIDAD_PERSONAL = 4;
	private static final Integer CANTIDAD_CURSOS=2;
	private static final int SALIR = 99;
	
	public static void main(String[] args) {
		
		facultad = new Facultad("UNLAM",CANTIDAD_ESTUDIANTES,CANTIDAD_PROFESORES,CANTIDAD_PERSONAL,CANTIDAD_CURSOS);
		manejadorInterfaz();
		
		
	}
	
	private static void manejadorInterfaz() {
		int opcionIngresada=0;
		
		do {
			mostrarMenuOpciones();
			opcionIngresada = teclado.nextInt();
			ejecutarMenu(opcionIngresada);
		}while(opcionIngresada!=SALIR);
	}
	
	private static void mostrarMenuOpciones() {
		System.out.println("**************** Menu de opciones ****************");
		System.out.println("1. Ingresar Estudiante:");
		System.out.println("2. Ingresar Profesor:");
		System.out.println("3. Ingresar Personal de Servicios:");
		System.out.println("4. Borrar Estudiante:");
		System.out.println("5. Borrar Profesor:");
		System.out.println("6. Borrar Personal de Servicios:");
		System.out.println("7. Listar Estudiante:");
		System.out.println("8. Listar Profesor:");
	    System.out.println("9. Listar Personal de Servicios:");
		System.out.println("99. Salir");
		System.out.println("**************************************************");
	}

	private static void ejecutarMenu(int opcionSeleccionada) {
		switch(opcionSeleccionada){
		case 1:
			ingresarEstudiante();
			break;		
		case 4:
			borrarEstudiante();
			break;
		case 7 :
			listarEstudiante();
			
			break;
		case 2:
			ingresarProfesor();
			break;
		case 5:
			borrarProfesor();
			break;
		case 8:
			listarProfesor();
			break;
		case 3:
			ingresarPersonal();
			break;
		case 6:
			borrarPersonal();
			break;
		case 9:
			listarPersonal();
			break;	
		default:
			break;
		}
	}
	
	private static void ingresarEstudiante() {
		Estudiante nuevoEstudiante;
		
		Integer identificacion;
		String valorIngresado, nombre, apellido, estadoCivil;
		
		
			do {
				System.out.println("Ingrese Dni:");
				valorIngresado = teclado.next();
			}while(valorIngresado=="");
			
			identificacion = Integer.parseInt(valorIngresado);
			
			do {
				System.out.println("Ingrese nombre:");
				valorIngresado = teclado.next();
			}while(valorIngresado=="");
			
			nombre = valorIngresado;
			
			do {
				System.out.println("Ingrese apellido:");
				valorIngresado = teclado.next();
			}while(valorIngresado=="");
			
			apellido = valorIngresado;
			
			System.out.println("Ingrese estado civil:");
			valorIngresado = teclado.next();
			
			estadoCivil = valorIngresado;
			nuevoEstudiante = new Estudiante(nombre, apellido,identificacion,estadoCivil);
			
		        facultad.DarAltaEstudiante(nuevoEstudiante);
		        
			}
			
	   
		
	private static void borrarEstudiante() {
		Integer identificacion;
		String valorIngresado;
		System.out.println("Ingrese Dni para Borrar Estudiante:");
		valorIngresado = teclado.next();
		identificacion = Integer.parseInt(valorIngresado);
		facultad.DarBajaEstudiante(identificacion);
		
		
	}
	
	private static void borrarProfesor() {
		Integer identificacion;
		String valorIngresado;
		System.out.println("Ingrese Dni para Borrar Profesor:");
		valorIngresado = teclado.next();
		identificacion = Integer.parseInt(valorIngresado);
		facultad.DarBajaProfesor(identificacion);
		
		
	}
	
	private static void borrarPersonal() {
		Integer identificacion;
		String valorIngresado;
		System.out.println("Ingrese Dni para Borrar Personal de Servicio:");
		valorIngresado = teclado.next();
		identificacion = Integer.parseInt(valorIngresado);
		facultad.DarBajaPersonal(identificacion);
		
		
	}
	private static void listarEstudiante() {
	
		facultad.obtenerListadoDeEstudiantesDeUnaFacultad();
		facultad.mostrarInformacionEstudiantesDentroLaFacultad();
		
	}
		

	private static void listarProfesor() {
		
		facultad.obtenerListadoDeProfesoresDeUnaFacultad();
		facultad.mostrarInformacionDeProfesoresDentroLaFacultad();
		
	}
			
   private static void listarPersonal() {
		
		facultad.obtenerListadoDePersonalDeUnaFacultad();
		facultad.mostrarInformacionPersonalDentroLaFacultad();
		
	}    
    private static void ingresarProfesor() {

	
    	Profesor nuevoProfesor;
	
	Integer dni,anioIngreso,nro_Despacho;
	String valorIngresado, nombre, apellido, estadoCivil,departamentos;
	
	
		do {
			System.out.println("Ingrese nombre:");
			valorIngresado = teclado.next();
		}while(valorIngresado=="");
		
		nombre = valorIngresado;
		
		do {
			System.out.println("Ingrese apellido:");
			valorIngresado = teclado.next();
		}while(valorIngresado=="");
		
		apellido = valorIngresado;

		do {
			System.out.println("Ingrese Dni:");
			valorIngresado = teclado.next();
		}while(valorIngresado=="");
		dni= Integer.parseInt(valorIngresado);
		
		do {
			System.out.println("Ingrese estado civil:");
			valorIngresado = teclado.next();
		}while(valorIngresado=="");
		estadoCivil = valorIngresado;
		
		do {
			System.out.println("Ingrese año de ingreso:");
			valorIngresado = teclado.next();
		}while(valorIngresado=="");
		anioIngreso = Integer.parseInt(valorIngresado);
		
		do {
			System.out.println("Ingrese numero de despacho:");
			valorIngresado = teclado.next();
		}while(valorIngresado=="");
		nro_Despacho = Integer.parseInt(valorIngresado);
		
		nuevoProfesor = new Profesor(nombre, apellido, dni, estadoCivil, anioIngreso,nro_Despacho);
		
	        facultad.DarAltaProfesor(nuevoProfesor);

		
		
    }

   private static void ingresarPersonal() {
    	
    	Personal nuevoPersonal;
	
    	Integer dni,anioIngreso,nro_Despacho;
    	String valorIngresado, nombre, apellido, estadoCivil,secc;
    	
    	
    		do {
    			System.out.println("Ingrese nombre:");
    			valorIngresado = teclado.next();
    		}while(valorIngresado=="");
    		
    		nombre = valorIngresado;
    		
    		do {
    			System.out.println("Ingrese apellido:");
    			valorIngresado = teclado.next();
    		}while(valorIngresado=="");
    		
    		apellido = valorIngresado;

    		do {
    			System.out.println("Ingrese Dni:");
    			valorIngresado = teclado.next();
    		}while(valorIngresado=="");
    		dni= Integer.parseInt(valorIngresado);
    		do {
    			System.out.println("Ingrese estado civil:");
    			valorIngresado = teclado.next();
    		}while(valorIngresado=="");
    		estadoCivil = valorIngresado;
    		
    		do {
    			System.out.println("Ingrese año de ingreso:");
    			valorIngresado = teclado.next();
    		}while(valorIngresado=="");
    		anioIngreso = Integer.parseInt(valorIngresado);
    		
    		do {
    			System.out.println("Ingrese numero de despacho:");
    			valorIngresado = teclado.next();
    		}while(valorIngresado=="");
    		nro_Despacho = Integer.parseInt(valorIngresado);
    		
    		do {
    			System.out.println("Ingrese nombre seccion:");
    			valorIngresado = teclado.next();
    		}while(valorIngresado=="");
    		secc = valorIngresado;
    		
    		Seccion secciones=new Seccion("seccion");
    		nuevoPersonal = new Personal(nombre, apellido, dni, estadoCivil, anioIngreso,nro_Despacho,secciones);
    		
    	    facultad.DarAltaPersonal(nuevoPersonal);

   }

}

