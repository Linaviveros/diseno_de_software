package ejercicioShape;

public class CircleHerencia extends ShapeHerencia {

protected double radius ;
	
	public CircleHerencia() {
		
	}
	public CircleHerencia(double radius) {
		this.radius= radius;
	}
	public CircleHerencia(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		double Area = Math.PI*Math.pow(radius, 2);
		return Area;
	}
	public double GetPerimetro() {
		double Perimetro = 2*Math.PI*radius;
		return Perimetro;
	}

	@Override
	public String toString() {
	    return "Circulo [shape [color=" + getColor() + ", filled=" + isFilled() + "], radius=" + radius + "]";
	}

	

}