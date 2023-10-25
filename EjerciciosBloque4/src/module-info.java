 * 
 */
package aplicacionEmpleado;
import java.util.Scanner;
/**
 * 
 */
public class Programa {

 /**
  * 
  */
 public Programa() {
  // TODO Auto-generated constructor stub
 }

 /**
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
 Empleado empleado1 = new Empleado(98,"julian","Escobar,",0);
     Scanner teclado = new Scanner(System.in);
     System.out.println("ingrese el salario");
     empleado1.setSalario(teclado.nextInt ());
     System.out.println(empleado1);
     
	
     System.out.println("El sueldo anual de:" + empleado1.getName()+ ":" + empleado1.getsalarioanual());
     System.out.println("El sueldo final con el incremento de 30% es de:" + empleado1.raiseSalario());
     double salarioConIncremento = empleado1.getsalarioanual() + empleado1.raiseSalario();
     System.out.println("El sueldo final con el incremento de 30% es de: " + salarioConIncremento);
     
     System.out.println("Por lo tanto el suedo mas el incremento es de:" + empleado1.getsalarioanual()+ empleado1.raiseSalario());
  
     
 }

}


