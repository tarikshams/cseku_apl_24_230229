package view;

import model.Notification;

/**
 * View class for displaying notification details.
 * Used by the controller to output the result of a notification-related action.
 */
public class NotificationView {

    /**
     * Displays a notification message.
     * This message includes the notification content.
     *
     * @param notification The notification object containing the message.
     */
    public void displayNotificationDetails(Notification notification) {
        // Display the notification message
        System.out.println("Notification: " + notification.getMessage());
    }
}
