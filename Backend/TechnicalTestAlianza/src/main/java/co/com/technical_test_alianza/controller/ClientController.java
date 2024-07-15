package co.com.technical_test_alianza.controller;

import co.com.technical_test_alianza.model.Client;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public interface ClientController {

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/create")
    public Client SaveClient (@RequestBody Client client);

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/list")
    public List<Client> FindAllClient();

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/list/{id}")
    public Client FindByIdClient(@PathVariable String id);


}
