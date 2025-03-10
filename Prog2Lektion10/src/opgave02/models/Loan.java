package opgave02.models;

import java.time.LocalDate;

public class Loan {
    private LocalDate returnDate;

    public Loan(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int calculateFine(LocalDate actualDate, boolean adult) {
        int overdueDays = actualDate.compareTo(returnDate);
        int[][] fines = {
                {10, 30, 45},
                {20, 60, 90}
        };

        int fine = 0;

        if(overdueDays >= 15){
            if(adult){
                fine += fines[1][2];
            } else {
                fine += fines[0][2];
            }
        } else if (overdueDays >= 8) {
            if(adult){
                fine += fines[1][1];
            } else {
                fine += fines[0][1];
            }
        } else if (overdueDays >= 1) {
            if(adult){
                fine += fines[1][0];
            } else {
                fine += fines[0][0];
            }
        }
        return fine;
    }

}