package src.com.Exercise.BankApplication;

import java.util.List;
import java.util.Objects;

public class Client extends Bank implements Account{
    String name;
    private List<Account> accounts;
    Client(String name){
        this.name = name;
    }
    void addAccount(Account account){

    }
    List<Account> getAccounts(){
        return accounts;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client : \n")
                .append("Name :").append(name)
                .append("\nAccounts :\n").append(accounts);
        return sb.toString();
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(accounts, client.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accounts);
    }
}
