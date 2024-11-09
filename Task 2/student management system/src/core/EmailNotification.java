package core;

import service.interfaces.INotification;

import static core.NotificationType.EMAIL;

/**
 * Class to handle sending email notifications.
 * This class extends the Notification class and implements the INotification interface
 * to define how to create and send an email notification.
 */
public class EmailNotification extends Notification {

    /**
     * Constructs a new EmailNotification with the specified details.
     *
     * @param notificationId the unique identifier for the notification
     * @param studentId      the ID of the student receiving the notification
     * @param message        the content of the notification
     */
    public EmailNotification(String notificationId, String studentId, String message) {
        // Call the superclass constructor to initialize notification details
        super(notificationId, studentId, message, EMAIL);
    }

    /**
     * Sends an email notification to the specified student.
     * This method simulates the action of sending an email by printing a message to the console.
     */
    @Override
    public void sendNotification() {
        // Logic to send an email notification.
        // Here we simulate the sending of an email by printing to the console.
        System.out.println("Sending Email to " + super.getStudentId() + ": " + super.getMessage());
    }
}
