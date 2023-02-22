package src.com.Exercise.BankApplication;

import src.com.Exercise.BankApplication.Exception.NotEnoughFundsException;

public interface Account {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount) throws NotEnoughFundsException;
}
