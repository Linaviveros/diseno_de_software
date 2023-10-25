package Ejercicio1;

class Vehiculo {
    private String matricula;
    private int velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public void acelerar(int velocidad) {
        this.velocidad += velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String toString() {
        return "Matrícula: " + matricula + ", Velocidad: " + velocidad + " km/h";
    }
}