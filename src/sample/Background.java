package sample;

import javafx.scene.layout.HBox;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import java.util.Random;

public class Background {

    Main main;
    public HBox boxOne = new HBox();
    private Random rndmStarX = new Random();
    private Thread backgroundScrollRunner = new Thread();
    private int xPoz = rndmStarX.nextInt(450);

    public void changeBackground() {
            Circle circle = new Circle();
            circle.setRadius(1);
            circle.setFill(Color.WHITE);

        backgroundScrollRunner = new Thread(() -> {
            for(int yPoz=0;1<=2;yPoz+=2){
                try {
                    boxOne.setLayoutX(xPoz);
                    boxOne.setLayoutY(yPoz);
                    circle.setCenterX(xPoz);
                    circle.setCenterY(yPoz);
                    Thread.sleep(50);
                } catch (InterruptedException ie) {}
            }
        });
        backgroundScrollRunner.start();

        //Add to Root

        boxOne.getChildren().add(circle);
        main.getRoot().getChildren().add(boxOne);
    }
}