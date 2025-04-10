package opgave03.models.observer;

public class User <E> implements Observer<E> {
    @Override
    public void update(E element, int size, String message) {
        System.out.printf("%s %s%nCurrent bag size: %d%n=================%n",
                element,
                message,
                size
        );
    }
}
