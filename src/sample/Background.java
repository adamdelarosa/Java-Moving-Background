package sample;

import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Background {

    Main main;
    int moveX = 8000;
    public static HBox boxOne = new HBox();
    final ImageView image = new ImageView("sample/asset/splash.jpg");
    Thread backgroundScrollRunner = new Thread();



    public void changeBackground() {

        image.setX(image.getX() - 432);
        image.setY(image.getY() - 434);


        //i.animate().translationYBy(i.getY() - 10).setDuration(1000);





        backgroundScrollRunner = new Thread(() -> {
        for (moveX = 0; moveX <= 800; moveX+=20) {
            try {
                Thread.sleep(500);
                boxOne.setLayoutY(moveX);

                //imageViewOne.setFitHeight(moveX);

            }catch (InterruptedException ie){
                System.out.println(ie + "FAIL.");
            }
            //System.out.println(moveX);
            if (moveX == 800) {
                moveX = 0;
            }

        }

            });
        backgroundScrollRunner.start();

        boxOne.getChildren().add(image);
        main.getRoot().getChildren().add(boxOne);


    }
}
