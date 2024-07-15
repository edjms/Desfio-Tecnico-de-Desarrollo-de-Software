package co.com.technical_test_alianza.controller.impl;

import co.com.technical_test_alianza.controller.ClientController;
import co.com.technical_test_alianza.model.Client;
import co.com.technical_test_alianza.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@Service
public class ClientControllerImpl implements ClientController {

    private final ClientService clientService;

    @Override
    public Client SaveClient(Client client) {
        Client savedClient = clientService.SaveClient(client);
        return savedClient;
    }

    @Override
    public List<Client> FindAllClient() {
        List<Client> clientAll = clientService.FindAllClient();
        return clientAll;
    }

    @Override
    public Client FindByIdClient(String id) {
        Client client = clientService.FindByIdClient(id);
        return client;
    }
}
