package edu.dos.rentspring.controller.rest;

import edu.dos.rentspring.model.Tenant;
import edu.dos.rentspring.service.tenant.impls.TenantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tenant")
public class TenantRestController {

    @Autowired
   TenantServiceImpl tenantService;

    //GET ALL
    @RequestMapping("/list")
   List<Tenant> getTenants(){
        return tenantService.getAll();
    }


    //READ
    @RequestMapping("/get/{id}")
    Tenant getTenant(@PathVariable(value="id")String id){
        return tenantService.get(id);
    }

    //DELETE
    @RequestMapping("/delete/{id}")
    Tenant deleteTenant(@PathVariable(value="id") String id){
        return tenantService.delete(id);
    }

    //CREATE
    @PostMapping("/create")
    Tenant createTenant(@RequestBody Tenant tenant){
        return tenantService.create(tenant);
    }

    //UPDATE
    @PostMapping("/update")
    Tenant updateTenant(@RequestBody Tenant tenant){
        return tenantService.update(tenant);
    }
}
