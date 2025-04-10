package examples.clock;

public interface TimeSubject {
    void registerTimeObserver(TimeObserver observer);
    void removeTimeObserver(TimeObserver observer);
    void notifyObservers();
}
