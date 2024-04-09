package TP1;

public class Rectangle extends GeometricFigure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void area() {
        double result = this.length * this.width;
        System.out.println("El área del rectángulo es de " + result + " cm.");
    }

    @Override
    public void perimeter() {
        double result = (this.length + this.width) * 2;
        System.out.println("El área del rectángulo es de " + result + " cm.");

    }
}
