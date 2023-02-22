package src.com.Exercise.BankApplication.Exception;

public class OverdraftLimitExceededException extends NotEnoughFundsException{
    double overdraft;

    public OverdraftLimitExceededException(String s) {
        super(s);
    }
}
