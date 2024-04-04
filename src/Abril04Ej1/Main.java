package Abril04Ej1;

public class Main {
    public static void main(String[] args){
        Circle ci1 = new Circle(5);
        Square sq1 = new Square(4);
        ci1.draw();
        System.out.println("El area del círculo es " + ci1.area());

        sq1.draw();
        sq1.rotate();
        System.out.println("El area del cuadrado es " + sq1.area());



    }
}
