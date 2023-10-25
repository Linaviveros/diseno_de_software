
package herencia;

public class MainN {

	public MainN() {
		
	}

	public static void main(String[] args) {
		Nombre nombre1 = new Nombre (" Lina "," Viveros "," Melo ");
		Direccion direccion = new Direccion(nombre1.getNombre(),nombre1.getPrimerApellido(),nombre1.getSegundoApellido()," Urb la merced "," Pasto "," Nariño ",520002);
		System.out.println(" Sus datos han sido registrados con exito: " + direccion);
	}
}
