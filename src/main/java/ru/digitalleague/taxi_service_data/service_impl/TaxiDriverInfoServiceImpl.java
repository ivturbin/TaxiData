package ru.digitalleague.taxi_service_data.service_impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.digitalleague.taxi_service_data.model.TaxiDriveInfo;
import ru.digitalleague.taxi_service_data.repository.TaxiDriverInfoRepository;
import ru.digitalleague.taxi_service_data.service.TaxiDriverInfoService;

import java.util.List;
import java.util.Optional;

public class TaxiDriverInfoServiceImpl implements TaxiDriverInfoService {
    @Autowired
    TaxiDriverInfoRepository taxiDriverInfoRepository;

    @Override
    public TaxiDriveInfo getTaxiDriveInfo(long id) {
        Optional<TaxiDriveInfo> optionalTaxiDriveInfo = taxiDriverInfoRepository.findById(id);
        return optionalTaxiDriveInfo.orElse(null);
    }

    @Override
    public void saveOrUpdateTaxiDriveInfo(TaxiDriveInfo taxiDriveInfo) {
        taxiDriverInfoRepository.save(taxiDriveInfo);
    }

    @Override
    public void deleteTaxiDriveInfo(long id) {
        taxiDriverInfoRepository.deleteById(id);
    }

    @Override
    public List<TaxiDriveInfo> getAllCityQueue() {
        return taxiDriverInfoRepository.findAll();
    }
}
