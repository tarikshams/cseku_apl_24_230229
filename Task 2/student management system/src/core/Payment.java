package core;

/**
 * Represents a payment made by a student.
 * This class follows the Single Responsibility Principle (SRP).
 */
public class Payment {
    private String paymentId;
    private String studentId;
    private double amount;
    private String paymentMethod; // e.g., "CARD", "BANK", "MOBILE"

    /**
     * Constructs a new Payment with the specified payment ID, student ID, amount, and payment method.
     *
     * @param paymentId     the unique identifier for the payment
     * @param studentId     the unique identifier for the student making the payment
     * @param amount        the amount of the payment
     * @param paymentMethod the method of payment (e.g., "CARD", "BANK", "MOBILE")
     */
    public Payment(String paymentId, String studentId, double amount, String paymentMethod) {
        this.paymentId = paymentId;
        this.studentId = studentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    /**
     * Gets the payment ID.
     *
     * @return the payment ID
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the payment ID.
     *
     * @param paymentId the new payment ID
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * Gets the student ID associated with this payment.
     *
     * @return the student ID
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * Sets the student ID associated with this payment.
     *
     * @param studentId the new student ID
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * Gets the amount of the payment.
     *
     * @return the payment amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the amount of the payment.
     *
     * @param amount the new payment amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Gets the payment method (e.g., "CARD", "BANK", "MOBILE").
     *
     * @return the payment method
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the payment method (e.g., "CARD", "BANK", "MOBILE").
     *
     * @param paymentMethod the new payment method
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
