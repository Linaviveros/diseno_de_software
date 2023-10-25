
class pastel {
    private String hariana;
    private String huevos;
    private int sal;
    private String azucar;
    private int cacao;
    
    private pastel(Builder builder) {
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.año = builder.año;
        this.color = builder.color;
        this.potencia = builder.potencia;
    }
    
    @Override
    public String toString() {
        return "Coche: " + marca + " " + modelo + " (" + año + "), Color: " + color + ", Potencia: " + potencia + "HP";
    }
    
    static class Builder {
        private String marca;
        private String modelo;
        private int año;
        private String color;
        private int potencia;
        
        public Builder(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }
        
        public Builder año(int año) {
            this.año = año;
            return this;
        }
        
        public Builder color(String color) {
            this.color = color;
            return this;
        }
        
        public Builder potencia(int potencia) {
            this.potencia = potencia;
            return this;
        }
        
        public Coche build() {
            return new Coche(this);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche.Builder("Toyota", "Corolla")
                        .año(2022)
                        .color("Rojo")
                        .potencia(150)
                        .build();
        
        System.out.println(coche);
    }
}
