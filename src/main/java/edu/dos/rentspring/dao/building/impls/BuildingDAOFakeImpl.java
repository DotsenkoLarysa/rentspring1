package edu.dos.rentspring.dao.building.impls;

import edu.dos.rentspring.dao.building.interfaces.IBuildingDAO;
import edu.dos.rentspring.dataset.FakeDataSet;
import edu.dos.rentspring.model.Building;
import edu.dos.rentspring.model.Tenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BuildingDAOFakeImpl implements IBuildingDAO {

    @Autowired
    FakeDataSet dataset;

    //CREATE
    @Override
    public Building create(Building building) {
        //create id for tenant
        List<Integer> list = this.getAll().stream()
                .map(el->Integer.valueOf(el.getId()))
                .collect(Collectors.toList());
        Integer max = list.stream().max(Comparator.naturalOrder()).orElse(0);
        String id = String.valueOf(max+1);
        if(building.getId() == null) building.setId(id);

        this.getAll().add(building);
        return building;
    }

    //READ
    @Override
    public Building get(String id) {
        return this.getAll().stream().filter(el->el.getId()
                .equals(id)).findFirst().orElse(null);
    }
    //UPDATE
    @Override
    public Building update(Building building) {
        String id = building.getId();
        this.delete(id);

        return this.create(building);
    }

    //DELETE
    @Override
    public Building delete(String id) {
        Building buildingToDelete = this.get(id);
        this.getAll().remove(buildingToDelete);
        return buildingToDelete;
    }

    //GET ALL
    @Override
    public List<Building> getAll() {
        return dataset.getBuildings();
    }
}
