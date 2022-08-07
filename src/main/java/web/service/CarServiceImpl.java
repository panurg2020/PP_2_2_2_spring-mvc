package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao dao;

    public CarServiceImpl(CarDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> getAllCars() {
        return dao.getAllCars();
    }

    @Override
    public List<Car> getSomeCars(int number) {
        return dao.getSomeCars(number);
    }
}