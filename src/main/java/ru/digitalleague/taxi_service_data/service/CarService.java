package ru.digitalleague.taxi_service_data.service;

import org.springframework.stereotype.Service;
import ru.digitalleague.taxi_service_data.model.Car;

@Service
public interface CarService {
    Car getCar(long id);

    void saveOrUpdateCar(Car car);

    void deleteCar(long id);
}
