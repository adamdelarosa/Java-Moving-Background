package sample;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class BackgroundSet {

    public Main main;

    Image imageOne = new Image("sample/asset/splash.jpg");
    Image imageTwo = new Image("sample/asset/splash.jpg");


    ImageView iv1 = new ImageView();
    ImageView iv2 = new ImageView();

    private Thread backgroundScrollRunner = new Thread();
    Rectangle2D viewportRectOne = new Rectangle2D(500, 500, 500, 500);
    Rectangle2D viewportRectTwo = new Rectangle2D(500, 500, 500, 500);



    BackgroundSet(){
        paintComponent();
    }

    public void paintComponent() {
        iv1.setImage(imageOne);
        iv1.setViewport(viewportRectOne);
        iv2.setImage(imageTwo);
        iv2.setViewport(viewportRectTwo);


        //Background movement:
        backgroundScrollRunner = new Thread(() -> {
            for(int positionY = 0; true; positionY+=4) {
                try {
                    if(iv1.getTranslateY() == 500){
                        System.out.println("Yes");
                    }

                    iv1.setTranslateY(positionY);

                    backgroundScrollRunner.sleep(50);
                    System.out.println(iv1.getTranslateY());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        backgroundScrollRunner.start();

        //Start Adding to main screen:
        changeBackground();
    }

    public void changeBackground() {
        HBox boxOne = new HBox();
        boxOne.getChildren().add(iv1);
        boxOne.getChildren().add(iv2);
        main.getRoot().getChildren().add(boxOne);
    }

}

