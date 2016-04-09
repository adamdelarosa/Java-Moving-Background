package sample;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    Image imageSpace = new Image("sample/asset/splash.jpg");

    public Background(Main changebg) {
        changeBG = changebg;
    }

    public void changeBackground() {

        ImageView imageViewSpace = new ImageView();
        imageViewSpace.setImage(imageSpace);




        changeBG.root.setStyle("-fx-background-color: #FFFF3E;");
        main.getStage().setTitle("Hello BG!"); // <--(stage)
        changeBG.root.setStyle("-fx-background-image: url('sample/asset/splash.jpg')");




    }
}
