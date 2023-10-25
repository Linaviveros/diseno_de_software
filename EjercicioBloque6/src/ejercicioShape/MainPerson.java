
package ejercicioShape;

public class MainPerson {

	public MainPerson() {
	
	}

	public static void main(String[] args) {
			ShapeHerencia shape1 = new ShapeHerencia("blue", true);
			CircleHerencia circulo1 = new CircleHerencia(3.16);
			RectangleHerencia rectan1 = new RectangleHerencia(3.16,2.3); 
			SquareHerencia square1 = new SquareHerencia(23.1, rectan1.color,rectan1.filled,rectan1.getLength(),rectan1.getWidth());
			
			
			System.out.println(shape1);
			System.out.println(circulo1);
			System.out.println(rectan1);
			System.out.println(square1);
			

		}
}