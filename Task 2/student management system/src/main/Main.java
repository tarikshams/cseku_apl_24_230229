package main;

import core.*;
import service.*;
import service.interfaces.*;

import static core.NotificationType.EMAIL;
import static core.NotificationType.SMS;

/**
 * Main class to demonstrate the functionality of enrollment, notification, and payment services.
 */
public class Main {

    /**
     * Main method to execute the application workflow.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create sample students
        // Undergraduate and graduate students with their IDs, names, and emails
        Student undergradStudent = new UndergraduateStudent("230201", "Ibnul Abrar Shahriar Seam", "230201@ku.ac.bd");
        Student gradStudent = new GraduateStudent("230229", "Tarique Shams", "230229@ku.ac.bd");

        // Initialize the enrollment service
        IEnrollmentService enrollmentService = new EnrollmentService();

        // Create enrollment instances for each student
        Enrollment enrollment1 = new Enrollment("E001", undergradStudent.getStudentId(), "0741 02 2100");
        Enrollment enrollment2 = new Enrollment("E002", gradStudent.getStudentId(), "0741 02 2100");

        // Enroll the students in the course
        enrollmentService.enrollStudent(enrollment1);
        enrollmentService.enrollStudent(enrollment2);

        // Initialize the notification service
        NotificationService notificationService = new NotificationService();

        // Create notifications for each student
        // Notification includes an ID, student ID, message, and type (EMAIL or SMS)
        Notification notification1 = new EmailNotification("N001", undergradStudent.getStudentId(), "Welcome to the course!");
        Notification notification2 = new SMSNotification("N002", gradStudent.getStudentId(), "Your enrollment is confirmed!");

        // Send the notifications to each student
        notificationService.sendNotification(notification1);
        notificationService.sendNotification(notification2);

        // Initialize the payment service
        IPaymentService paymentService = new PaymentService();

        // Create payment records for each student
        // Payment includes an ID, student ID, amount, and method (e.g., CARD or BANK)
        Payment payment1 = new Payment("P001", undergradStudent.getStudentId(), 1500.00, "CARD");
        Payment payment2 = new Payment("P002", gradStudent.getStudentId(), 2000.00, "BANK");

        // Process the payments for each student
        paymentService.processPayment(payment1);
        paymentService.processPayment(payment2);

        // Retrieve and display payment details by payment ID (placeholder for actual retrieval logic)
        Payment retrievedPayment = paymentService.getPayment(payment1.getPaymentId());
        if (retrievedPayment != null) {
            System.out.println("Retrieved payment details for ID: " + retrievedPayment.getPaymentId());
        } else {
            System.out.println("Payment not found.");
        }
    }
}
