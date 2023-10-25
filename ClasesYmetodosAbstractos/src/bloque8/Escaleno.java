package bloque8;

public class Escaleno extends TrianguloBase {
    private int ladoM;
    private int ladoB;
    private int ladoC;
    
    public Escaleno(int m, int b, int c) {
        ladoM = m;
        ladoB = b;
        ladoC = c;
    }

    @Override
    public double Perimetro() {
        return ladoM + ladoB + ladoC;
    }
}