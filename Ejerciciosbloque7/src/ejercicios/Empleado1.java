package ejercicios;

public class Empleado extends Persona {
    private int anoIncorporacion;
    private String numeroDespacho;

    

   
  public Empleado(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
                    int anoIncorporacion, String numeroDespacho) {
        
       
  super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        
        
this.anoIncorporacion = anoIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

public void reasignarDespacho(String nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
    }
}

		   