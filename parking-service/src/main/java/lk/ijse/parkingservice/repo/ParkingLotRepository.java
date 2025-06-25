package lk.ijse.parkingservice.repo;

import lk.ijse.parkingservice.entity.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ------------------------------------------------
 * Author: Sayuri Gamage
 * GitHub: https://github.com/sayuriGamage
 * Modified: 2025-06-25
 * ------------------------------------------------
 */


@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot, Long> {

}
