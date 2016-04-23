package sample;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.animation.AnimationTimer;


import java.util.Random;

public class BackGroundMove {

    public Main main;

    private static final int STAR_COUNT = 20000;
    private final Rectangle[] nodes = new Rectangle[STAR_COUNT];
    private final double[] angles = new double[STAR_COUNT];
    private final long[] start = new long[STAR_COUNT];
    private final Random random = new Random();
    //public Scene scenenew = new Scene(new Group(nodes), 800, 600, Color.BLACK);



    BackGroundMove() {
        paintComponent();
        testArea();
    }

    public void testArea() {
        for (int i = 0; i < STAR_COUNT; i++) {
            nodes[i] = new Rectangle(1, 1, Color.WHITE);
            angles[i] = 2.0 * Math.PI * random.nextDouble();
            start[i] = random.nextInt(2000000000);
        }
    }

    public void paintComponent() {
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                final double width = 0.5 * 500;
                final double height = 0.5 * 500;
                final double radius = Math.sqrt(2) * Math.max(width, height);
                for (int i = 0; i < STAR_COUNT; i++) {
                    final Node node = nodes[i];
                    final double angle = angles[i];
                    final long t = (now - start[i]) % 2000000000;
                    final double d = t * radius / 2000000000.0;
                    node.setTranslateX(Math.cos(angle) * d + width);
                    node.setTranslateY(Math.sin(angle) * d + height);
                }
            }
        }.start();
        changeBackground();
    }

    public void changeBackground() {
        HBox boxOne = new HBox();
        boxOne.getChildren().addAll(nodes);

        //main.globalPrimartStage.setScene(scene);
        //main.globalPrimartStage.setTitle("sa32");
        main.getRoot().getChildren().add(boxOne);
    }

}

