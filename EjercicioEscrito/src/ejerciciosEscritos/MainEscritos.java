package ejerciciosEscritos;
import java.util.Scanner;
public class MainEscritos {

	public MainEscritos() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del libro:");
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Precio: ");
        float precioLibro = scanner.nextFloat();
        System.out.print("Número de Páginas: ");
        int numeroDePaginas = scanner.nextInt();
        System.out.print("Año de Publicación: ");
        int anoDePublicacion = scanner.nextInt();

        Libro libro = new Libro(tituloLibro, precioLibro, numeroDePaginas, anoDePublicacion);

       
        System.out.println("\nIngrese los datos del disco:");
        System.out.print("Título: ");
        scanner.nextLine(); 
        String tituloDisco = scanner.nextLine();
        System.out.print("Precio: ");
        float precioDisco = scanner.nextFloat();
        System.out.print("Duración en Minutos: ");
        float duracionEnMinutos = scanner.nextFloat();

        Disco disco = new Disco(tituloDisco, precioDisco, duracionEnMinutos);

        System.out.println("\nDetalles del Libro:");
        libro.mostrar();

        System.out.println("\nDetalles del Disco:");
        disco.mostrar();
        
        scanner.close();
    }
}