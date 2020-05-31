package edu.dos.rentspring.dao.apartment.impls;

import edu.dos.rentspring.model.Apartment;
import edu.dos.rentspring.service.apartment.interfaces.IApartmentDAO;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//@Repository
//public class IApartmentDAOFakeImpl implements IApartmentDAO {
//
////    @Autowired
////    FakeDataSet dataSet;
//
////    @Override
////    public Apartment create(Apartment apartment) {
////        List<Integer> list = this.getAll().stream().map(el -> Integer.valueOf(el.getID())
////        .collect(Collectors.toList()));
////        Integer max = list.stream().max(Comparator.naturalOrder()).orElse(0);
////        String id = String.valueOf(max+1);
////        if(apartment.getID() == null){}
////        this.getAll().add(apartment);
////        return apartment;
////    }
//
//    @Override
//    public Apartment get(String ID) {
//        return null;
//    }
//
//    @Override
//    public Apartment update(Apartment apartment) {
//        String id = apartment.getID();
//        int index = this.getAll().indexOf(apartment);
//        this.delete(id);
//        this.getAll().add(index, apartment);
//
//        return apartment;
//    }
//
//    @Override
//    public Apartment delete(String ID) {
//
//
//        return null;
//    }
//
//    @Override
//    public List<Apartment> getAll() {
//        return null;
//    }
//}
