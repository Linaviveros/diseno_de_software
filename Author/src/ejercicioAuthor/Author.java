package ejercicioAuthor;

public class Author {

	private String name;
	private String email;
	private char genter;

	public Author() {
		
	}
    
	public Author(String name, String email, char genter) {
		this.name=name;
		this.email=email;
		this.genter=genter;
	}
	public String getName() {
	 return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public char getGenter() {
		return genter;
	}
	public String toString() {
		return "nombre del autor: " + name + "el email es: "+ email + " genero: " + genter;
	}
}
