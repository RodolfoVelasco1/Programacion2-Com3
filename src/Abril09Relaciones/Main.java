package Abril09Relaciones;

public class Main {
    public static void main (String[] args){
        System.out.println(" ");
        System.out.println("EJERCICIO 1 --- ASOCIACIÓN UNIDIRECCIONAL");
        System.out.println(" ");
        College c1 = new College("Universidad Nacional de Cuyo.");
        College c2 = new College("Universidad Tecnológica Nacional.");
        Student s1 = new Student("Pepe", c1);
        System.out.println(s1.getName() + " asiste a la " + s1.getCollege().getName());
        s1.changeUniversity(c2);
        System.out.println(s1.getName() + " cambió de universidad, ahora asiste a la " + s1.getCollege().getName());

        System.out.println(" ");
        System.out.println("EJERCICIO 2 --- ASOCIACIÓN BIDIRECCIONAL");
        System.out.println(" ");
        Person p1 = new Person("José");
        Person p2 = new Person("María");
        Person p3 = new Person("Carlos");
        Person p4 = new Person("Rosa");
        Person p5 = new Person("María José");
        Book b1 = new Book("El Principito");
        Book b2 = new Book("Los Miserables");
        Book b3 = new Book("Harry Potter");
        Book b4 = new Book("El Eternauta");

        p1.addBook(b1);
        p1.addBook(b2);
        p1.addBook(b3);

        p2.addBook(b4);
        p2.addBook(b1);

        p3.addBook(b1);
        p3.addBook(b2);

        p4.addBook(b1);
        p4.addBook(b3);

        p5.addBook(b1);
        p5.addBook(b3);

        p1.showBook();
        p2.showBook();
        p3.showBook();
        p4.showBook();
        p5.showBook();

        b1.showOwner();
        b2.showOwner();
        b3.showOwner();
        b4.showOwner();

        System.out.println(" ");
        System.out.println("EJERCICIO 3 --- AGREGACIÓN");
        System.out.println(" ");
        Company co1 = new Company("Instituto de Idiomas");
        Department d1 = new Department("Inglés");
        Department d2 = new Department("Italiano");
        co1.addDepartment(d1);
        co1.addDepartment(d2);
        d1.addEmployee(new Employee("Carla", "Coordinadora"));
        d1.addEmployee(new Employee("Mario", "Profesor"));
        d1.addEmployee(new Employee("Franca", "Secretaria"));
        d2.addEmployee(new Employee("Carlos", "Coordinador"));
        d2.addEmployee(new Employee("María", "Profesora"));
        d2.addEmployee(new Employee("Franco", "Secretario"));

        co1.showDepartment();
        d1.showEmployee();
        d2.showEmployee();

        System.out.println(" ");
        System.out.println("EJERCICIO 4 --- COMPOSICIÓN");
        System.out.println(" ");
        House h1 = new House(4);
        h1.addDoor("madera");
        h1.addDoor("madera");
        h1.addDoor("metal");
        h1.addDoor("vidrio");

        h1.showDoor();


    }
}
