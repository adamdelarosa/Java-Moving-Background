package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public Parent root;
    public Background background = new Background(this);
    private static Stage stage;

    public static Stage getStage() {
        return stage;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root,450,700);
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
