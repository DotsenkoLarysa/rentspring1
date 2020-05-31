package edu.dos.rentspring.dao.building.impls;

import edu.dos.rentspring.dao.building.interfaces.IBuildingDAO;
import edu.dos.rentspring.dataset.FakeDataSet;
import edu.dos.rentspring.model.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BuildingDAOFakeImpl implements IBuildingDAO {

    @Autowired
    FakeDataSet dataset;

    @Override
    public Building create(Building building) {
        return null;
    }

    @Override
    public Building get(String id) {
        return this.getAll().stream().filter(el->el.getID()
                .equals(id)).findFirst().orElse(null);
    }

    @Override
    public Building update(Building building) {
        return null;
    }

    @Override
    public Building delete(String id) {
        return null;
    }

    @Override
    public List<Building> getAll() {
        return dataset.getBuildings();
    }
}
