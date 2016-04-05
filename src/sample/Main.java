package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;

public class Main extends Application {

    public Pane root = new Pane();
    public Thread t1 = new Thread();

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 800));
        primaryStage.show();
    }



    public void change() {
        root.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
    }



    public static void main(String[] args) {
        launch(args);
    }
}
