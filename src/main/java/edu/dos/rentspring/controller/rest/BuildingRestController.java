package edu.dos.rentspring.controller.rest;

import edu.dos.rentspring.model.Building;
import edu.dos.rentspring.model.Tenant;
import edu.dos.rentspring.service.building.impls.BuildingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/building")
public class BuildingRestController {

    @Autowired
    BuildingServiceImpl buildingService;

    //GET ALL
    @RequestMapping("/list")
    List<Building> getBuildings(){
        return buildingService.getAll();
    }

    //READ
    @RequestMapping("/get/{id}")
    Building getBuilding(@PathVariable (value="id")String id){
        return buildingService.get(id);
    }

    //DELETE
    @RequestMapping("/delete/{id}")
    Building deleteBuilding(@PathVariable(value="id") String id){
        return buildingService.delete(id);
    }

    //CREATE
    @PostMapping("/create")
    Building createBuilding(@RequestBody Building building){
        return buildingService.create(building);
    }

    //UPDATE
    @PostMapping("/update")
    Building updateBuilding(@RequestBody Building building){
        return buildingService.update(building);
    }
}
