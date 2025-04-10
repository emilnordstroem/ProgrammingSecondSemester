package opgave03.models.subject;

import opgave03.models.observer.Observer;

import java.util.*;

public class ObservableBag<E> implements Bag<E>, Subject<E> {
    private Set<Observer<E>> observers = new HashSet<>();
    private HashMap<Integer, E> elementList = new HashMap<>();
    private int size = 0;

    public ObservableBag() {}

    @Override
    public void add(E element) {
        elementList.put(size + 1, element);
        size++;
        updateObservers(element, "added");
    }

    @Override
    public void remove(E element) {
        if (elementList.containsValue(element)) {
            elementList.remove(element);
            size--;
            updateObservers(element, "removed");
        } else {
            System.out.println("Element wasn't found");
        }
    }

    @Override
    public int getCount(E element) {
        return size;
    }

    @Override
    public void registerObserver(Observer<E> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<E> observer) {
        observers.remove(observer);
    }

    @Override
    public void updateObservers(E element, String message) {
        for (Observer<E> observer : observers) {
            observer.update(element, size, message);
        }
    }
}
