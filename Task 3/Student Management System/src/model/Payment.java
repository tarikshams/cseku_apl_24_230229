package model;

/**
 * Concrete class for handling payments.
 * Implements the IPayment interface to provide payment functionality.
 */
public class Payment implements IPayment {

    private Student student;
    private double amount;

    /**
     * Constructor to initialize the Payment with a student and the payment amount.
     *
     * @param student The student making the payment.
     * @param amount  The amount to be paid by the student.
     */
    public Payment(Student student, double amount) {
        this.student = student;
        this.amount = amount;
    }

    /**
     * Processes the payment for the student.
     * The amount is set within this method, allowing the payment to be processed dynamically.
     * This method updates the payment amount and prints the payment details.
     *
     * @param amount The amount to be paid by the student.
     */
    @Override
    public void makePayment(double amount) {
        this.amount = amount;
        System.out.println(student.getName() + " has paid an amount of " + amount);
    }

    /**
     * Returns the student associated with this payment.
     *
     * @return The student making the payment.
     */
    public Student getStudent() {
        return student;
    }

    /**
     * Sets the student making the payment.
     *
     * @param student The student to set.
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * Retrieves the amount paid by the student.
     *
     * @return The amount paid.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the amount of payment.
     *
     * @param amount The amount to set.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
