package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCar(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Zaz", "yellow", 1976));
        list.add(new Car("Paz", "white", 2008));
        list.add(new Car("Zhiguli", "red", 2013));
        list.add(new Car("Uaz", "grey", 2018));
        list.add(new Car("Lada", "green", 2021));
        list = CarService.carsCount(list, allCars);
        model.addAttribute("list", list);
        return "car";
    }
}