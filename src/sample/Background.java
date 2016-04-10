package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Background {

    Main main;
    Image backGroundimageSpace = new Image("sample/asset/splash.jpg");
    int moveX = 8000;
    ImageView imageViewOne = new ImageView();




    public void changeBackground() {
        imageViewOne.setImage(backGroundimageSpace);
        imageViewOne.setLayoutX(50);
        imageViewOne.setLayoutY(30);

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
