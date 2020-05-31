package edu.dos.rentspring.dataset;

import edu.dos.rentspring.model.Building;
import edu.dos.rentspring.model.Tenant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeDataSet {

    private List<Tenant> tenants = new ArrayList<>(
            Arrays.asList(
                    new Tenant("1","ФЛП Мищенко Р.Д.","ррррррр",
                            "Житомир,ул.Максютова,12,кв.36","0374487651",
                            "Мищенко Роман Дмитриевич"),
                    new Tenant("2","ЗАО Зоря","ааааааа",
                            "Житомир,ул.Победы,12,кв.36","0374487652","Бих Олег Евгеньевич"),
                    new Tenant("3","ЧП Дельфин","ппппппп", "Житомир,ул.Театральная,12,кв.36",
                            "0374487653","Игнатюк Ольга Викторовна"),
                    new Tenant("4","ЧП Полісся-Продукт","ооооооо",
                            "Житомир,площадь Короленко,1","0374487654",
                            "Разумовская Нина Ивановна")
            )
    );

    public List<Tenant> getTenants() {
        return tenants;
    }

    private List<Building> buildings = new ArrayList<>(
            Arrays.asList(
                    new Building("1","Житомир, ул.Киевская,77","0374487651"),
                    new Building("2","Житомир, ул.Баранова,21","0504289625"),
                    new Building("3","Житомир, ул.Малинская,117","0351234567"),
                    new Building("4","Житомир, ул.Трояновская,35","0389876543")
            )
    );

    public List<Building> getBuildings() {
        return buildings;
    }
}
