package leao.mainar.exemplolombok.controllers;

import leao.mainar.exemplolombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Mainar Leão
 */
@RestController
public class ClientController {

    @GetMapping("/client")
    public Client getClient() {

        Client client = new Client();
        client.setName("Mainar");
        client.setLastName("Leão");
        client.setAge(24);

        return client;
    }

    @GetMapping("/clients")
    public ArrayList<Client> getClients() {

        ArrayList<Client> clients = new ArrayList<>();

        Client client = new Client();
        client.setName("Mainar");
        client.setLastName("Leão");
        client.setAge(24);

        Client client1 = new Client();
        client1.setName("Carlos");
        client1.setLastName("Costa");
        client1.setAge(39);

        clients.add(client);
        clients.add(client1);

        return clients;
    }
}
