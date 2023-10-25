package ejercicios;

   public class Estudiante extends Persona {
	    private String curso;

	    public Estudiante(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, String curso) {
	        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
	        this.curso = curso;
	    }

	    public void matricularEnCurso(String nuevoCurso) {
	        this.curso = nuevoCurso;
	    }
	}