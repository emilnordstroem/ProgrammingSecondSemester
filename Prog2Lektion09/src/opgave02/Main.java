package opgave02;

public class Main {
    public static void main(String[] args) {
        double[][] input = {
                {1, 2, 3, 4.0},
                {5, 6.5, 7, 8},
                {9, 10, 11, 10},
                {13, 14, 15, 16}
        };
        System.out.println(avarageMajorDiagonal(input));
    }

    private static double avarageMajorDiagonal(double[][] input) {
        int counter = 0;
        double total = 0;

        for(int row = 0; row < input.length; row++){
            for(int column = row; column < input[row].length; column++){
                total += input[row][column];
                counter++;
                break;
            }
        }

        return total / counter;
    }


}
