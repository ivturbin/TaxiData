package ru.digitalleague.taxi_service_data.service;

import org.springframework.stereotype.Service;
import ru.digitalleague.taxi_service_data.model.TaxiDriveInfo;

import java.util.List;

@Service
public interface TaxiDriverInfoService {
    TaxiDriveInfo getTaxiDriveInfo(long id);

    void saveOrUpdateTaxiDriveInfo(TaxiDriveInfo taxiDriveInfo);

    void deleteTaxiDriveInfo(long id);

    List<TaxiDriveInfo> getAllCityQueue();
}
