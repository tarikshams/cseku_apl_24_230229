package service;

import core.Notification;

/**
 * The NotificationService class is responsible for sending notifications to students.
 * It adheres to the Single Responsibility Principle (SRP) by focusing solely on
 * the notification sending functionality. It also follows the Open/Closed Principle (OCP)
 * by allowing new types of notifications to be added without modifying this class.
 */
public class NotificationService {

    /**
     * Sends a notification to the student based on the provided notification object.
     *
     * @param notification the notification to be sent
     */
    public void sendNotification(Notification notification) {
        // Delegate the responsibility of sending the notification to the notification object.
        notification.sendNotification();
    }
}
