package src.com.Exercise.BankApplication;

import src.com.Exercise.BankApplication.Exception.ClientExistException;

import java.util.List;

public class Bank {
    private List<Client> clients;
    void addClient(Client client) throws ClientExistException {
        for( Client c : clients)
            if(c.name.equalsIgnoreCase(client.name))
                throw new ClientExistException("Client name Already Exists");
    }
    List<Client> getClients(){
        return clients;
    }
}
