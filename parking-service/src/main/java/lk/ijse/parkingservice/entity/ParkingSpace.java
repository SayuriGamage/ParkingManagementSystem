package lk.ijse.parkingservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
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
@Entity
public class ParkingSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String spaceId;

    @Enumerated(EnumType.STRING)
    private ParkingStatus status = ParkingStatus.AVAILABLE;

    @ManyToOne
    @JoinColumn(name = "lot_id")
    @JsonIgnore
    private ParkingLot parkingLot;

    // Getters & Setters
}
