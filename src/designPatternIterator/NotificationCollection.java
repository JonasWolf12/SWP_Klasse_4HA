package designPatternIterator;

/**
 * Represents a collection of notifications with iterator support.
 */
public class NotificationCollection implements Collection {

    private static final int maxItems = 6; // Maximum capacity
    private int numberOfItems = 0;        // Current count
    private Notification[] notificationList;

    /**
     * Initializes an empty notification collection.
     */
    public NotificationCollection() {
        this.notificationList = new Notification[maxItems];
    }

    /**
     * Adds a notification to the collection.
     *
     * @param str the notification message.
     */
    public void addItem(String str) {
        if (numberOfItems >= maxItems) {
            System.err.println("Notification collection is full!");
        } else {
            notificationList[numberOfItems++] = new Notification(str);
        }
    }

    /**
     * Creates an iterator for the collection.
     *
     * @return a {@code NotificationIterator}.
     */
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
