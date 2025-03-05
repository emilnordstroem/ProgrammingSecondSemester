package opgave03;

public class Main {
    public static void main(String[] args) {
        double[][] input = {
                {23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6}
        };
        int[] result = locateSmallest(input);
        System.out.println("Mindste tal er i " + result[0] + ", " + result[1]);
    }

    private static int[] locateSmallest(double[][] input) {
        double smallestValue = input[0][0];
        int[] location = new int[]{0,0};

        for(int row = 0; row < input.length; row++){
            for(int column = 0; column < input[row].length; column++){
                if(input[row][column] < smallestValue){
                    location = new int[]{row, column};
                    smallestValue = input[row][column];
                }
            }
        }
        return location;
    }
}
