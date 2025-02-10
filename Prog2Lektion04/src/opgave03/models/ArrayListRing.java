package opgave03.models;

import java.util.ArrayList;

public class ArrayListRing<T> implements Ring<T>{
    private final ArrayList<T> ring = new ArrayList<>();

    public ArrayListRing() {}

    @Override
    public void advance() {
        if(!isEmpty()){
            ring.add(ring.getLast());
        }
    }

    @Override
    public T getCurrentItem() {
        if(!isEmpty()){
            return ring.getLast();
        }
        return null;
    }

    @Override
    public void add(T item) {
        ring.add(item);
    }

    @Override
    public boolean removeItem(T item) {
        return ring.remove(item);
    }

    @Override
    public T removeCurrentItem() {
        if(!isEmpty()){
            T currentItem = ring.getLast();
            ring.remove(currentItem);
            return currentItem;
        }
        return null;
    }

    @Override
    public int size() {
        return ring.size();
    }

    @Override
    public boolean isEmpty() {
        return ring.isEmpty();
    }
}
