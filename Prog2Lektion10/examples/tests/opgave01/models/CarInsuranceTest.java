package opgave01.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceTest {

    @Test
    void calculatePremium() {
        CarInsurance carInsurance = new CarInsurance(1000);
        double actualResult = carInsurance.calculatePremium(20, false, 0);
        assertEquals(1250, actualResult);
    }
}