package org.example.repository;

import org.example.entities.Planet;

import java.util.List;

public interface PlanetDao {
    boolean createPlanet(Planet planet);

    Planet getPlanetById(String planetId);

    List<Planet> getAllPlanets();

    void deletePlanet(Planet planet);
}
