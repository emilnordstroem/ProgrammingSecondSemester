package examples.clock;

import java.time.LocalTime;

public interface TimeObserver {
    void notify(LocalTime time);
}
