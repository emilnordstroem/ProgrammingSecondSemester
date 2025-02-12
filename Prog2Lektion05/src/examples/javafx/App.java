package examples.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Click me");
        button.setOnAction(e -> System.out.println("Event handled"));
        Pane pane = new GridPane();
        pane.getChildren().add(button);
        Scene scene = new Scene(pane, 400, 250);
        stage.setTitle("Events");
        stage.setScene(scene);
        stage.show();
    }
}
