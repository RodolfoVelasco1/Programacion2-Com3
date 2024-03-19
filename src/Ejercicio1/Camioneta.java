package Ejercicio1;

public class Camioneta extends Coche {
    private double carga;
    public Camioneta() {}
    public Camioneta(String color, int ruedas, double velocidad, double cilindrada, double carga) {
        super.setColor(color);
        super.setRuedas(ruedas);
        super.setVelocidad(velocidad);
        super.setCilindrada(cilindrada);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + ", Carga: " + this.carga;
    }
}
