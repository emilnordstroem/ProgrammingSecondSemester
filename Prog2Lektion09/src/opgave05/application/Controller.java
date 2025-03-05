package opgave05.application;

import javafx.beans.property.StringProperty;
import javafx.scene.input.MouseButton;
import opgave05.application.model.Board;
import opgave05.application.model.Point;

public class Controller {
    private static Board board = new Board(9, 10);

    public static void handle(Point point, MouseButton button) {
        if (button == MouseButton.SECONDARY && board.getField(point).equals(" ")) {
            board.setField(point, "F");
            return;
        } else if (button == MouseButton.SECONDARY && board.getField(point).equals("F")) {
            board.setField(point, " ");
            return;
        } else if (button == MouseButton.PRIMARY && board.getField(point).equals(" ")) {
            if(board.doesFieldContainsMine(point)){
                board.setField(point, "M");
                return;
            } else {
                int surroundingMines = surroundingMines(point);
                board.setField(point, String.valueOf(surroundingMines));
                if(surroundingMines == 0){
                    // method for revealing fields
                }
                return;
            }
        }
    }

    private static int surroundingMines(Point point){
        return checkSurroundingField(point.getX(), point.getY());
    }

    private static int checkSurroundingField(int x, int y){
        int mineCounter = 0;
        try{
            for(int row = -1; row < 2; row++){
                for(int column = -1; column < 2; column++){
                    if (isMine(x + row, y + column)) {
                        mineCounter++;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // print the exception
        }
        return mineCounter;
    }

    private static boolean isMine(int x, int y){
        return board.doesFieldContainsMine(x, y);
    }

    public static StringProperty getField(int x, int y) {
        return board.getField(x, y);
    }

    public static Board getBoard() {
        return board;
    }
}
