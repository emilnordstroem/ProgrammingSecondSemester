package opgave02.component;

import java.time.Duration;
import java.time.Instant;

public class SieveOfEratosthenes extends AlgorithmComponent {
    private int number;

    public SieveOfEratosthenes(int number) {
        this.number = number;
    }

    @Override
    public void execute() {
        findPrimeNumbers(number);
    }

    public void findPrimeNumbers(int n) {
        // Create a boolean array "prime[0..n]" and
        // initialize all entries it as true. A value in
        // prime[i] will finally be false if i is Not a
        // prime, else true.
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p]) {
                // Update all multiples of p greater than or
                // equal to the square of it numbers which
                // are multiple of p and are less than p^2
                // are already been marked.
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for (int i = n - 100; i <= n; i++) {
            if (prime[i])
                System.out.print(i + " ");
        }
    }

}
