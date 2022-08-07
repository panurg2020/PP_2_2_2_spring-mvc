package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Zaz", "yellow", 1976));
        cars.add(new Car("Paz", "white", 2008));
        cars.add(new Car("Zhiguli", "red", 2013));
        cars.add(new Car("Uaz", "grey", 2018));
        cars.add(new Car("Lada", "green", 2021));
    }

    @Override
    public List<Car> getAllCars() {
        return Collections.unmodifiableList(cars);
    }

    @Override
    public List<Car> getSomeCars(int number) {
        return Collections.unmodifiableList(cars.subList(0, number));
    }
}