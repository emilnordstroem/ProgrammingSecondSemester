package opgave02;

import opgave02.addition.MilliSecondsCounter;
import opgave02.component.AlgorithmComponent;
import opgave02.component.SieveOfEratosthenes;

public class Opgave02 {
    public static void main(String[] args) {
        AlgorithmComponent sieveOfEratosthenes = new SieveOfEratosthenes(1000000);
        sieveOfEratosthenes = new MilliSecondsCounter(sieveOfEratosthenes);
        sieveOfEratosthenes.execute();
    }
}
