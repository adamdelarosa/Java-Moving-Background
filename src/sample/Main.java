package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public Scene scene = new Scene(root,450,700);
    public static Group root = new Group();

    public static Group getRoot(){
        return root;
    }




    @Override
    public void start(Stage primaryStage) throws Exception {
        scene.setFill(Color.BLACK);
        primaryStage.sizeToScene();
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        MainStarter();
    }

    public void MainStarter() {
       // new BackgroundSet();
        new BackGroundMove();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
