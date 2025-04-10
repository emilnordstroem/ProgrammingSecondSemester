package examples.clock;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ConcreteTimeSubject implements TimeSubject {
    private LocalTime time;
    private List<TimeObserver> observers = new ArrayList<>();
    @Override
    public void registerTimeObserver(TimeObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeTimeObserver(TimeObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (TimeObserver observer : observers) {
            observer.notify(time);
        }
    }

    public void changeTime() {
        time = LocalTime.now();
        notifyObservers();
    }
}
