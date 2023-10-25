package ejercicioShape;

public class SquareHerencia extends RectangleHerencia {
protected double side;
	
    public SquareHerencia() {
    }

    public SquareHerencia(double side) {
        this.side = side;
    }

	public SquareHerencia(double side, String color, boolean filled, double width, double length) {
		super(color, filled, width, length);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	public void setWidth(double side) {
		this.side = side;
	}
	public void setLength(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [Rectangulo[Shape[color=" + color + ", filled=" + filled+"], width=" + width + ", length=" + length + "]]";
	}
	

}