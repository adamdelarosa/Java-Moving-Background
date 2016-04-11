package sample;

import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;

import java.awt.*;
import java.awt.Polygon;
import java.awt.image.BufferedImage;


public class Background {

    Main main;
    int moveX = 8000;
    public static HBox boxOne = new HBox();


    Thread backgroundScrollRunner = new Thread();

    Polygon polyline = new Polygon();


    public void changeBackground() {

        Circle circle = new Circle();
        circle.setCenterX(1);
        circle.setCenterY(100);
        circle.setRadius(1);
        circle.setFill(Color.WHITE);


        backgroundScrollRunner = new Thread(() -> {
            for(int yPoz=0;yPoz<=1000;yPoz+=10){
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
        boxOne.getChildren().add(circle);
        main.getRoot().getChildren().add(boxOne);


    }
}
