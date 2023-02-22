package src.com.Exercise.BankApplication;

import src.com.Exercise.BankApplication.Exception.ClientExistException;

import java.util.List;

public class Bank {
    List<Client> clients;
    void addClient(Client client) throws ClientExistException {
        for( Client c : clients)
            if(c.name.equals(client.name))
                throw new ClientExistException("Client Already Exists");
    }
    List<Client> getClients(){
        return clients;
    }
}
