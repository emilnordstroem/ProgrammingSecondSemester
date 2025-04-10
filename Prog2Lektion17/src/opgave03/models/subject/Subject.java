package opgave03.models.subject;

import opgave03.models.observer.Observer;

public interface Subject <E> {

    void registerObserver(Observer<E> observer);

    void removeObserver(Observer<E> observer);

    void updateObservers(E element, String message);

}
