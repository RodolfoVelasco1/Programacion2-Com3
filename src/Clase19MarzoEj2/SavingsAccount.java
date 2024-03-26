package Clase19MarzoEj2;

public class SavingsAccount extends Account {
    protected boolean active;

    public SavingsAccount(float balance, float annualRate) {
        super(balance, annualRate);
        this.active = balance >= 10000;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public void deposit(float amount){
        if (active = true) {
            super.deposit(amount);
        }
    }

    @Override
    public void withdraw(float amount){
        if (active = true) {
            super.withdraw(amount);
        }
    }

    @Override
    public void monthlyStatement(){
        if(withdrawNumber > 4){
            monthlyFee = monthlyFee + (withdrawNumber - 4) * 1000;
            super.monthlyStatement();
        } else {
            super.monthlyStatement();
        }
        if(balance >= 10000){
            active = true;
        } else {
            active = false;
        }
    }

    @Override
    public void print() {
        System.out.println("Saldo: $" + balance);
        System.out.println("Comisión mensual: $" + monthlyFee);
        System.out.println("Número de transacciones: " + (depositNumber + withdrawNumber));
    }



}
