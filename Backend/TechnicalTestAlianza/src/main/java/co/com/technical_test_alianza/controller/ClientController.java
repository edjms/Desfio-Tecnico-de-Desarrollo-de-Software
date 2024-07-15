package co.com.technical_test_alianza.controller;

import co.com.technical_test_alianza.model.Client;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public interface ClientController {

    @PostMapping("/create")
    public Client SaveClient (@RequestBody Client client);

    @GetMapping("/list")
    public List<Client> FindAllClient();

    @GetMapping("/list/{id}")
    public Client FindByIdClient(@PathVariable String id);


}
