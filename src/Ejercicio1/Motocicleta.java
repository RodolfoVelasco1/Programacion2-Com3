package Ejercicio1;

public class Motocicleta extends Bicicleta {
    private double velocidad;
    private double cilindrada;
    public Motocicleta(){}
    public Motocicleta(String color, int ruedas, String tipo, double velocidad, double cilindrada){
        super.setColor(color);
        super.setRuedas(ruedas);
        super.setTipo(tipo);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + ", Velocidad: " + this.velocidad + "km/h , Cilindrada: " + this.cilindrada + "cc.";
    }
}
