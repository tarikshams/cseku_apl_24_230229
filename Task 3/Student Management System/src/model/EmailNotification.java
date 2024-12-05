package model;

/**
 * Represents an email notification.
 * This class extends Notification and implements the sendNotification method.
 */
public class EmailNotification extends Notification {

    /**
     * Constructor to initialize an EmailNotification with the given message and recipient.
     *
     * @param message   The message content for the email notification.
     * @param recipient The recipient's email address.
     */
    public EmailNotification(String message, String recipient) {
        super(message, recipient);
    }

    /**
     * Sends the email notification.
     * For demonstration, we simply print the message and recipient (simulating sending an email).
     *
     * @param message   The message to be sent.
     * @param recipient The recipient's email address.
     */
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending Email to: " + recipient);
        System.out.println("Message: " + message);
    }
}
