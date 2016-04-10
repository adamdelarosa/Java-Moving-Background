package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.layout.Background;
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
        scene.setFill(Color.BLACK);
        stage = primaryStage;
        stage.sizeToScene();
        stage.setScene(scene);
        //stage.setResizable(false);
        stage.show();

        MainStarter();
        StackPane stackPane = new StackPane();
        BackgroundImage myBI= new BackgroundImage(new Image("sample/asset/splash.jpg",32,32,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
//then you set to your node
        stackPane.setBackground(new Background(myBI));

    }

    public void MainStarter() {
        sample.Background bg = new sample.Background();
        bg.changeBackground();
    }
    public static void main(String[] args) {
        launch(args);
        /////////////
    }
}
