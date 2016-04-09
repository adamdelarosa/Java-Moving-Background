package sample;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Background {

    Main changeBG,main;

    int x=30;
    int y=30;
    Image backGroundimageSpace = new Image("sample/asset/splash.jpg");

    public Background(Main changebg) {
        changeBG = changebg;
    }

    public void changeBackground() {


        ImageView imageViewOne = new ImageView();
        imageViewOne.setImage(backGroundimageSpace);
        main.getBox().getChildren().add(imageViewOne);
        main.getRoot().getChildren().add(main.getBox());
    }
}
