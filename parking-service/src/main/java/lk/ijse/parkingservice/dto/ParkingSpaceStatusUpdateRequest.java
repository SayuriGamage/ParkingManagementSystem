package lk.ijse.parkingservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class ParkingSpaceStatusUpdateRequest {
    public String status; // AVAILABLE, RESERVED, OCCUPIED, BLOCKED
    public String spaceId; // Unique identifier for the parking space
    public Long lotId; // ID of the parking lot to which this space belongs
}
