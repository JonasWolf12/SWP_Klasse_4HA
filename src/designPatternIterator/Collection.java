package designPatternIterator;

/**
 * The {@code Collection} interface provides a method to create an iterator for a collection.
 */
public interface Collection {

    /**
     * Creates an iterator to traverse the collection.
     *
     * @return an {@code Iterator} for the collection.
     */
    public Iterator createIterator();
    
    
    public void addItem(String str);
}
