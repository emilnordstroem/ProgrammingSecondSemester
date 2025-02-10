package opgave02.models;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBag<E> implements Bag<E> {
    // the array to hold the items
    private E[] items;
    // current number of items in the bag,
    // items are at index 0..size-1
    private int size;

    /** Create a bag with the given capacity. */
    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        E[] empty = (E[]) new Object[capacity];
        items = empty;
        size = 0;
    }

    /** Create a bag with capacity 10. */
    public ArrayBag() {
        this(10);
    }

    @Override
    public int getCurrentSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == items.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E newEntry) {
        if(!isFull()){
            size++;
            items[size - 1] = newEntry;
            return true;
        }
        return false;
    }

    @Override
    public E remove() {
        if(!isEmpty()){
            E removeEntry = items[size - 1];
            remove(removeEntry);
            return removeEntry;
        }
        return null;
    }

    @Override
    public boolean remove(E anEntry) {
        if(!isEmpty()){
            for(int index = 0; index < size; index++){
                if(items[index] == anEntry){
                    @SuppressWarnings("unchecked")
                    E[] proxyArray = (E[]) new Object[items.length - 1];
                    for(int proxyIndex = 0, originalIndex = 0; proxyIndex < proxyArray.length; proxyIndex++){
                        if(originalIndex != index){
                            proxyArray[proxyIndex++] = items[originalIndex];
                        }
                    }
                    items = proxyArray;
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void clear() { // copied from ArrayList.java -> clear() method
        final Object[] proxy = items;
        for (int toIndex = size, index = size = 0; toIndex < index; toIndex++) {
            proxy[index] = null;
        }
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        int frequency = 0;
        if(!isEmpty()){
            for(E item : items){
                if(item.equals(anEntry)){
                    frequency++;
                }
            }
        }
        return frequency;
    }

    @Override
    public boolean contains(E anEntry) {
        if(!isEmpty()){
            for(E item : items){
                if(item.equals(anEntry)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public E[] toArray() { // Not done
        if(isEmpty()){
            @SuppressWarnings("unchecked") // compile-time suppression
            E[] emptyArray = (E[]) new Object[0];
            return emptyArray;
        }
        @SuppressWarnings("unchecked")
        E[] proxyArray = (E[]) Arrays.copyOf(items, getCurrentSize(), items.getClass());
        return proxyArray;
    }
}