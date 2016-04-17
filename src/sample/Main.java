package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public Scene scene = new Scene(root,450,700);
    public Scene sceneStars = new Scene(nodes,450,700);

    public static Group root = new Group();
    public static Group nodes = new Group();

    public static Stage stage;
    StackPane stackPane = new StackPane();
    Image image = new Image("sample/asset/splash.jpg");


    //Return type:


    public static Group getRoot(){
        return root;
    }
    public static Group getNodes(){
        return nodes;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        scene.setFill(Color.BLACK);
        MainStarter();
        stage = primaryStage;
        stage.sizeToScene();
        //stage.setScene(scene);
        sceneStars.setFill(Color.BLACK);
        stage.setScene(sceneStars);
        //stage.setResizable(false);
        stage.show();
        final Node node = nodes;


    }

    public void MainStarter() {
        new BackgroundSet();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
