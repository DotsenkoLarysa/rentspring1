package edu.dos.rentspring.service.apartment.impls;

import edu.dos.rentspring.dataset.FakeDataSet;
import edu.dos.rentspring.model.Apartment;
import edu.dos.rentspring.service.apartment.interfaces.IApartmentDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ApartmentServiceImpl implements IApartmentDAO {
    @Autowired
    FakeDataSet dataset;

    @Override
    public Apartment create(Apartment apartment) {
        this.getAll().add(apartment);
        return apartment;
    }

    @Override
    public Apartment get(String ID) {
        return null;
    }

    @Override
    public Apartment update(Apartment apartment) {
        return null;
    }

    @Override
    public Apartment delete(String ID) {
        Apartment apartmentToDelete = this.get(ID);
        this.getAll().remove(apartmentToDelete);
        return apartmentToDelete;
    }

    @Override
    public List<Apartment> getAll() {
        return null;
    }
}
