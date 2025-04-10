package opgave05.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import opgave05.interfaces.Observer;
import opgave05.interfaces.Subject;

import java.util.HashSet;
import java.util.Set;

public class MainWindow extends Application implements Subject {
    private Stage owner;
    private final GridPane pane = new GridPane();
    private final Set<Observer> observers = new HashSet<>();

    @Override
    public void start(Stage stage) {
        owner = stage;
        owner.setTitle("Ex. 4: Observer Pattern");
        this.initContent();

        Scene scene = new Scene(this.pane);
        stage.setScene(scene);
        stage.show();
    }

    // ------------------------------------------------------------------------

    private void initContent() {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblNumber = new Label("Number");
        pane.add(lblNumber, 0, 0);

        ToggleGroup group = new ToggleGroup();

        RadioButton rbnRed = new RadioButton("Red");
        pane.add(rbnRed, 0, 1);
        rbnRed.setToggleGroup(group);
        rbnRed.setOnAction(event -> this.colorAction(rbnRed.getText()));

        RadioButton rbnGreen = new RadioButton("Green");
        pane.add(rbnGreen, 0, 2);
        rbnGreen.setToggleGroup(group);
        rbnGreen.setOnAction(event -> this.colorAction(rbnGreen.getText()));

        RadioButton rbnBlue = new RadioButton("Blue");
        pane.add(rbnBlue, 0, 3);
        rbnBlue.setToggleGroup(group);
        rbnBlue.setOnAction(event -> this.colorAction(rbnBlue.getText()));

        Button btnShowFrame1 = new Button("Open SubFrame 1");
        pane.add(btnShowFrame1, 0, 4);
        btnShowFrame1.setOnMouseClicked(event -> {
            SubWindow frame1 = new SubWindow("Frame 1", owner, this);
            frame1.show();
        });

        Button btnShowFrame2 = new Button("Open SubFrame 2");
        pane.add(btnShowFrame2, 0, 5);
        btnShowFrame2.setOnMouseClicked(event -> {
            SubWindow frame2 = new SubWindow("Frame 2", owner, this);
            frame2.show();
        });
    }

    // ------------------------------------------------------------------------

    private String color;

    private void colorAction(String color){
        this.color = color.toLowerCase();
        pane.setStyle("-fx-background-color: " + color.toLowerCase());
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer currentObserver : observers) {
            currentObserver.update(color);
        }
    }

}
