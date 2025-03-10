package opgave03;

/**
 * Keeps track of the 5 most recently used Strings
 * Initial the list contains five empty strings
 */
public interface RecentlyUsedList {
    /**
     * Adds an element to the list. If the list does not contain the string add the string to the start
     * and shift all other elements.
     * If the element is already in the list move it to the start of the list and shift all other elements to the left.
     * @param element to keep track off
     */
    void add(String element);

    /**
     * Removes the element at index parameter, and shift all other elements to the left.
     * @throws IllegalArgumentException if 0 > index > 4
     * @param index the index of the element to remove
     * @return the removed element
     */
    String remove(int index);

    /**
     *
     * @return an array with the five most recently used Strings
     */
    String[] getRecentlyUsed();
}
