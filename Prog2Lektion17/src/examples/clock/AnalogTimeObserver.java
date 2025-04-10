package examples.clock;

import java.time.LocalTime;

public class AnalogTimeObserver implements TimeObserver{
    private char[] arms = {'|', '/', '-', '\\'};
    @Override
    public void notify(LocalTime time) {
        System.out.println(arms[time.getSecond()%4]);
    }
}
