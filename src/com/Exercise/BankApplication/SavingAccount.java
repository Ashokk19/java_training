package src.com.Exercise.BankApplication;

import src.com.Exercise.BankApplication.Exception.NotEnoughFundsException;

public class SavingAccount extends AbstractAccount{
    private double balance;

    SavingAccount() {
        balance = getBalance();
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        this.setBalance(balance);
        System.out.println("Amount deposited");
    }

    @Override
    public void withdraw(double amount) throws NotEnoughFundsException {
        if(amount>balance){
            throw new NotEnoughFundsException("Can't withdraw amount more than your balance");
        }else{
            balance -= amount;
            System.out.println("Amount withdrawn");
        }

    }
}
