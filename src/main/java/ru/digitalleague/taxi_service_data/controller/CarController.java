package ru.digitalleague.taxi_service_data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.taxi_service_data.model.Car;
import ru.digitalleague.taxi_service_data.service.CarService;

@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars/{id}")
    public Car getCar(@PathVariable long id){
        Car car = carService.getCar(id);
        return carService.getCar(id);
    }

    @PostMapping("/cars")
    public Car addNewCar(@RequestBody Car car){
        carService.saveOrUpdateCar(car);
        return car;
    }

    @PutMapping("/cars")
    public Car updateCar(@RequestBody Car car){
        carService.saveOrUpdateCar(car);
        return car;
    }

    @DeleteMapping("/cars/{id}")
    public String deleteCar(@PathVariable long id){
        carService.getCar(id);
        carService.deleteCar(id);
        return String.format("Car with ID = %d was deleted", id);
    }
}
