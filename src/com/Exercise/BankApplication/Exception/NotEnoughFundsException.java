package src.com.Exercise.BankApplication.Exception;

public class NotEnoughFundsException extends BankException{
    int id;
    double balance;
    double amount;

    public NotEnoughFundsException(String s) {
        super(s);
    }
}
