/**
 * 
 */
package ejercicios;

/**
 * 
 */
public class MainEjercicioFinal {

	/**
	 * 
	 */
	public MainEjercicioFinal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   Estudiante estudiante = new Estudiante("Juan", "Pérez", "12345", "Soltero", "Ingeniería Informática");
	        Profesor profesor = new Profesor("María", "Gómez", "67890", "Casado", 2005, "A-101", "Matemáticas");
	        PersonalDeServicio servicio = new PersonalDeServicio("Carlos", "Rodríguez", "54321", "Soltero", 2010, "B-201", "Secretaría");

	        // Prueba de métodos
	        estudiante.matricularEnCurso("Ingeniería de Software");
	        profesor.cambiarDepartamento("Lenguajes de Programación");
	        servicio.trasladarSeccion("Biblioteca");

	        // Imprimir información
	        estudiante.imprimirInformacion();
	        System.out.println();
	        profesor.imprimirInformacion();
	        System.out.println();
	        servicio.imprimirInformacion();
	    }
	}

