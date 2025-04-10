package opgave03.models.subject;

public interface Bag<E> {
    /** Add the element to the bag */
    public void add(E element);

    /** Remove the element from the bag (if it is the bag). */
    public void remove(E element);

    /** Get the count of the string s in the bag. */
    public int getCount(E element);
}
