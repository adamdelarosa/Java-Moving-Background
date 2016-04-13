package sample;

import javafx.scene.layout.HBox;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;

import java.util.Random;
import java.awt.Graphics;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;


public class Background {

    Main main;
    public HBox boxOne = new HBox();
    private Random rndmStarX = new Random();
    private Thread backgroundScrollRunner = new Thread();
    private Thread backgroundScrollRunner2 = new Thread();
    Circle circleStarNew = new Circle();
    Circle circle = new Circle();



    private int xPoz = rndmStarX.nextInt(450);


    public void paintComponent() {
        backgroundScrollRunner2 = new Thread(() -> {
            while (true) {
                Circle circleStar = new Circle();
                circleStar.setRadius(1);
                circleStar.setFill(Color.WHITE);

                System.out.println("YO");

                for (int yPoz = 0; 1 <= 2; yPoz += 2) {
                    try {
                        boxOne.setLayoutX(xPoz);
                        boxOne.setLayoutY(yPoz);
                        circleStar.setCenterX(xPoz);
                        circleStar.setCenterY(yPoz);
                        Thread.sleep(1000);
                        circleStarNew = circleStar;
                        System.out.println("YO"  +  yPoz);

                    } catch (InterruptedException ie) {
                    }
                }

            }
        });
        backgroundScrollRunner2.start();

    }

    public void changeBackground() {
        circle.setRadius(1);
        circle.setFill(Color.WHITE);

        backgroundScrollRunner = new Thread(() -> {
            for (int yPoz = 0; 1 <= 2; yPoz += 2) {
                try {
                    boxOne.setLayoutX(xPoz);
                    boxOne.setLayoutY(yPoz);
                    circle.setCenterX(xPoz);
                    circle.setCenterY(yPoz);
                    Thread.sleep(50);
                } catch (InterruptedException ie) {
                }
            }
        });
        backgroundScrollRunner.start();

        paintComponent();
        //Add to Root
        boxOne.getChildren().add(circle);

        boxOne.getChildren().add(circleStarNew);
        main.getRoot().getChildren().add(boxOne);
    }

}