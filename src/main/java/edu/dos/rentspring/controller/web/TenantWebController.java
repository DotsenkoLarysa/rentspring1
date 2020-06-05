package edu.dos.rentspring.controller.web;

import edu.dos.rentspring.model.Tenant;
import edu.dos.rentspring.service.tenant.impls.TenantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

@RequestMapping("/web/tenant")
@Controller
public class TenantWebController {

        @Autowired
        TenantServiceImpl tenantService;

        @RequestMapping("/get/list")
        String getTenant(Model model){
    List<Tenant> tenants = tenantService.getAll();
    model.addAttribute("tenants", tenants);
    tenants.stream().forEach(item -> System.out.println(item));


            return "tenantlist";
    }

}
