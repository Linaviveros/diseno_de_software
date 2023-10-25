package ejercicio1;

 public class CilindroHerencia extends CirculoHerencia{
		private double height= 1.0;

		public CilindroHerencia() {	
		    }

		    public CilindroHerencia(double radius) {
		        super(radius);
		        
		    }

		    public CilindroHerencia(double radius, double height) {
		        super(radius);
		        this.height = 1.0;
		    }

		   
		public CilindroHerencia(double radius, double height, String color) {
		        super(radius, color);
		        this.height = 1.0;
		    }

		    public double getHeight() {
		        return height;
		    }
		    
		    public void setHeight(double height) {
		    	this.height = 1.0;
		    }

			public double getVolumen() {
				
				double volumen = Math.PI * Math.pow(getRadius(), 2) * height;
				return volumen;
			}
		    
	}
	    

	    
 
