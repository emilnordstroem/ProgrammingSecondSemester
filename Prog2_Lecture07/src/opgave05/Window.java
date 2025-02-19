package opgave05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Window extends Application {
    private static final double branchAngle = Math.toRadians(30);
    private static final double branchLength = 0.6;
    private static final double maxTotalLength = 10;


    @Override
    public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        StackPane root = new StackPane();
        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Opgave 5");
        primaryStage.show();

        treeFormation(graphicsContext, 400, 550, -Math.PI / 2, 100, 0);
    }

    private void treeFormation(GraphicsContext graphicsContext, double x, double y,
                               double angle, double length, int depth) {
        if (depth > maxTotalLength || length < 5) {
            return;
        }

        double endX = x + Math.cos(angle) * length;
        double endY = y + Math.sin(angle) * length;

        graphicsContext.setStroke(Color.BROWN);
        graphicsContext.setLineWidth(Math.max(1, 5 - depth));
        graphicsContext.strokeLine(x, y, endX, endY);

        treeFormation(graphicsContext, endX, endY, angle - branchAngle, length * branchLength, depth + 1);
        treeFormation(graphicsContext, endX, endY, angle + branchAngle, length * branchLength, depth + 1);
    }

}