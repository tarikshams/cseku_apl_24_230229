package core;

import service.interfaces.INotification;

/**
 * Represents a notification sent to students.
 * This abstract class encapsulates the properties and behaviors of a notification.
 * It follows the Single Responsibility Principle (SRP) by focusing solely on
 * notification-related responsibilities, such as holding notification details
 * and providing a method to send the notification.
 */
public abstract class Notification implements INotification {
    private String notificationId; // Unique identifier for the notification
    private String studentId;       // ID of the student receiving the notification
    private String message;         // Content of the notification
    private NotificationType type;  // Type of notification (e.g., EMAIL or SMS)

    /**
     * Constructs a new Notification with the specified details.
     *
     * @param notificationId the unique identifier for the notification
     * @param studentId      the ID of the student receiving the notification
     * @param message        the content of the notification
     * @param type           the type of notification (e.g., EMAIL or SMS)
     */
    public Notification(String notificationId, String studentId, String message, NotificationType type) {
        this.notificationId = notificationId;
        this.studentId = studentId;
        this.message = message;
        this.type = type;
    }

    // Getters and Setters

    /**
     * Gets the unique identifier for the notification.
     *
     * @return the notification ID
     */
    public String getNotificationId() {
        return notificationId;
    }

    /**
     * Sets the unique identifier for the notification.
     *
     * @param notificationId the notification ID
     */
    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    /**
     * Gets the ID of the student receiving the notification.
     *
     * @return the student ID
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * Sets the ID of the student receiving the notification.
     *
     * @param studentId the student ID
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * Gets the content of the notification.
     *
     * @return the notification message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the content of the notification.
     *
     * @param message the notification message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the type of the notification.
     *
     * @return the notification type
     */
    public NotificationType getType() {
        return type;
    }

    /**
     * Sets the type of the notification.
     *
     * @param type the notification type
     */
    public void setType(NotificationType type) {
        this.type = type;
    }

    /**
     * Sends the notification.
     * This method must be implemented by subclasses to define how the notification is sent.
     */
    @Override
    public abstract void sendNotification();
}
