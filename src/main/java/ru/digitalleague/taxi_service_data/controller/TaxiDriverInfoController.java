package ru.digitalleague.taxi_service_data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.taxi_service_data.model.TaxiDriveInfo;
import ru.digitalleague.taxi_service_data.service.TaxiDriverInfoService;

import java.util.List;

@RestController
public class TaxiDriverInfoController {
    @Autowired
    private TaxiDriverInfoService taxiDriveInfoService;

    @GetMapping("/taxi_driver_info/{id}")
    public TaxiDriveInfo getCityQueue(@PathVariable long id){
        TaxiDriveInfo taxiDriveInfo = taxiDriveInfoService.getTaxiDriveInfo(id);
        return taxiDriveInfoService.getTaxiDriveInfo(id);
    }

    @PostMapping("/taxi_driver_info")
    public TaxiDriveInfo addNewCityQueue(@RequestBody TaxiDriveInfo taxiDriveInfo){
        taxiDriveInfoService.saveOrUpdateTaxiDriveInfo(taxiDriveInfo);
        return taxiDriveInfo;
    }

    @PutMapping("/taxi_driver_info")
    public TaxiDriveInfo updateCityQueue(@RequestBody TaxiDriveInfo taxiDriveInfo){
        taxiDriveInfoService.saveOrUpdateTaxiDriveInfo(taxiDriveInfo);
        return taxiDriveInfo;
    }

    @DeleteMapping("/taxi_driver_info/{id}")
    public String deleteTaxiDriverInfo(@PathVariable long id){
        taxiDriveInfoService.getTaxiDriveInfo(id);
        taxiDriveInfoService.deleteTaxiDriveInfo(id);
        return String.format("TaxiDriverInfo with ID = %d was deleted", id);
    }

    @GetMapping("/taxi_drivers")
    public List<TaxiDriveInfo> getAllTaxiDriverInfo(){
        return taxiDriveInfoService.getAllCityQueue();
    }
}
