package sample;

import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Background {

    Main main;
    int moveX = 8000;
    public static HBox boxOne = new HBox();
    final ImageView image = new ImageView("sample/asset/splash.jpg");

    public void changeBackground() {

        boxOne.getChildren().add(image);
        main.getRoot().getChildren().add(boxOne);

        image.setLayoutX(535);
        image.setLayoutY(330);



        Thread backgroundScrollRunner = new Thread(() -> {
        for (moveX = 0; moveX <= 1000; moveX++) {
            try {
                Thread.sleep(20);
                ////imageViewOne.setFitHeight(moveX);

                image.setOnMouseClicked(event -> {
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



    }
}
