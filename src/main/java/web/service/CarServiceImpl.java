package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> carsList = new ArrayList<>();

    {
        carsList.add(new Car(1, "Vaz", "2104", 2006));
        carsList.add(new Car(2, "Honda", "Fit", 2002));
        carsList.add(new Car(3, "Kia", "Rio", 2018));
        carsList.add(new Car(4, "Toyota", "Allion", 2003));
        carsList.add(new Car(5, "Volkswagen", "Polo", 2018));
    }

    @Override
    public List<Car> getCars() {
        return carsList;
    }
}
