package opgave03.models;

/**
 * The Ring ADT is a collection of items, where all items have a successor.
 * A Ring object can be pictured as items organized in a circular ring.
 * A ring has a reference to one of the items in the ring,
 * called the current item (unless the ring is empty).
 */
public interface Ring<E> {
    /**
     * Make the successor of the current item the new current item,
     * if the ring is not empty.
     */
    void advance();

    /**
     * Return the current item.
     * Throws EmptyRingException, if the ring is empty.
     */
    E getCurrentItem();

    /**
     * Add the item after the current item,
     * and update the current item to the added item.
     */
    void add(E item);

    /**
     * Remove the item, if it is in the ring.
     * Return true, if the item is removed, return false if not.
     * If the item removed is the current item,
     * the new current item is the item after the removed item.
     */
    boolean removeItem(E item);

    /**
     * Remove the current item.
     * The new current item is the item after the removed item.
     * Throws EmptyRingException, if the ring is empty.
     */
    E removeCurrentItem();

    /** Return the number of items in the ring. */
    int size();

    /** Return true if the ring is empty, return false if not. */
    boolean isEmpty();

}