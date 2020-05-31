package edu.dos.rentspring.dao.tenant.impls;

import edu.dos.rentspring.dao.tenant.interfaces.ITenantDAO;
import edu.dos.rentspring.dataset.FakeDataSet;
import edu.dos.rentspring.model.Tenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TenantDAOFakeImpl implements ITenantDAO {

    @Autowired
    FakeDataSet dataset;

    @Override
    public Tenant create(Tenant tenant) {
        return null;
    }

    @Override
    public Tenant get(String id) {
        return this.getAll().stream().filter(el->el.getID()
                .equals(id)).findFirst().orElse(null);
    }

    @Override
    public Tenant update(Tenant tenant) {
        return null;
    }

    @Override
    public Tenant delete(String id) {
        return null;
    }

    @Override
    public List<Tenant> getAll() {
        return dataset.getTenants();
    }
}
