package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class BackgroundSet {

    public Main main;
    Image image = new Image("sample/asset/splash.jpg");
    ImageView iv1 = new ImageView();
    private Thread backgroundScrollRunner = new Thread();



    BackgroundSet(){
        paintComponent();
    }

    public void paintComponent() {
        iv1.setImage(image);
        iv1.setFitWidth(100);
        iv1.setPreserveRatio(true);
        iv1.setSmooth(true);
        iv1.setCache(true);
        iv1.setFitWidth(600);
        iv1.setFitHeight(600);

        //Background movement:
        backgroundScrollRunner = new Thread(() -> {

        });
        backgroundScrollRunner.start();

        //Start Adding to main screen:
        changeBackground();
    }

    public void changeBackground() {
        HBox boxOne = new HBox();
        boxOne.getChildren().add(iv1);
        main.getRoot().getChildren().add(boxOne);
    }

}

