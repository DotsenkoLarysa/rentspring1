package edu.dos.rentspring.controller;


import edu.dos.rentspring.model.Apartment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/apartment")
public class ApartmentRestController {
//   private List<Apartment> apartments = new ArrayList<>(
//           Arrays.asList(
//                   new Apartment("1", 5, 20.5, true, 20.5, 0, 0, 0),
//                   new Apartment("2", 1, 50.5, true, 10.5, 0, 0, 0),
//                   new Apartment("3", 0, 100.0, false, 200.5, 0, 0, 0),
//                   new Apartment("4", 12, 275.5, true, 25.0, 0, 0, 0)
//           )
//   );
//   @RequestMapping("/get/list")
//    List<Apartment> getApartments(){
//       return apartments;
//   }
//    @RequestMapping("/get/{id}")
//    Apartment getApartment (@PathVariable(value = "id")String id){return}
//    @RequestMapping("/delete/{id}")
//    Apartment deleteApartment(@PathVariable(value = "id")String id){
//       return service.delete(id);
 //   }
//    @PostMapping("/create")
//    Apartment createApartment(@RequestBody Apartment apartment){
//       return service.create(apartment);
//    }
    //    @PostMapping("/update")
//    Apartment updateApartment(@RequestBody Apartment apartment){
//       return service.update(apartment);
//    }


}
