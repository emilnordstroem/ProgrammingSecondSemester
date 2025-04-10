package opgave04.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book implements Subject {
    private final String title; // not empty
    private int count;
    private List<Customer> bougtBy = new ArrayList<>();
    private Set<Observer> observers = new HashSet<>();

    public Book(String title) {
        this.title = title;
        this.count = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public void incCount(int amount) {
        count += amount;
    }

    public void decCount(int amount) {
        count -= amount;
        if (count < 5) {
            updateObservers(Buyer.class, "count below 5");
        }
    }

    public void addBougtBy(Customer customer) {
        bougtBy.add(customer);
        Set<Book> previousBoughBooks = new HashSet<>();
        previousBoughBooks.addAll(customer.getBoughtBooks());
        updateObservers(Salesman.class, previousBoughBooks.toString());
    }

    @Override
    public String toString() {
        return title + "(" + count + ")";
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void updateObservers(Object object, String message) {
        for (Observer observer : observers) {
            if (object.getClass().isInstance(observer)) {
                observer.update(message);
            }
        }
    }
}
