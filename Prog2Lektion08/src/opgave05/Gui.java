package opgave05;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Gui extends Application {
    private GraphicsContext gc;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400, Color.WHITESMOKE);

        final Canvas canvas = new Canvas(400,400);
        gc = canvas.getGraphicsContext2D();

        gc.setLineWidth(1);
        gc.setStroke(Color.BLACK);
        root. getChildren().add(canvas);
        Point2D pointA = new Point2D(50, 350);
        Point2D pointB = new Point2D(350, 350);
        double height = 300 * Math.sqrt(3) / 2;
        Point2D pointC = new Point2D(200, 350 - height);

        drawTriangle(pointA, pointB, pointC, 0);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Not solved
    private void drawTriangle(Point2D pointA, Point2D pointB, Point2D pointC, int count) {
        if(count >= 5){
            return;
        }
        drawLine(pointA, pointB);
        drawLine(pointA, pointC);
        drawLine(pointB, pointC);
    }

    private void drawLine(Point2D pointA, Point2D pointB) {
        gc.strokeLine(pointA.getX(), pointA.getY(), pointB.getX(), pointB.getY());
    }
}
