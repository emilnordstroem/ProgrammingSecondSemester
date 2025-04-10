package opgave05.gui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import opgave05.interfaces.Observer;
import opgave05.interfaces.Subject;

public class SubWindow extends Stage implements Observer {
    private final GridPane pane = new GridPane();
    private Subject subject;

    public SubWindow(String title, Stage owner, Subject subject) {
        this.subject = subject;
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);

        this.setTitle(title);
        this.initContent();

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    // -------------------------------------------------------------------------

    private final Label lblInfo =  new Label("State: Unsubscribed");

    private void initContent() {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblHeader = new Label("Computer Science is colorful");
        pane.add(lblHeader, 0, 0);

        Button btnSubscribe = new Button("Subscribe");
        pane.add(btnSubscribe, 0, 1);
        btnSubscribe.setOnMouseClicked(event -> {
            subject.registerObserver(this);
        });

        Button btnUnsubscribe = new Button("Unsubscribe");
        pane.add(btnUnsubscribe, 0, 2);
        btnUnsubscribe.setOnMouseClicked(event -> {
            subject.removeObserver(this);
        });

        pane.add(this.lblInfo, 0, 3);
    }

    @Override
    public void update(String color) {
        pane.setStyle("-fx-background-color: " + color);
    }
}