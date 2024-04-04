package Abril04Ej1;

public class Circle implements Figure, Drawable {
    private float ratio;

    public Circle(float ratio) {
        this.ratio = ratio;
    }

    public float getRatio() {
        return ratio;
    }

    public void setRatio(float ratio) {
        this.ratio = ratio;
    }

    @Override
    public float area() {
        return (float) (3.14*(ratio*ratio));
    }

    @Override
    public void draw() {
        System.out.println("Dibujaste un círculo.");
    }
}
