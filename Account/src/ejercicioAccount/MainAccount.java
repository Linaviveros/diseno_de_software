package ejercicioAccount;

public class MainAccount {

	public MainAccount() {
	
	}
	 public static void main(String[] args) {
	        DiseñoAccount cuenta1 = new DiseñoAccount("A001", "camila", 5000);
	        DiseñoAccount cuenta2 = new DiseñoAccount("A002", "santiago", 3000);
	        
	        System.out.println(cuenta1);
	        
	        cuenta1.credit(500);
	        System.out.println("Despues de acreditar 500 a la cuenta 1: " + cuenta1);
	        
	        cuenta1.debit(1000);
	        System.out.println("Despues de debitar 1000 a la cuenta: " + cuenta1);
	        
	        cuenta1.transferTo(cuenta2, 2000);
	        System.out.println("despues de tranferir 2000 a la cuenta 1 de la cuanta 2:");
	        System.out.println(cuenta1);
	        System.out.println(cuenta2);
	    }
	}

