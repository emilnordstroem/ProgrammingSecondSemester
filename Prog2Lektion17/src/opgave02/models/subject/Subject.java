package opgave02.models.subject;

import opgave02.models.observer.Observer;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void updateObservers();

}
