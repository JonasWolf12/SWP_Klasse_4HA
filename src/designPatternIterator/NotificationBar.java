package designPatternIterator;

/**
 * The {@code NotificationBar} class provides functionality to display and manage notifications.
 */
public class NotificationBar {

    /**
     * Collection of notifications.
     */
    private Collection notifications;

    /**
     * Initializes the notification bar with a given notification collection.
     *
     * @param notifications the collection of notifications.
     */
    public NotificationBar(Collection notifications) {
        this.notifications = notifications;
    }

    /**
     * Prints all notifications in the collection using the iterator.
     */
    public void printNotification() {
        Iterator iterator = notifications.createIterator();
        System.out.println("----------- Notification Bar ---------");
        while (iterator.hasNext()) {
            Notification n = (Notification) iterator.next();
            System.out.println(n.getNotification());
        }
    }

    /**
     * Adds a new notification to the collection.
     *
     * @param str the notification message to be added.
     */
    public void addItem(String str) {
        notifications.addItem(str);
    }
}
