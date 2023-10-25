package ejercicioPerson;

public class PersonHerencia {

		private String name; 
		private String direccion;
		
		public PersonHerencia() {
			
		}
		
	public  PersonHerencia(String name, String direccion) {
		this.name = name; 
		this.direccion = direccion;
	}

	public String getName() {
	    return name ; 
	}

	public String getDireccion () {
		return direccion ;
	}

	public void setDireccion (String direccion) {
		this.direccion = direccion ;
	}
	 

	public String toString () {
		return " nombre : " + name +  " Con direccion : " + direccion ;
	}

	}


