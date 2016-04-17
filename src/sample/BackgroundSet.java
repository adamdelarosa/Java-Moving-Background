package sample;

import javafx.scene.layout.HBox;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import java.util.Random;

public class BackgroundSet {

    Main main;
    public HBox boxOne = new HBox();
    private Random rndmStarX = new Random();
    private Thread backgroundScrollRunner = new Thread();
    Circle circleMain = new Circle();
    int xPoz = rndmStarX.nextInt(450);

    BackgroundSet(){
        paintComponent();
        changeBackground();
    }

    public void paintComponent() {
        circleMain.setRadius(1);
        circleMain.setFill(Color.WHITE);
        backgroundScrollRunner = new Thread(() -> {
            while (true) {

                for (int yPoz = 0; true; yPoz += 2) {
                    try {
                        Circle circle = new Circle();
                        circleMain = circle;
                        boxOne.setLayoutX(xPoz);
                        boxOne.setLayoutY(yPoz);
                        Thread.sleep(50);
                    } catch (InterruptedException ie) {}
                }
            }
        });
        backgroundScrollRunner.start();
    }

    public void changeBackground() {
        boxOne.getChildren().add(circleMain);
        main.getRoot().getChildren().add(boxOne);
    }

}