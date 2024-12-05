package model;

/**
 * Interface defining the payment behavior for a student.
 * Implementing classes must define how a student makes payments.
 */
public interface IPayment {

    /**
     * Makes a payment for the student.
     *
     * @param amount The amount to be paid by the student.
     */
    void makePayment(double amount);
}
