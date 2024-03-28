package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.model.Car;
import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> carList = carService.getCars();
        if (count != null) {
            int num = Math.min(count, 5);
            carList = carList.subList(0, num);
        }
        model.addAttribute("cars", carList);
        return "cars";
    }
}
