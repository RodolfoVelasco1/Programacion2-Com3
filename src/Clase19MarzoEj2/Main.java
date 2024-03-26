package Clase19MarzoEj2;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount1 = new SavingsAccount(100000.0f, 0.05f);

        savingsAccount1.deposit(50000);

        savingsAccount1.withdraw(20000);
        savingsAccount1.withdraw(10000);
        savingsAccount1.withdraw(5000);
        savingsAccount1.withdraw(5000);
        savingsAccount1.withdraw(10000);

        savingsAccount1.monthlyStatement();

        savingsAccount1.print();

    }
}
