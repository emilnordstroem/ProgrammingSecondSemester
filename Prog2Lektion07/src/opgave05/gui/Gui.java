package opgave05.gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Gui extends Application {
    GraphicsContext gc;
    private static final int MINIMUM_LENGTH = 10;
    private static final int ANGLE_OFFSET = 30;
    private static final double SCALE_FACTOR = 0.7;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400, Color.ANTIQUEWHITE);

        final Canvas canvas = new Canvas(400, 400);
        gc = canvas.getGraphicsContext2D();

        gc.setLineWidth(2);
        gc.setStroke(Color.SADDLEBROWN);
        root.getChildren().add(canvas);
        drawTree(200, 380, 80, 90, 50);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawTree(double x, double y, int length, int angle, int depth) {
        if (depth == 0 || length < MINIMUM_LENGTH) {
            return;
        }

        double x1 = x + Math.cos(Math.toRadians(angle)) * length;
        double y1 = y - Math.sin(Math.toRadians(angle)) * length;

        gc.strokeLine(x, y, x1, y1);

        drawTree(x1, y1, (int) (length * SCALE_FACTOR), angle - ANGLE_OFFSET, depth - 1);
        drawTree(x1, y1, (int) (length * SCALE_FACTOR), angle + ANGLE_OFFSET, depth - 1);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
