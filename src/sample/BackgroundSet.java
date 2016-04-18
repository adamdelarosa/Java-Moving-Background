package sample;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class BackgroundSet {

    public Main main;
    Image image = new Image("sample/asset/splash.jpg");
    ImageView iv1 = new ImageView();
    private Thread backgroundScrollRunner = new Thread();
    Rectangle2D viewportRect = new Rectangle2D(500, 500, 500, 500);


    BackgroundSet(){
        paintComponent();
    }

    public void paintComponent() {
        iv1.setImage(image);
        iv1.setViewport(viewportRect);


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
        main.getRoot().getChildren().add(boxOne);
    }

}

