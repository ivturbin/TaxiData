package ru.digitalleague.taxi_service_data.service_impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.digitalleague.taxi_service_data.model.CityQueue;
import ru.digitalleague.taxi_service_data.repository.CityQueueRepository;
import ru.digitalleague.taxi_service_data.service.CityQueueService;

import java.util.List;
import java.util.Optional;

public class CityQueueServiceImpl implements CityQueueService {
    @Autowired
    CityQueueRepository cityQueueRepository;

    @Override
    public CityQueue getCityQueue(long id) {
        Optional<CityQueue> optionalCityQueue = cityQueueRepository.findById(id);
        return optionalCityQueue.orElse(null);
    }

    @Override
    public void saveOrUpdateCityQueue(CityQueue cityQueue) {
        cityQueueRepository.save(cityQueue);
    }

    @Override
    public void deleteCityQueue(long id) {
        cityQueueRepository.deleteById(id);
    }

    @Override
    public List<CityQueue> getAllCityQueue() {
        return cityQueueRepository.findAll();
    }
}
