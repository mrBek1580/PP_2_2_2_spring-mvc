package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car(1, "Honda", "Fit", 2002));
        carsList.add(new Car(2, "Kia", "Rio", 2018));
        carsList.add(new Car(3, "Toyota", "Allion", 2003));
        carsList.add(new Car(4, "Volkswagen", "Polo", 2018));
        carsList.add(new Car(5,"Honda", "Accord", 2004));
    }

    @Override
    public List<Car> getCars(Integer count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}