package src.com.Exercise.BankApplication;

public interface Account {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
}
