/**
 * 
 */
package ultimoEjercicio;

/**
 * 
 */
public class MainCirculoC {

	/**
	 * 
	 */
	public MainCirculoC() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 JerarquiaCirculo circulo = new  JerarquiaCirculo();
	        circulo.leerRadio(3);
	        System.out.println("Área del círculo: " + circulo.area());
	        System.out.println("Circunferencia del círculo: " + circulo.circunferencia());

	        Cilindro cilindro = new Cilindro();
	        cilindro.leerRadio(3);
	        cilindro.leerAltura(1,0);
	        System.out.println("area del cilindro: " + cilindro.areac());
	        System.out.println("Volumen del cilindro: " + cilindro.volumen());
	        CilindroHueco cilindroHueco = new CilindroHueco();
	        cilindroHueco.leerRadio(4);
	        cilindroHueco.leerAltura(2,0);
	        cilindroHueco.leerRadioInterior(3.0);
	        System.out.println("Área superficial externa del cilindro hueco: " + cilindroHueco.areaSuperficialExterna());
	        System.out.println("Área superficial interna del cilindro hueco: " + cilindroHueco.areaSuperficialInterna());
	        System.out.println("Volumen del cilindro hueco: " + cilindroHueco.volumen());
	    }
	}
