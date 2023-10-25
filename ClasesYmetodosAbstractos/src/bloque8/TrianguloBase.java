package bloque8;

public abstract class TrianguloBase {
    public abstract double Perimetro();
    
    public double CalcularAreaconHipotenusa(int lado, int hipotenusa) {
        double catetoFaltante = Math.sqrt(hipotenusa * hipotenusa - lado * lado);
        double area = 0.5 * lado * catetoFaltante;
        return area;
    }
}
