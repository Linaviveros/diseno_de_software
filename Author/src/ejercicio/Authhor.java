/**
 * 
 */
package ejercicio;
import java.util.Scanner;

import ejercicioAuthor.Author;

/**
 * 
 */
public class Authhor {

	/**
	 * 
	 */
	public Authhor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Author autor1= new Author(" lina viveros "," ", 'f');
		System.out.println("los datos del autor sin gmail son: "+ autor1);
		Scanner teclado= new Scanner (System.in);
		System.out.println("ingrese el gamail : ");
		autor1.setEmail(teclado.next());
		System.out.println("los datos del autor son: "+ autor1);
		
		

	}

}
