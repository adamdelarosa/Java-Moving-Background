package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class BackgroundSet {

    public Main main;
    Image image = new Image("sample/asset/splash.jpg");
    ImageView iv1 = new ImageView();


    BackgroundSet(){
        paintComponent();
    }

    public void paintComponent() {
        iv1.setImage(image);
        iv1.setFitWidth(100);
        iv1.setPreserveRatio(true);
        iv1.setSmooth(true);
        iv1.setCache(true);
        System.out.println("sa");
        changeBackground();
    }

    public void changeBackground() {
        HBox boxOne = new HBox();
        boxOne.getChildren().add(iv1);
        main.getRoot().getChildren().add(boxOne);
    }

}


/*


    private Thread backgroundScrollRunner = new Thread();

    public void paintComponent() {

        boxOne.setBackground(new Background(myBI));


        backgroundScrollRunner = new Thread(() -> {
        });
        backgroundScrollRunner.start();
    }*/
