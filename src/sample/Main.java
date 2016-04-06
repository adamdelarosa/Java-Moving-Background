package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Parent root;
    Background background = new Background(this);

    @Override
    public void start(Stage stage) throws Exception {
        root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        root.setStyle("-fx-background-color: #F0591E;");

        Scene scene = new Scene(root);

        stage.setTitle("FXErcycton v1.0.0");

        stage.setScene(scene);
        stage.show();
        change();
    }



    public void change() {
       // root.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
        background.changeBackground();

    }



    public static void main(String[] args) {
        launch(args);
    }
}
