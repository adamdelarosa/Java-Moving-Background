package sample;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Background {

    Main main;
    Image backGroundimageSpace = new Image("sample/asset/splash.jpg");
    int moveX = 8000;

    public void changeBackground() {
        ImageView imageViewOne = new ImageView();
        imageViewOne.setImage(backGroundimageSpace);

            Thread backgroundScrollRunner = new Thread(new Runnable() {
                public void run() {

                    // code goes here.
            for (moveX = 0; moveX <= 100; moveX++) {
                try {
                    Thread.sleep(400);
                }catch (InterruptedException ie){
                    System.out.println(ie + "FAIL.");
                }
                System.out.println(moveX);
                if (moveX == 100) {
                    moveX = 0;

                }

            }

                }

            });
        backgroundScrollRunner.start();

        imageViewOne.setFitHeight(moveX);

        main.getBox().getChildren().add(imageViewOne);
        main.getRoot().getChildren().add(main.getBox());


    }
}
