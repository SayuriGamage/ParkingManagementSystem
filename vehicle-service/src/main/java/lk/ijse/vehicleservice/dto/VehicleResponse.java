package lk.ijse.vehicleservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * ------------------------------------------------
 * Author: Sayuri Gamage
 * GitHub: https://github.com/sayuriGamage
 * Modified: 2025-06-25
 * ------------------------------------------------
 */


@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleResponse {
    private Long id;
    private String licensePlate;
    private String type;
    private Long userId;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
}
