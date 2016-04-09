package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public Group root = new Group();
    public Scene scene = new Scene(root,450,700);

    // public Parent root;
    public Background background = new Background(this);
    private static Stage stage;

    public static Stage getStage() {
        return stage;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        scene.setFill(Color.BLACK);

        stage = primaryStage;
        stage.sizeToScene();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();



        MainStarter();
    }

    public void MainStarter() {
        background.changeBackground();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
