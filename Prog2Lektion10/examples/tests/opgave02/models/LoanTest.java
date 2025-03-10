package opgave02.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    @Test
    void calculateFine() {
        Loan loan = new Loan(LocalDate.of(2025, 3,1));
        double actualResult = loan.calculateFine(LocalDate.now(), true);
        assertEquals(60, actualResult);
    }
}