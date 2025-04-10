package opgave03;

import opgave03.models.observer.User;
import opgave03.models.subject.ObservableBag;

public class Main {

    public static void main(String[] args) {
        ObservableBag<String> nameBag = new ObservableBag<>();
        for (int observerCount = 1; observerCount <= 2; observerCount++) {
            nameBag.registerObserver(new User<>());
        };
        nameBag.add("Sarah");
        nameBag.add("Martin");
        nameBag.remove("Martin");
    }

}
