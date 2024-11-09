package service.interfaces;

import core.Payment;

/**
 * Interface for payment services.
 * This interface follows the Interface Segregation Principle (ISP).
 */
public interface IPaymentService {

    /**
     * Processes a payment made by a student.
     *
     * @param payment the payment details
     */
    void processPayment(Payment payment);

    /**
     * Retrieves payment details by payment ID.
     *
     * @param paymentId the ID of the payment
     * @return the payment details
     */
    Payment getPayment(String paymentId);
}
