package opgave04.model;

public class Absence {
    private int[][] absenceSchema = {
            {2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0},
            {1, 2, 1, 2, 1, 2, 0, 2, 0, 0, 4, 0},
            {5, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0}
    };

    public void print(){
        String spacing = "          ";

        System.out.print("Elev/Måned");
        for(int column = 0; column < absenceSchema[0].length; column++){
            System.out.printf("%d, ",
                    column + 1);
        }
        System.out.println();
        for(int row = 0; row < absenceSchema.length; row++){
            System.out.printf("%d:%s",
                    row + 1,
                    spacing
            );
            for(int column = 0; column < absenceSchema[row].length; column++){
                System.out.printf("%d, ",
                        absenceSchema[row][column]);
            }
            System.out.println();
        }
    }

    public int totalAbsence(int studentNumber){
        int total = 0;

        for(int row = 0; row < absenceSchema.length; row++){
            if((row + 1) == studentNumber){
                for(int column = 0; column < absenceSchema[row].length; column++){
                    total += absenceSchema[row][column];
                }
            }
        }

        return total;
    }

    public double average(int studentNumber){
        return totalAbsence(studentNumber) / absenceSchema.length;
    }

    public int studentsWithoutAbsence(){
        int counter = 0;

        for(int row = 0; row < absenceSchema.length; row++){
            if(totalAbsence(row + 1) == 0){
                counter++;
            }
        }

        return counter;
    }

    public int mostAbsence(){
        int studentWithMostAbsence = 1;

        for(int row = 1; row < absenceSchema.length; row++){
            if(totalAbsence(row + 1) > totalAbsence(studentWithMostAbsence)){
                studentWithMostAbsence = (row + 1);
            }
        }

        return studentWithMostAbsence;
    }

    public void reset(int studentNumber){
        int row = studentNumber - 1;
        for(int column = 0; column < absenceSchema[row].length; column++){
            absenceSchema[row][column] = 0;
        }
    }
}
