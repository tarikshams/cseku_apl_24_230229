package controller;

import model.Notification;
import view.NotificationView;

/**
 * Controller for handling notification-related actions.
 * Acts as the intermediary between the Notification model and Notification view.
 */
public class NotificationController {

    private Notification model;  // The model representing the notification
    private NotificationView view;  // The view displaying the notification details

    /**
     * Constructor to initialize the controller with a Notification model and Notification view.
     *
     * @param model The notification model to interact with.
     * @param view The view to display the notification details.
     */
    public NotificationController(Notification model, NotificationView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Updates the view to display notification details.
     */
    public void updateView() {
        view.displayNotificationDetails(model);
    }

    /**
     * Sets the message for the notification model.
     *
     * @param message The message to be set for the notification.
     */
    public void setNotificationMessage(String message) {
        model.setMessage(message);
    }
    /**
     * Retrieves the message of the notification from the model.
     *
     * @return The message of the notification.
     */
    public String getMessage(){
        return model.getMessage();
    }
    /**
     * Retrieves the recipient of the notification from the model.
     *
     * @return The recipient of the notification.
     */
    public String getRecipient(){
        return model.getRecipient();
    }
    /**
     * Updates the message of the notification in the model.
     *
     * @param message The message to set for the notification.
     */

    public void setMessage(String message){
        model.setMessage(message);
    }
    /**
     * Updates the recipient of the notification in the model.
     *
     * @param recipient The recipient to set for the notification.
     */
    public void setRecipient(String recipient){
        model.setRecipient(recipient);
    }
}
