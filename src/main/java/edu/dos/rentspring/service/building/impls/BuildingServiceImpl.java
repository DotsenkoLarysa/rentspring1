package edu.dos.rentspring.service.building.impls;

import edu.dos.rentspring.dao.building.impls.BuildingDAOFakeImpl;
import edu.dos.rentspring.dao.tenant.impls.TenantDAOFakeImpl;
import edu.dos.rentspring.model.Building;
import edu.dos.rentspring.service.building.interfaces.IBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingServiceImpl implements IBuildingService {
    @Autowired
    BuildingDAOFakeImpl buildingDAOFake;

    @Override
    public Building create(Building building) {
        return null;
    }

    @Override
    public Building get(String id) {
        return null;
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
        return buildingDAOFake.getAll();
    }
}
