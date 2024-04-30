package EjRepasoParcial1;

import java.util.ArrayList;
import java.util.Iterator;

public class Client implements Iterable<Product>{
    private String name;
    private String lastname;
    private ArrayList<Product>shoppingCart = new ArrayList<>();

    public Client(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.shoppingCart = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public ArrayList<Product> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Product> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addProduct(Product product){
        int productTotal = 0;
        for (Product productCart : shoppingCart){
            if (productCart.getName().equals(product.getName())){
                productTotal = productTotal + 1;
            }
        }
        if(productTotal >= product.getStock()){
            System.out.println("No puedes agregar " + product.getName() + " al carrito. Ya no hay más stock.");
        } else {
            shoppingCart.add(product);
            System.out.println("Se agregó " + product.getName() + " al carrito.");
        }
    }

    public void calculateSubtotal(){
        double total = 0;
        for(Product product : shoppingCart){
            total = total + product.getPrice();
        }
        System.out.println("La compra de " + this.getName() + " " + this.getLastname() + " tiene un costo de $" + total);
    }

    @Override
    public Iterator<Product> iterator() {
        return shoppingCart.iterator();
    }
}
