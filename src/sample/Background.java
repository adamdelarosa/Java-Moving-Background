package sample;


import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

/**
 * Created by ROSA on 4/4/16.
 */

public class Background {

    Main changeBG,main;

    int x=30;
    int y=30;

    public Background(Main changebg) {
        changeBG = changebg;
    }

    public void changeBackground() {
        changeBG.root.setStyle("-fx-background-color: #FFFF3E;");
        main.getStage().setTitle("Hello BG!"); // <--(stage)
        changeBG.root.setStyle("-fx-background-image: url('sample/asset/splash.jpg')");


        //Image in:
        BackgroundImage myBI = new BackgroundImage(new Image("sample/asset/splash.jpg", x, y, false, true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        changeBG.root.setBackground(new Background(myBI));
        changeBG.root.setStyle("-fx-background-image: url(myBI)");



    }
}
