package lk.ijse.paymentservice.service;

import lk.ijse.paymentservice.dto.PaymentRequest;
import lk.ijse.paymentservice.dto.PaymentResponse;

import java.util.List;

/**
 * ------------------------------------------------
 * Author: Sayuri Gamage
 * GitHub: https://github.com/sayuriGamage
 * Modified: 2025-06-25
 * ------------------------------------------------
 */


public interface PaymentService {
    public PaymentResponse processPayment(PaymentRequest request);

    List<PaymentResponse> getAllPayments();
}
