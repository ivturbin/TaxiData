package ru.digitalleague.taxi_service_data.service;

import org.springframework.stereotype.Service;
import ru.digitalleague.taxi_service_data.model.CityQueue;

import java.util.List;

@Service
public interface CityQueueService {
    CityQueue getCityQueue(long id);

    void saveOrUpdateCityQueue(CityQueue cityQueue);

    void deleteCityQueue(long id);

    List<CityQueue> getAllCityQueue();
}
