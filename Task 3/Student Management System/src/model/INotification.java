package model;

/**
 * Interface representing the behavior of sending notifications.
 * Implementing classes must define how to send notifications (e.g., email, SMS).
 */
public interface INotification {

    /**
     * Sends a notification to a recipient.
     *
     * @param message   The message to be sent.
     * @param recipient The recipient's contact (e.g., email or phone number).
     */
    void sendNotification(String message, String recipient);
}
