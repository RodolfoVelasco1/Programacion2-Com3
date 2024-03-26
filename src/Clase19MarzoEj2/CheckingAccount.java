package Clase19MarzoEj2;

public class CheckingAccount extends Account {
    protected float overdraft;


    public CheckingAccount(float balance, float annualRate) {
        super(balance, annualRate);
        this.overdraft = 0;
    }

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(float amount){
        if (amount > balance) {
            overdraft = overdraft + (amount - balance);
            balance = 0;
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public void deposit(float amount){
        if (overdraft == 0) {
            super.deposit(amount);
        } else {
            if (amount > overdraft){
                amount = amount - overdraft;
                overdraft = 0;
                super.deposit(amount);
            } else {
                overdraft = overdraft - amount;
                amount = 0;
            }
        }
    }

    @Override
    public void monthlyStatement(){
        super.monthlyStatement();
    }

    @Override
    public void print() {
        System.out.println("Saldo: $" + balance);
        System.out.println("Comisión mensual: $" + monthlyFee);
        System.out.println("Número de transacciones: " + (depositNumber + withdrawNumber));
        System.out.println("Sobregiro: $" + overdraft);
    }


}
