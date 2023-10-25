package ejercicioCuenta;

public class EjercicioCuenta {

	public EjercicioCuenta() {

		    }

		    public static void main(String[] args) {
		        Cuenta cuenta1 = new Cuenta("Lina Viveros", 800.00);
		        Cuenta cuenta2 = new Cuenta("Cristian Martinez",900.0);

		        System.out.println(cuenta1.toString());
		        System.out.println(cuenta2.toString());

		        cuenta1.ingresar(500.0);
		        cuenta2.retirar(300.0);

		        System.out.println(cuenta1.toString());
		        System.out.println(cuenta2.toString());
		    }
		
		          
	}

