package edu.dos.rentspring.dao.tenant.impls;

import edu.dos.rentspring.dao.tenant.interfaces.ITenantDAO;
import edu.dos.rentspring.dataset.FakeDataSet;
import edu.dos.rentspring.model.Tenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TenantDAOFakeImpl implements ITenantDAO {

    @Autowired
    FakeDataSet dataset;

    //CREATE
    @Override
    public Tenant create(Tenant tenant) {
        //create id for tenant
        List<Integer> list = this.getAll().stream()
                .map(el->Integer.valueOf(el.getId()))
                .collect(Collectors.toList());
        Integer max = list.stream().max(Comparator.naturalOrder()).orElse(0);
        String id = String.valueOf(max+1);
        if(tenant.getId() == null) tenant.setId(id);

        this.getAll().add(tenant);
        return tenant;
    }

    //READ
    @Override
    public Tenant get(String id) {
        return this.getAll().stream().filter(el->el.getId()
                .equals(id)).findFirst().orElse(null);
    }

    //UPDATE
    @Override
    public Tenant update(Tenant tenant) {
        String id = tenant.getId();
        this.delete(id);

        return this.create(tenant);
    }

    //DELETE
    @Override
    public Tenant delete(String id) {
        Tenant tenantToDelete = this.get(id);
        this.getAll().remove(tenantToDelete);
        return tenantToDelete;
    }

    //GET ALL
    @Override
    public List<Tenant> getAll() {
        return dataset.getTenants();
    }
}
