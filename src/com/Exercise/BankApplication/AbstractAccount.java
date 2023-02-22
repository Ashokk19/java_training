package src.com.Exercise.BankApplication;

public abstract class AbstractAccount implements Account{
    private int id;
    private double balance;

    @Override
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    long decimalValue(){
        return Math.round(balance);
    }

}
