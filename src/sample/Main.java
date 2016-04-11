package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public Scene scene = new Scene(root,450,700);
    public static Group root = new Group();
    public static Stage stage;
    StackPane stackPane = new StackPane();
    Image image = new Image("sample/asset/splash.jpg");



    //Return type:


    public static Group getRoot(){
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        scene.setFill(Color.WHITESMOKE);
        MainStarter();
        stage = primaryStage;
        stage.sizeToScene();
        stage.setScene(scene);
        //stage.setResizable(false);
        stage.show();

    }

    public void MainStarter() {
        sample.Background bg = new sample.Background();
        bg.changeBackground();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
