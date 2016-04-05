package sample;

import javafx.animation.FillTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.util.Duration;

public class Main extends Application {

    public Pane root = new Pane();
    Controller controller = new Controller();

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 800));
        primaryStage.show();

        Rectangle rect = new Rectangle (366, 366, 366, 366);
        FillTransition ft = new FillTransition(Duration.millis(1000), rect, Color.RED, Color.BLACK);
        ft.setCycleCount(400);
        ft.setAutoReverse(true);
        ft.play();
        root.getChildren().add(ft.getShape());

    }



    public void change() {
        root.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
    }



    public static void main(String[] args) {
        launch(args);
    }
}
