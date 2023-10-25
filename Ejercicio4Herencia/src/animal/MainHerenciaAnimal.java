
package animal;

public class MainHerenciaAnimal {
	
		public static void main(String[] args) {
	        AnimalHerencia animal = new AnimalHerencia("simon");
	        AnimalHerencia animal1 = new AnimalHerencia("mateo");
	        System.out.println(animal1);

	        Mamma1 mammal = new Mamma1("");
	        System.out.println(mammal.toString() + animal1.name);

	        Cat gato = new Cat("");
	        System.out.println(gato.toString() + animal1.name);
	        gato.greets();

	        Dog perro = new Dog("");
	        System.out.println(perro.toString() + animal1.name);
	        perro.greets();
	        perro.greets(perro);
	    }
	}