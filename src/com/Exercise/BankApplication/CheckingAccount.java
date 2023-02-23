package src.com.Exercise.BankApplication;

import src.com.Exercise.BankApplication.Exception.NotEnoughFundsException;

import java.util.Objects;

public class CheckingAccount extends AbstractAccount{
    double overdraft;
    private double balance;
    public void CheckingAccount() {
        this.balance = getBalance();
    }
    double getOverdraft(){
        return overdraft;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CheckingAccount checkingAccount = (CheckingAccount) o;
        return Double.compare(checkingAccount.overdraft, overdraft) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(overdraft);
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
