package opgave04.models;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void updateObservers(Object object, String message);

}