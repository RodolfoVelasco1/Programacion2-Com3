package Abril04Ej1;

public class Square implements Figure, Rotatable, Drawable {
    private float side;

    public Square(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public float area() {
        return side*side;
    }

    @Override
    public void draw() {
        System.out.println("Dibujaste un cuadrado.");
    }

    @Override
    public void rotate() {
        System.out.println("Rotaste el cuadrado.");
    }
}
