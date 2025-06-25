package lk.ijse.userserver.dto;

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
public class BookingResponse {
    private Long bookingId;
    private String parkingLocation;
    private String reservedTime;
}
