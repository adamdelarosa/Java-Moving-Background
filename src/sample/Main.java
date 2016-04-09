package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public Scene scene = new Scene(root,450,700);
    public static Group root = new Group();
    public static HBox box = new HBox();
    public static Stage stage;

    //Return type:

    public static HBox getBox() {
        return box;
    }

    public static Group getRoot(){
        return root;
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
        Background bg = new Background(this);
        bg.changeBackground();

    }
    public static void main(String[] args) {
        launch(args);
        /////////////
    }
}
