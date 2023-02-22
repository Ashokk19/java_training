package src.com.Exercise.BankApplication;

import java.util.List;

public class Client extends Bank implements Account{
    String name;
    List<Account> accounts;
    Client(String name){
        this.name = name;
    }
    void addAccount(Account account){

    }
    List<Account> getAccounts(){
        return null;
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
