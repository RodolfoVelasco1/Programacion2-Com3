package TP1;

public class Circle extends GeometricFigure {
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void area() {
        double result = 3.14 * (this.radio * this.radio);
        System.out.println("El área del círculo es de " + result + " cm.");
    }

    @Override
    public void perimeter() {
        double result = 3.14 * 2 * this.radio;
        System.out.println("El perímetro del círculo es de " + result + " cm.");

    }
}
