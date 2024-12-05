package model;

/**
 * Represents an SMS notification.
 * This class extends Notification and implements the sendNotification method.
 */
public class SMSNotification extends Notification {

    /**
     * Constructor to initialize an SMSNotification with the given message and recipient.
     *
     * @param message   The message content for the SMS notification.
     * @param recipient The recipient's phone number.
     */
    public SMSNotification(String message, String recipient) {
        super(message, recipient);
    }

    /**
     * Sends the SMS notification.
     * For demonstration, we simply print the message and recipient (simulating sending an SMS).
     *
     * @param message   The message to be sent.
     * @param recipient The recipient's phone number.
     */
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending SMS to: " + recipient);
        System.out.println("Message: " + message);
    }
}
