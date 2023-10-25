package Ejercicio1;

class Camion extends Vehiculo {
    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitaRemolque() {
        this.remolque = null;
    }

    @Override
    public void acelerar(int velocidad) {
        if (remolque != null && (this.getVelocidad() + velocidad) > 100) {
            System.out.println("¡Cuidado el camión con remolque va demasiado rápido!");
        } else {
            super.acelerar(velocidad);
        }
    }

    public String toString() {
        if (remolque != null) {
            return super.toString() + "\n" + remolque.toString();
        } else {
            return super.toString();
        }
    }
}
