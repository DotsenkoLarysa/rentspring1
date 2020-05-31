package edu.dos.rentspring.dao.tenant.interfaces;

import edu.dos.rentspring.model.Tenant;

import java.util.List;

public interface ITenantDAO {
    Tenant create(Tenant tenant);
    Tenant get(String id);
    Tenant update(Tenant tenant);
    Tenant delete(String id);
    List<Tenant> getAll();
}
