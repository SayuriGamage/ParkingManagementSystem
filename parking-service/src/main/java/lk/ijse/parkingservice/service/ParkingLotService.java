package lk.ijse.parkingservice.service;

import lk.ijse.parkingservice.dto.ParkingLotRequest;
import lk.ijse.parkingservice.entity.ParkingLot;

import java.util.List;

/**
 * ------------------------------------------------
 * Author: Sayuri Gamage
 * GitHub: https://github.com/sayuriGamage
 * Modified: 2025-06-25
 * ------------------------------------------------
 */


public interface ParkingLotService{
    ParkingLot createLot(ParkingLotRequest request);

    List<ParkingLot> getAllLots();

    ParkingLot updateParkingLot(Long id, ParkingLotRequest request);

    void deleteParkingLot(Long id);
}
