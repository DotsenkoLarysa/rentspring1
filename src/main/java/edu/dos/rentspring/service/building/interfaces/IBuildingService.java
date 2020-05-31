package edu.dos.rentspring.service.building.interfaces;

import edu.dos.rentspring.model.Building;

import java.util.List;

public interface IBuildingService {

    Building create(Building building);
    Building get(String id);
    Building update(Building building);
    Building delete(String id);
    List<Building> getAll();
}
