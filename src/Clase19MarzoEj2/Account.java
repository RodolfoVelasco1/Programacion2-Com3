package Clase19MarzoEj2;

public abstract class Account {
    protected float balance;
    protected int depositNumber = 0;
    protected int withdrawNumber = 0;
    protected float annualRate;
    protected float monthlyFee = 0;

    public Account(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
        this.depositNumber = 0;
        this.withdrawNumber = 0;
        this.monthlyFee = 0;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(int depositNumber) {
        this.depositNumber = depositNumber;
    }

    public int getWithdrawNumber() {
        return withdrawNumber;
    }

    public void setWithdrawNumber(int withdrawNumber) {
        this.withdrawNumber = withdrawNumber;
    }

    public float getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(float annualRate) {
        this.annualRate = annualRate;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }



    public void deposit(float amount){
        balance = balance + amount;
        depositNumber = depositNumber + 1;

    }
    public void withdraw(float amount){
        if (amount > balance){
            System.out.println("¡Operación Incorrecta! Intenta retirar más dinero del que tiene en su cuenta.");
        } else {
            balance = balance - amount;
            withdrawNumber = withdrawNumber + 1;
        }

    }

    public void calculateInterest(){
        float monthlyInterest = balance * (annualRate / 1200);
        balance = balance + monthlyInterest;
        System.out.println("El interés mensual es de $" + monthlyInterest);
    }

    public void monthlyStatement(){
        balance = balance - monthlyFee;
        calculateInterest();
    }

    public void print() {
        System.out.println("Saldo: $" + balance);
        System.out.println("Número de depósitos: " + depositNumber);
        System.out.println("Número de retiros: " + withdrawNumber);
        System.out.println("Tasa anual: " + annualRate + "%");
        System.out.println("Comisión mensual: $" + monthlyFee);
    }
}
