package ru.digitalleague.taxi_service_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.digitalleague.taxi_service_data.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
