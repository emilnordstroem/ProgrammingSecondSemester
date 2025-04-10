package examples.clock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalTimeObserver implements TimeObserver{
    @Override
    public void notify(LocalTime time) {
        System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
