package edu.dos.rentspring.controller;

import edu.dos.rentspring.model.Building;
import edu.dos.rentspring.service.building.impls.BuildingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/building")
public class BuildingRestController {

    @Autowired
    BuildingServiceImpl buildingService;

    @RequestMapping("/list")
    List<Building> getBuilding(){
        return buildingService.getAll();
    }
}
