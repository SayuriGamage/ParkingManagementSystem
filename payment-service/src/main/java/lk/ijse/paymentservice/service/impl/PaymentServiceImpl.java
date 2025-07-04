package lk.ijse.paymentservice.service.impl;

import lk.ijse.paymentservice.client.UserClient;
import lk.ijse.paymentservice.dto.ParkingRecordDTO;
import lk.ijse.paymentservice.dto.PaymentRequest;
import lk.ijse.paymentservice.dto.PaymentResponse;
import lk.ijse.paymentservice.entity.Payment;
import lk.ijse.paymentservice.entity.PaymentStatus;
import lk.ijse.paymentservice.repo.PaymentRepository;
import lk.ijse.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * ------------------------------------------------
 * Author: Sayuri Gamage
 * GitHub: https://github.com/sayuriGamage
 * Modified: 2025-06-25
 * ------------------------------------------------
 */


@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepo;

    @Autowired
    private UserClient userClient;

    public PaymentResponse processPayment(PaymentRequest request) {
        ParkingRecordDTO record = userClient.getParkingRecordById(request.getParkingRecordId());

        if (record.getExitTime() == null)
            throw new RuntimeException("Vehicle has not exited yet.");

        // Calculate hours and fee
        Duration duration = Duration.between(record.getEntryTime(), record.getExitTime());
        long hours = Math.max(1, duration.toHours()); // Minimum 1 hour
        double amount = hours * 100.0; // Example: Rs.100 per hour

        // Simulate card validation (mock)
        if (!request.getCardNumber().startsWith("4")) {
            throw new RuntimeException("Card Declined (mock check)");
        }

        // Save payment
        Payment payment = new Payment();
        payment.setVehicleId(record.getVehicleId());
        payment.setParkingRecordId(record.getId());
        payment.setAmount(amount);
        payment.setPaidAt(LocalDateTime.now());
        payment.setPaymentMethod(request.getPaymentMethod());
        payment.setStatus(PaymentStatus.SUCCESS);
        payment.setReceiptNumber(UUID.randomUUID().toString());

        paymentRepo.save(payment);

        return new PaymentResponse(
                payment.getReceiptNumber(), amount, payment.getPaidAt(), payment.getStatus().toString()
        );
    }

    @Override
    public List<PaymentResponse> getAllPayments() {
        List<Payment> payments = paymentRepo.findAll();
        return payments.stream()
                .map(payment -> new PaymentResponse(
                        payment.getReceiptNumber(),
                        payment.getAmount(),
                        payment.getPaidAt(),
                        payment.getStatus().toString()
                ))
                .collect(Collectors.toList());
    }
}
