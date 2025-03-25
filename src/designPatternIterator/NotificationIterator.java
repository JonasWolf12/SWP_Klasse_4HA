package designPatternIterator;

/**
 * An iterator for traversing an array of {@code Notification} objects.
 */
public class NotificationIterator implements Iterator {

    /**
     * The array of {@code Notification} objects.
     */
    private Notification[] notificationList;

    /**
     * The current position in the array.
     */
    private int pos;

    /**
     * Initializes the iterator with the given notification array.
     *
     * @param notificationList the array to iterate over.
     */
    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
        this.pos = 0;
    }

    /**
     * Returns the next {@code Notification} in the array.
     *
     * @return the next notification.
     */
    public Object next() {
        Notification notification = notificationList[pos];
        pos++;
        return notification;
    }

    /**
     * Checks if there are more notifications to iterate over.
     *
     * @return {@code true} if there are more notifications, {@code false} otherwise.
     */
    public boolean hasNext() {
        return pos < notificationList.length && notificationList[pos] != null;
    }
}
