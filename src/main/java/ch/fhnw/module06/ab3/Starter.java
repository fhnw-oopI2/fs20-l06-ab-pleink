package ch.fhnw.module06.ab3;

import ch.fhnw.module06.ab3.ApplicationUI;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent rootPanel = new ApplicationUI();

        Scene scene = new Scene(rootPanel);

        primaryStage.setTitle("BorderPane Test");
        primaryStage.setScene(scene);

        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.centerOnScreen();

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
