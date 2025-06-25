package lk.ijse.parkingservice.service;

import lk.ijse.parkingservice.entity.ParkingRecord;

/**
 * ------------------------------------------------
 * Author: Sayuri Gamage
 * GitHub: https://github.com/sayuriGamage
 * Modified: 2025-06-25
 * ------------------------------------------------
 */


public interface ParkingRecordService {
    public ParkingRecord startParking(String licensePlate, Long spaceId);

    public ParkingRecord endParking(Long recordId);
}
