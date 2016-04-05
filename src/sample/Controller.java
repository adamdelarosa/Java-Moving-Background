package sample;

import javafx.animation.FillTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controller {

    Main Root;

    Controller(Pane rooter){
        rooter = rooter;
    }


    public void animateLogo() {
        Rectangle rect = new Rectangle (366, 366, 366, 366);
        FillTransition ft = new FillTransition(Duration.millis(1000), rect, Color.RED, Color.BLACK);
        ft.setCycleCount(400);
        ft.setAutoReverse(true);
        ft.play();
        rooter.root.getChildren().add(ft.getShape());

        ft.play();

    }
}


