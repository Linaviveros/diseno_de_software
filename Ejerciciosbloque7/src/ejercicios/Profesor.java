package ejercicios;

public class Profesor extends Empleado {
    private String departamento;

    public Profesor(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
                    int anoIncorporacion, String numeroDespacho, String departamento) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, anoIncorporacion, numeroDespacho);
        this.departamento = departamento;
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }
}
