package edu.dos.rentspring.controller;

import edu.dos.rentspring.model.Tenant;
import edu.dos.rentspring.service.tenant.impls.TenantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tenant")
public class TenantRestController {

    @Autowired
   TenantServiceImpl tenantService;

    @RequestMapping("/list")
   List<Tenant> getTenant(){
        return tenantService.getAll();
    }
}
