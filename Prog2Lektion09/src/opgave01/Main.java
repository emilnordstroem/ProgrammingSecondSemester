package opgave01;

public class Main {
    private static final String target = "XMAS";
    private static char[][] input = {
            {'M', 'M', 'M', 'S', 'X', 'X', 'M', 'A', 'S', 'M'},
            {'M', 'S', 'A', 'M', 'X', 'M', 'S', 'M', 'S', 'A'},
            {'A', 'M', 'X', 'S', 'X', 'M', 'A', 'A', 'M', 'M'},
            {'M', 'S', 'A', 'M', 'A', 'S', 'M', 'S', 'M', 'X'},
            {'X', 'M', 'A', 'S', 'A', 'M', 'X', 'A', 'M', 'M'},
            {'X', 'X', 'A', 'M', 'M', 'X', 'X', 'A', 'M', 'A'},
            {'S', 'M', 'S', 'M', 'S', 'A', 'S', 'X', 'S', 'S'},
            {'S', 'A', 'X', 'A', 'M', 'A', 'S', 'A', 'A', 'A'},
            {'M', 'A', 'M', 'M', 'M', 'X', 'M', 'M', 'M', 'M'},
            {'M', 'X', 'M', 'X', 'A', 'X', 'M', 'A', 'S', 'X'}
    };
    private static final int gridSize = input.length;

    public static void main(String[] args) {
        System.out.println(totalOccurrenceOfXmas(input));
    }

    private static int totalOccurrenceOfXmas(char[][] grid) {
        int result = 0;
        for (int row = 0; row < gridSize; row++) {
            for (int column = 0; column < gridSize; column++) {
                result += occurrenceOfTarget(grid, row, column);
            }
        }
        return result;
    }

    private static int occurrenceOfTarget(char[][] grid, int row, int col) {
        int result = 0;
        int[] xDirection = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] yDirection = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int direction = 0; direction < 8; direction++) {
            if (occurrenceAtDirection(grid, row, col, xDirection[direction], yDirection[direction])) {
                result++;
            }
        }
        return result;
    }

    private static boolean occurrenceAtDirection(char[][] grid, int row, int col, int xDirection, int yDirection) {
        for (int index = 0; index < target.length(); index++) {
            int currentRow = row + index * xDirection;
            int currentColumn = col + index * yDirection;
            if (currentRow < 0 || currentRow >= gridSize || currentColumn < 0 || currentColumn >= gridSize
                    || grid[currentRow][currentColumn] != target.charAt(index)) {
                return false;
            }
        }
        return true;
    }

    private static boolean occurringX(char[][] grid, int row, int column) {
        if (row <= 0 || row >= gridSize - 1 || column <= 0 || column >= gridSize - 1) {
            return false;
        }

        return  (grid[row - 1][column - 1] == 'M' && grid[row + 1][column + 1] == 'S' && // Top left to bottom right
                grid[row - 1][column + 1] == 'M' && grid[row + 1][column - 1] == 'S' && // Top right to bottom left
                grid[row][column] == 'A') // Middle
                ||
                (grid[row + 1][column + 1] == 'M' && grid[row - 1][column - 1] == 'S' && // Bottom right to top left
                        grid[row + 1][column - 1] == 'M' && grid[row - 1][column + 1] == 'S' && // Bottom left to top right
                        grid[row][column] == 'A') // Middle
                ||
                (grid[row - 1][column - 1] == 'M' && grid[row + 1][column + 1] == 'M' && // Top left and bottom right are M
                        grid[row - 1][column + 1] == 'S' && grid[row + 1][column - 1] == 'S' && // Top right and bottom left are S
                        grid[row][column] == 'A') // Middle
                ||
                (grid[row + 1][column + 1] == 'S' && grid[row - 1][column - 1] == 'S' && // Bottom right and top left are S
                        grid[row + 1][column - 1] == 'M' && grid[row - 1][column + 1] == 'M' && // Bottom left and top right are M
                        grid[row][column] == 'A') // Middle
                ||
                (grid[row - 1][column - 1] == 'M' && grid[row + 1][column + 1] == 'S' && // Top left to bottom right
                        grid[row - 1][column + 1] == 'S' && grid[row + 1][column - 1] == 'M' && // Top right to bottom left
                        grid[row][column] == 'A') // Middle
                ||
                (grid[row + 1][column + 1] == 'M' && grid[row - 1][column - 1] == 'S' && // Bottom right to top left
                        grid[row + 1][column - 1] == 'S' && grid[row - 1][column + 1] == 'M' && // Bottom left to top right
                        grid[row][column] == 'A'); // Middle

    }
}