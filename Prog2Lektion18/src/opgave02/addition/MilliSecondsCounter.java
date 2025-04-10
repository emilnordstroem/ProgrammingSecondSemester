package opgave02.addition;

import opgave02.component.AlgorithmComponent;

import java.time.Duration;
import java.time.Instant;

public class MilliSecondsCounter extends AdditionDecorator {

    public MilliSecondsCounter(AlgorithmComponent component) {
        super(component);
    }

    @Override
    public void execute() {
        Instant start = Instant.now();
        super.getComponent().execute();
        Instant finish = Instant.now();
        System.out.printf("%nDuration of run: %s ms",
                Duration.between(start, finish).toMillis());

    }
}
