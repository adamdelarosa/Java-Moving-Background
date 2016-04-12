package sample;

import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.awt.*;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.util.Random;


public class Background {

    Main main;
    private static final int STAR_COUNT = 20000;

    public static HBox boxOne = new HBox();
    Random rndmStar = new Random();
    private final Rectangle[] nodes = new Rectangle[STAR_COUNT];



    Thread backgroundScrollRunner = new Thread();


    public void changeBackground() {

        Circle circle = new Circle();

        circle.setRadius(1);
        circle.setFill(Color.WHITE);

        backgroundScrollRunner = new Thread(() -> {

            for(int yPoz=rndmStar.nextInt(100);1<=2;yPoz+=rndmStar.nextInt(10)){
                try {
                    boxOne.setLayoutY(yPoz);
                    boxOne.setLayoutX(yPoz);

                    Thread.sleep(50);

                    circle.setCenterX(yPoz);
                    circle.setCenterY(yPoz);

                } catch (InterruptedException ie) {
                    System.out.println(ie + "FAIL.");
                }
               // System.out.println(yPoz);
            }

        });
        backgroundScrollRunner.start();

        //Add to Root
        boxOne.getChildren().add(circle);
        main.getRoot().getChildren().add(boxOne);
    }
}
