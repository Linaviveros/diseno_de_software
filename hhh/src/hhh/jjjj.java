package hhh;

	public class Empleado {
	    private int id;
	    private String firstName;
	    private String lastName;
	    private int salario;

	    public Empleado() {
	        // Constructor por defecto
	    }

	    public Empleado(int id, String firstName, String lastName, int salario) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.salario = salario;
	    }

	    public int getID() {
	        return id;
	    }

	    public String getFirstname() {
	        return firstName;
	    }

	    public String getLastname() {
	        return lastName;
	    }

	    public String getName() {
	        String myname = firstName + " " + lastName;
	        return myname;
	    }

	    public int getSalario() {
	        return salario;
	    }

	    public void setSalario(int salario) {
	        this.salario = salario;
	    }

	    public int getsalarioanual() {
	        int salarioA = this.salario * 12;
	        return salarioA;
	    }

	    public int raiseSalario() {
	        int salarioI = (this.salario * 30) / 100;
	        return salarioI;
	    }

	    @Override
	    public String toString() {
	        return "Empleado registrado con id: " + id + " con primer nombre: " + firstName + " y segundo nombre: " + lastName + " obtuvo un salario de: " + salario;
	    }

	    public static void main(String[] args) {
	        Empleado empleado1 = new Empleado(98, "julian", "Escobar", 0);
	        Scanner teclado = new Scanner(System.in);
	        System.out.println("Ingrese el salario: ");
	        empleado1.setSalario(teclado.nextInt());
	        System.out.println(empleado1);

	        System.out.println("El sueldo anual de " + empleado1.getName() + " es: " + empleado1.getsalarioanual());
	        System.out.println("El sueldo final con el incremento de 30% es de: " + empleado1.raiseSalario());
	        double salarioConIncremento = empleado1.getsalarioanual() + empleado1.raiseSalario();
	        System.out.println("El sueldo final con el incremento de 30% es de: " + salarioConIncremento);

	        System.out.println("Por lo tanto, el sueldo más el incremento es de: " + (empleado1.getsalarioanual() + empleado1.raiseSalario()));
	    }
	}

	

