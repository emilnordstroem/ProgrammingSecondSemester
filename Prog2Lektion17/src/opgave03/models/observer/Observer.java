package opgave03.models.observer;

public interface Observer <E> {

    void update(E element, int size, String message);

}
