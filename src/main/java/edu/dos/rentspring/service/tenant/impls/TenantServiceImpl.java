package edu.dos.rentspring.service.tenant.impls;

import edu.dos.rentspring.dao.tenant.impls.TenantDAOFakeImpl;
import edu.dos.rentspring.model.Tenant;
import edu.dos.rentspring.service.tenant.interfaces.ITenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenantServiceImpl implements ITenantService {

    @Autowired
    TenantDAOFakeImpl tenantDAOFake;

    @Override
    public Tenant create(Tenant tenant) {
        return tenantDAOFake.create(tenant);
    }

    @Override
    public Tenant get(String id) {
        return tenantDAOFake.get(id);
    }

    @Override
    public Tenant update(Tenant tenant) {
        return tenantDAOFake.update(tenant);
    }

    @Override
    public Tenant delete(String id) {
        return tenantDAOFake.delete(id);
    }

    @Override
    public List<Tenant> getAll() {
        return tenantDAOFake.getAll();
    }
}
