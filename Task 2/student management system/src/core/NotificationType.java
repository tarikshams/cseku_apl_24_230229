package core;

/**
 * Enum representing different types of notifications that can be sent to students.
 * Supports Open/Closed Principle (OCP) by allowing for extension with additional types without modifying existing code.
 */
public enum NotificationType {
    /**
     * Email notification type.
     * Used to send notifications via email.
     */
    EMAIL,

    /**
     * SMS notification type.
     * Used to send notifications via SMS.
     */
    SMS
}
