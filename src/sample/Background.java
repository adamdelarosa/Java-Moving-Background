package sample;

import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Line;

import java.awt.*;
import java.awt.image.BufferedImage;


public class Background {

    Main main;
    int moveX = 8000;
    public static HBox boxOne = new HBox();
    final ImageView imageOne = new ImageView("sample/asset/splash.jpg");
    final ImageView imageTwo = new ImageView("sample/asset/splash.jpg");

    Thread backgroundScrollRunner = new Thread();

    Polygon polyline = new Polygon();


    public void changeBackground() {


        Arc arc = new Arc();

        arc.setRadiusX(20);
        arc.setRadiusY(20);
        arc.setLength(360);
        arc.setType(ArcType.ROUND);

        backgroundScrollRunner = new Thread(() -> {
        while(true) {
            try {
                boxOne.setLayoutY(100);

                Thread.sleep(10);

                boxOne.setLayoutY(500);

                //imageViewOne.setFitHeight(moveX);

            }catch (InterruptedException ie){
                System.out.println(ie + "FAIL.");
            }
            //System.out.println(moveX);

            }



            });
            backgroundScrollRunner.start();
        boxOne.getChildren().add(arc);
        main.getRoot().getChildren().add(boxOne);



    }
}
