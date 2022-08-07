package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap modelMap) {
        List<Car> cars;
        if (count == null || count >= 5) {
            cars = service.getAllCars();
        } else {
            cars = service.getSomeCars(count);
        }
        modelMap.addAttribute("cars", cars);
        return "cars";
    }
}