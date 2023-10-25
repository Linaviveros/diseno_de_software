/**
 * 
 */
package ejercicioPerson;
import java.util.Scanner;

public class MainPerson {


	public MainPerson() {
		
	
	}

	 static void main(String[] args) {
		PersonHerencia persona1 = new PersonHerencia ("", "");
	    Scanner teclado = new Scanner(System.in);
	    System.out.println("Ingrese la dirección");
	    persona1.setDireccion(teclado.nextLine());
	    System.out.println("Datos registrados: " + persona1);

	    StudentHerencia estudiante = new StudentHerencia (persona1.getName(), persona1.getDireccion(), "", 0, 0);
	    Scanner teclado2 = new Scanner(System.in);
	    System.out.println("Por favor ingrese el programa");
	    estudiante.setPrograma(teclado2.nextLine());
	    System.out.println(" Por favor ingrese el Año");
	    estudiante.setAño(teclado2.nextInt());
	    teclado2.nextLine();
	    System.out.println("Ingrese la tarifa");
	    estudiante.setTarifa(teclado2.nextDouble());
	    System.out.println("Estudiante Con datos ya registrados: " + estudiante);
	    
	    StaffHerencia empleado = new StaffHerencia(persona1.getName(), persona1.getDireccion(), "", 0);
	    Scanner teclado3 = new Scanner(System.in);
	    System.out.println("Ingrese La escuela");
	    empleado.setEscuela(teclado3.nextLine());
	    System.out.println("Ingrese Salarario");
	    empleado.setPago(teclado2.nextDouble());
	    System.out.println("Trabajador con datos validos al registar : " + empleado);
	    
	    
	    
	    
	    
	    
	}


		
}