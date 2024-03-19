package Ejercicio1;

public abstract class Vehiculo {
    private String color;
    private int ruedas;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Color: " + this.color + ", Ruedas: " + this.ruedas;
    }
}
