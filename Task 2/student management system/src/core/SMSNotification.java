package core;

import service.interfaces.INotification;

import static core.NotificationType.SMS;

/**
 * Class to handle sending SMS notifications.
 * This class extends the Notification class and implements the INotification interface
 * to define how to create and send an SMS notification.
 */
public class SMSNotification extends Notification {

    /**
     * Constructs a new SMSNotification with the specified details.
     *
     * @param notificationId the unique identifier for the notification
     * @param studentId      the ID of the student receiving the notification
     * @param message        the content of the SMS notification
     */
    public SMSNotification(String notificationId, String studentId, String message) {
        // Call the superclass constructor to initialize notification details
        super(notificationId, studentId, message, SMS);
    }

    /**
     * Sends an SMS notification to the specified student.
     * This method simulates the action of sending an SMS by printing a message to the console.
     */
    @Override
    public void sendNotification() {
        // Logic to send an SMS notification.
        // Here we simulate the sending of an SMS by printing to the console.
        System.out.println("Sending SMS to " + super.getStudentId() + ": " + super.getMessage());
    }
}
