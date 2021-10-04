package ru.digitalleague.taxi_service_data.service_impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.digitalleague.taxi_service_data.model.Car;
import ru.digitalleague.taxi_service_data.repository.CarRepository;
import ru.digitalleague.taxi_service_data.service.CarService;

import java.util.Optional;

public class CarServiceImpl implements CarService {
    @Autowired
    CarRepository carRepository;

    @Override
    public Car getCar(long id) {
        Optional<Car> carOptional = carRepository.findById(id);
        return carOptional.orElse(null);
    }

    @Override
    public void saveOrUpdateCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public void deleteCar(long id) {
        carRepository.deleteById(id);
    }
}
