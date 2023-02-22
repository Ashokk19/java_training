package src.com.Exercise.BankApplication;

public abstract class AbstractAccount implements Account{
    int id;
    double balance;

    long decimalValue(){
        return Math.round(balance);
    }

}
