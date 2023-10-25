/**
 * 
 */
package Ejercicio1;

public class SimuladorVehiculos {
    public static void main(String[] args) {
      
        Coche coche = new Coche("ATQ70F", 4);
        Camion camion = new Camion("GDQ382");

        Remolque remolque = new Remolque(4000);
        camion.ponRemolque(remolque);

      
        coche.acelerar(90);
        camion.acelerar(170);

  
        System.out.println(" Esta es la información del coche:");
        System.out.println(coche);

        System.out.println("\nInformación del camión:");
        System.out.println(camion);
    }
}
