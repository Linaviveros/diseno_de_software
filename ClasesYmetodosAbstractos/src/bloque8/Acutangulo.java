package bloque8;

public class Acutangulo extends TrianguloBase {
    private int base;
    private int altura;

    public Acutangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double Perimetro() {
        return 2 * base + 2 * Math.sqrt((base * base / 4.0) + (altura * altura));
    }
}