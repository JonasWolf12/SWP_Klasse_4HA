package designPatternIterator;

/**
 * The {@code Iterator} interface defines methods for iterating over a collection of objects.
 */
public interface Iterator {

    /**
     * Checks if there are more elements to iterate over.
     *
     * @return {@code true} if there are more elements, {@code false} otherwise.
     */
    public boolean hasNext();

    /**
     * Returns the next element in the iteration.
     *
     * @return the next object in the collection.
     */
    public Object next();
}
