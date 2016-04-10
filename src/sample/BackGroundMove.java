package sample;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BackGroundMove {

    Main main;
    Image backGroundimageSpace = new Image("sample/asset/splash.jpg");
    int moveX = 8000;

    public void BackGroundMove() {
        ImageView imageViewOne = new ImageView();
        imageViewOne.setImage(backGroundimageSpace);

        Thread backgroundScrollRunner = new Thread(() -> {

            for (moveX = 0; moveX <= 1000; moveX++) {
                try {
                    Thread.sleep(20);
                    ////imageViewOne.setFitHeight(moveX);

                    imageViewOne.setOnMouseClicked(event -> {
                        System.out.println("YES");
                    });

                }catch (InterruptedException ie){
                    System.out.println(ie + "FAIL.");
                }
                //System.out.println(moveX);
                if (moveX == 1000) {
                    moveX = 0;
                }

            }

        });
        backgroundScrollRunner.start();


        main.getBox().getChildren().add(imageViewOne);
        main.getRoot().getChildren().add(main.getBox());


    }
}
