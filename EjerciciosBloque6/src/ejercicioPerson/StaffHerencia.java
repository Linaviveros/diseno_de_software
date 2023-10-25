package ejercicioPerson;

public class StaffHerencia extends PersonHerencia {

	private String school;
	private double pago ;
	
	public StaffHerencia (String name, String direccion) {
		super(name,direccion);
	}

	public StaffHerencia() {
		
	}
	
	public StaffHerencia(String name, String direccion,String escuela,double pago ) {
		super(name,direccion);
		this.school = escuela;
		this.pago = pago ;
	}
   
	public String getEscuela() {
		return school;
	}
	
	public void setEscuela(String escuela) {
		this.school = escuela ;
	}
	
	public double getPago() {
		return pago;
	}

	public void setPago(double pago) {
		this.pago = pago ;
	}
	@Override
	public String toString () {
		System.out.println("Personal:");
		return super.toString() + "de la escuela : " + school + " tiene un monto de pago de : " + pago  ;
		
	}
	
	
	
}