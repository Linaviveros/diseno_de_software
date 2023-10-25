package ejercicios;

public class PersonalDeServicio extends Empleado {
    private String seccion;

    public PersonalDeServicio(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
    int anoIncorporacion, String numeroDespacho, String seccion) {
    super(nombre, apellidos, numeroIdentificacion, estadoCivil, anoIncorporacion, numeroDespacho);
        
       
    this.seccion = seccion;
    }

    public void trasladarSeccion(String nuevaSeccion) {
        
       
this.seccion = nuevaSeccion;
    }


   
public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Sección: " + seccion);
    }
}
