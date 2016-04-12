package sample;

import javafx.scene.layout.HBox;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import java.util.Random;

public class Background {

    Main main;
    int i = 0;
    HBox boxOne = new HBox();
    Random rndmStarX = new Random();
    Thread backgroundScrollRunner = new Thread();

    public void changeBackground() {
        int xPoz = rndmStarX.nextInt(450);
        Circle circle = new Circle();
        circle.setRadius(1);
        circle.setFill(Color.BLUE);

        backgroundScrollRunner = new Thread(() -> {
            for(int yPoz=0;1<=2;yPoz+=2){
                try {

                    boxOne.setLayoutX(xPoz);
                    boxOne.setLayoutY(yPoz);
                    circle.setCenterX(xPoz);
                    circle.setCenterY(yPoz);
                    Thread.sleep(50);

                } catch (InterruptedException ie) {
                    System.out.println(ie + "FAIL.");
                }
            }
        });
        backgroundScrollRunner.start();
        //Add to Root
        boxOne.getChildren().add(circle);
        main.getRoot().getChildren().add(boxOne);
    }
}