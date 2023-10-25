package ejercicio1;

public class MainEjercicioCirculo{
	 public static void main(String[] args) {
		
		
			
		        CirculoHerencia circulo1 = new CirculoHerencia(0,"verde"); 
		        System.out.println("Circulo 1: " + circulo1);
		        System.out.println("Área del Circulo 1: " + circulo1.getArea());

		        CirculoHerencia circulo2 = new CirculoHerencia(0,"morado"); 
		        System.out.println("Circulo 2: " + circulo2.toString());
		        System.out.println("Área del Circulo 2: " + circulo2.getArea());

		        CirculoHerencia circulo3 = new CirculoHerencia(0, "azul"); 
		        System.out.println("Circulo 3: " + circulo3.toString());
		        System.out.println("Área del Circulo 3: " + circulo3.getArea());

		        CilindroHerencia cilindro1 = new CilindroHerencia(circulo1.getRadius(), 0, circulo1.getColor()); 
		        System.out.println("Cilindro 1: " + cilindro1);
		        System.out.println("Volumen del Cilindro 1: " + cilindro1.getVolumen());
		       

		        CilindroHerencia cilindro2 = new CilindroHerencia(circulo2.getRadius(),0,circulo2.getColor()); 
		        System.out.println("Cilindro 2: " + cilindro2);
		        System.out.println("Volumen del Cilindro 2: " + cilindro2.getVolumen());

		        CilindroHerencia cilindro3 = new CilindroHerencia(circulo3.getRadius(), 0,circulo3.getColor()); 
		        System.out.println("Cilindro 3: " + cilindro3);
		        System.out.println("Volumen del Cilindro 3: " + cilindro3.getVolumen());
		    }
		}

	





