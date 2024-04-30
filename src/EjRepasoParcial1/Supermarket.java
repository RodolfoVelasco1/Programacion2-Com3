package EjRepasoParcial1;

import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Product>inventory = new ArrayList<>();

    public Supermarket() {
        this.inventory = new ArrayList<>();
    }

    public ArrayList<Product> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Product> inventory) {
        this.inventory = inventory;
    }

    public void addProduct(Product product){
        inventory.add(product);
    }

    public void searchProduct(String name){
        name = name.toLowerCase();
        boolean found = false;
        for (Product product : inventory){
            if(product.getName().toLowerCase().equals(name) & product.getStock() > 0){
                System.out.println("¡Producto encontrado! Hay " + product.getName() + " disponible.");
                product.printInfo();
                found = true;
                break;
            }
        }
        if (found == false){
            System.out.println("Lo sentimos, no tenemos " + name + " disponible en el inventario.");
        }

    }

    public void makePurchase(Client client){
        if(client.getShoppingCart().isEmpty()){
            System.out.println("El carrito de " + client.getName() + " " + client.getLastname() + " está vacío. No se puede realizar la compra.");
        } else {
            for (Product productCart : client){
                for (Product productInventory : inventory){
                    if(productInventory.getName().equals(productCart.getName())){
                        productInventory.setStock((productInventory.getStock() - 1));
                    }
                }
            }
            System.out.println("El pedido de " + client.getName() + " " + client.getLastname() + " fue aprobado.");
            System.out.println("¡Compra realizada con éxito!");
            client.getShoppingCart().clear();
        }
    }

    public void showInventory(){
        System.out.println("Productos disponibles en el Supermercado:");
        for (Product product : inventory){
            if(product.getStock() > 0){
                product.printInfo();
            }
        }

    }
}
