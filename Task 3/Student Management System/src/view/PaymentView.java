package view;

import model.Payment;

/**
 * View class for displaying payment details.
 * Used by the controller to output the result of a payment-related action.
 */
public class   PaymentView {

    /**
     * Displays payment details.
     * This message includes the student id and payment amount.
     *
     * @param payment The payment object containing the payment's information.
     */
    public void displayPaymentDetails(Payment payment) {
        // Display the payment amount
        System.out.println(payment.getStudent().getStudentId() + " paid: " + payment.getAmount());
    }
}
