package controller;

import model.Payment;
import model.Student;
import view.PaymentView;

/**
 * Controller for handling payment actions.
 * It acts as a mediator between the Payment model and Payment view.
 */
public class PaymentController {

    private Payment model;  // The model representing the payment
    private PaymentView view;  // The view displaying the payment details

    /**
     * Constructor to initialize the controller with a Payment model and Payment view.
     *
     * @param model The payment model to interact with.
     * @param view The view to display the payment details.
     */
    public PaymentController(Payment model, PaymentView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Updates the view to display the payment details.
     */
    public void updateView() {
        view.displayPaymentDetails(model);
    }

    /**
     * Sets the payment amount.
     *
     * @param amount The payment amount.
     */
    public void setPaymentAmount(double amount) {
        model.setAmount(amount);
    }

    /**
     * Processes the payment for the student.
     */
    public void processPayment() {
        model.makePayment(model.getAmount());
    }
    /**
     * Retrieves the student associated with the payment from the model.
     *
     * @return The student linked to the payment.
     */
    public Student getPaymentAssociatedStudent()
    {
        return model.getStudent();
    }
    /**
     * Sets the student associated with the payment in the model.
     *
     * @param student The student to associate with the payment.
     */
    public void setPaymentAssociatedStudent(Student student)
    {
        model.setStudent(student);
    }
}
