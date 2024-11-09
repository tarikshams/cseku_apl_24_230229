package service;

import core.Payment;
import service.interfaces.IPaymentService;

/**
 * Implementation of the {@link IPaymentService} interface.
 * This class follows the Single Responsibility Principle (SRP).
 * It also follows the Dependency Inversion Principle (DIP) by depending on the interface.
 */
public class PaymentService implements IPaymentService {

    /**
     * Processes a payment made by a student.
     *
     * @param payment the payment details
     */
    @Override
    public void processPayment(Payment payment) {
        // Logic to process payment
        System.out.println("Processing payment of " + payment.getAmount() + " for student " + payment.getStudentId());
    }

    /**
     * Retrieves payment details by payment ID.
     *
     * @param paymentId the ID of the payment
     * @return the payment details, or null if not found
     */
    @Override
    public Payment getPayment(String paymentId) {
        // Logic to get payment
        return null; // Placeholder
    }
}
