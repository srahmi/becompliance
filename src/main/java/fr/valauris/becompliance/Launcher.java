package fr.valauris.becompliance;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Launcher extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    public void start(Stage primaryStage) throws Exception {
        URL fxmlLocation = getClass().getClassLoader().getResource("main.fxml");
        Parent root = FXMLLoader.load(fxmlLocation);
        primaryStage.setTitle("PDF test app");
        primaryStage.setScene(new Scene(root, 1280, 576));
        primaryStage.show();
    }
}
