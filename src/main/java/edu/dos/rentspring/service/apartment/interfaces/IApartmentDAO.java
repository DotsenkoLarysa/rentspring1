package edu.dos.rentspring.service.apartment.interfaces;


import edu.dos.rentspring.model.Apartment;

import java.util.List;

public interface IApartmentDAO {

    Apartment create(Apartment apartment);
    Apartment get(String ID);
    Apartment update(Apartment apartment);
    Apartment delete(String ID);
    List<Apartment> getAll();
}
