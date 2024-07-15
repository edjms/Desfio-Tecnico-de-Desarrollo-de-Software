package co.com.technical_test_alianza.service;

import co.com.technical_test_alianza.model.Client;

import java.util.List;

public interface ClientService {

    Client SaveClient (Client client);
    List <Client> FindAllClient();
    Client FindByIdClient(String id);
}
