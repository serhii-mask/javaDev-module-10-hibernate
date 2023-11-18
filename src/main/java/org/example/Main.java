package org.example;

import org.example.entities.Client;
import org.example.entities.Planet;
import org.example.repository.ClientCrudService;
import org.example.repository.PlanetCrudService;

import java.net.NoRouteToHostException;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        ClientCrudService clientService = new ClientCrudService();

        Client newClient = new Client();
        newClient.setName("Taras Potato");
        Client newAnakin = new Client();
        newAnakin.setId(4L);
        newAnakin.setName("Darth Vader");

        clientService.createClient(newClient);
        clientService.deleteClientById(6L);
        clientService.updateClient(newAnakin);

        Client client = clientService.getClientById(9L);
        System.out.println("client = " + client);
        Client palpatine = clientService.getClientById(10L);

        clientService.deleteClient(palpatine);

        List<Client> clients = clientService.getAllClients();
        System.out.println("clients = " + clients.toString());


        PlanetCrudService planetService = new PlanetCrudService();

        Planet newPlanet = new Planet();
        newPlanet.setId("EARTH");
        newPlanet.setName("Earth");

        planetService.createPlanet(newPlanet);
        Planet planetEndor = planetService.getPlanetById("ENDOR");
        planetService.deletePlanet(planetEndor);
        List<Planet> planets = planetService.getAllPlanets();
        System.out.println("planets = " + planets.toString());
    }
}