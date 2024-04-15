package TP2;


public class Main {
    public static void main (String[] args){
        System.out.println("");
        System.out.println("----EJERCICIO 1------");
        System.out.println("");
        PetShop p1 = new PetShop("Animales Felices");
        Dog d1 = new Dog("Choco", 2, "Perro", 20, "Ovejero", true);
        Cat c1 = new Cat("Michi",7, "Gato", 10, "Persa", false);
        Bird b1 = new Bird("Piolín", 3, "Ave", 7, "Canario", true);
        Fish f1 = new Fish("Nemo", 1, "Pez", 5, "Pez Payaso");
        p1.addAnimal(d1);
        p1.addAnimal(c1);
        p1.addAnimal(b1);
        p1.addAnimal(f1);

        System.out.println(d1.toString());
        System.out.println(c1.toString());
        System.out.println(b1.toString());
        System.out.println(f1.toString());

        p1.feedAnimal("Choco");
        p1.feedAnimal("Michi");
        p1.feedAnimal("Piolín");
        p1.feedAnimal("Nemo");
        p1.feedAnimal("Roberto");

        p1.animalList();

        p1.sellAnimal("Choco");
        p1.sellAnimal("Nemo");
        p1.sellAnimal("Roberto");

        p1.animalList();

        System.out.println("");
        System.out.println("----EJERCICIO 2------");
        System.out.println("");
        Library l1 = new Library("Yennifer");
        Novel n1 = new Novel("Los mil y un días", "Robertito Gonzalez", 1896, false, "Romance");
        Universitary u1 = new Universitary("Contaduría para todos", "Contín Numerín", 2020, false, "Economía.");
        ChildrenBook cb1 = new ChildrenBook("El gato con zapas", "Usain Bolt", 2005, false, true);
        l1.addBook(n1);
        l1.addBook(u1);
        l1.addBook(cb1);

        n1.bookInfo();
        u1.bookInfo();
        cb1.bookInfo();

        l1.bookList();

        l1.borrowBook("El gato con zapas");
        l1.borrowBook("El gato con zapas");
        l1.borrowBook("El principito");

        l1.returnBook("El gato con zapas");
        l1.returnBook("El principito");

        l1.borrowBook("Contaduría para todos");
        l1.borrowBook("El gato con zapas");

        l1.bookList();


    }
}
