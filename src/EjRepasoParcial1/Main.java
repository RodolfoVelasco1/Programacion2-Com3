package EjRepasoParcial1;

public class Main {
    public static void main(String[] args) {
        Supermarket s1 = new Supermarket();
        Product p1 = new Product("Queso", 2500, 2);
        Product p2 = new Product("Pan", 1000, 4);
        Product p3 = new Product("Hamburguesa", 1500, 6);
        Product p4 = new Product("Agua", 500, 2);
        Product p5 = new Product("Arroz", 700, 1);
        Client c1 = new Client("Amelia", "Contreras");
        Client c2 = new Client("Raul", "Gonzalez");

        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);
        s1.addProduct(p4);
        s1.addProduct(p5);

        s1.showInventory();

        s1.searchProduct("fideos");
        s1.searchProduct("pan");

        c1.addProduct(p2);
        c1.addProduct(p5);
        c1.addProduct(p3);
        c1.addProduct(p3);
        c1.addProduct(p3);

        c1.calculateSubtotal();

        s1.makePurchase(c1);

        s1.showInventory();

        s1.searchProduct("Arroz");

        c2.addProduct(p4);
        c2.addProduct(p4);
        c2.addProduct(p4);
        c2.addProduct(p3);
        c2.addProduct(p1);
        c2.addProduct(p1);
        c2.addProduct(p1);

        c2.calculateSubtotal();

        s1.makePurchase(c2);

        s1.showInventory();

        s1.makePurchase(c1);



    }
}
