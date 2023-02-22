package src.com.Exercise.BankApplication;

public class CheckingAccount extends AbstractAccount{
    double overdraft;
    double getOverdraft(){
       return 0;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }
}
