package ru.digitalleague.taxi_service_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.digitalleague.taxi_service_data.model.TaxiDriveInfo;

public interface TaxiDriverInfoRepository extends JpaRepository<TaxiDriveInfo, Long> {
}
