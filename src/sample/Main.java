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
        //root.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 800));
        primaryStage.show();
        change();
    }

    public void change(){

            t1 = new Thread(() -> {
                while (true){
                    root.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
                    root.setBackground(Background.EMPTY);

                    try {
                        t1.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    root.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
                    root.setBackground(Background.EMPTY);

                }
            });
        t1.run();


    }



    public static void main(String[] args) {
        launch(args);
    }
}
