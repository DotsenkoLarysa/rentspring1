package edu.dos.rentspring.dao.building.interfaces;

import edu.dos.rentspring.model.Building;

import java.util.List;

public interface IBuildingDAO {

    Building create(Building building);
    Building get(String id);
    Building update(Building building);
    Building delete(String id);
    List<Building> getAll();
}
