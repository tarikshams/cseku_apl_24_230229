package service.interfaces;

/**
 * Interface for notifications.
 * This interface defines the contract for notification classes, ensuring that they implement
 * the necessary methods to send notifications. It follows the Interface Segregation Principle (ISP),
 * allowing classes to implement only the methods that are relevant to them.
 */
public interface INotification {
    /**
     * Sends a notification to the student.
     * Implementing classes must define how the notification is sent, whether it be through email,
     * SMS, or other means.
     */
    void sendNotification();
}
