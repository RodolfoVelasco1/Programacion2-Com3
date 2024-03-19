package Ejercicio1;

import java.sql.SQLOutput;

public class Coche extends Vehiculo {
    private double velocidad;
    private double cilindrada;
    public Coche(){}
    public Coche(String color, int ruedas, double velocidad, double cilindrada){
        super.setColor(color);
        super.setRuedas(ruedas);
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
        return super.toString() + ", Velocidad: " + this.velocidad + " km/h" + ", Cilindrada: " + this.cilindrada + " cc.";
    }
}
