package model;

/**
 * Abstract class representing a Notification.
 * Implements the INotification interface.
 * This class will be extended by specific notification types such as Email and SMS.
 */
public abstract class Notification implements INotification {

    protected String message;
    protected String recipient;

    /**
     * Constructor to initialize the notification with a message and recipient.
     *
     * @param message   The message content for the notification.
     * @param recipient The recipient's contact (email or phone number).
     */
    public Notification(String message, String recipient) {
        this.message = message;
        this.recipient = recipient;
    }

    /**
     * Gets the message of the notification.
     *
     * @return The message content.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message of the notification.
     *
     * @param message The message content to set.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the recipient of the notification.
     *
     * @return The recipient's contact information.
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Sets the recipient of the notification.
     *
     * @param recipient The recipient's contact information to set.
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     * Abstract method to send the notification.
     * This method will be implemented by the subclasses (Email and SMS).
     *
     * @param message   The message to be sent.
     * @param recipient The recipient of the message.
     */
    @Override
    public abstract void sendNotification(String message, String recipient);
}
