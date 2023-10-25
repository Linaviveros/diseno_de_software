
package bloque8;


public class MainEjercicio {

	
	public MainEjercicio() {
		
	}
	public static void main(String[] args) {
        Escaleno escaleno = new Escaleno(3, 8, 7);
        double areaEscaleno = escaleno.CalcularAreaconHipotenusa(3, 7);
        double perimetroEscaleno = escaleno.Perimetro();
        System.out.println(" El area del triángulo Escaleno es: " + areaEscaleno + ", El Perímetro es igual a: " + perimetroEscaleno);

        Acutangulo acutangulo = new Acutangulo(4, 3);
        double areaAcutangulo = acutangulo.CalcularAreaconHipotenusa(2, 5);
        double perimetroAcutangulo = acutangulo.Perimetro();
        System.out.println("El area del triángulo Acutángulo es: " + areaAcutangulo + ", El perimetro es igual a: " + perimetroAcutangulo);
    }
}