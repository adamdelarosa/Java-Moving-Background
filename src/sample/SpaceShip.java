package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by ROSA on 4/23/16.
 */
public class SpaceShip {

    Main main;
    private Rectangle hyperSpaceShip;
    final ImageView selectedImage = new ImageView();
    Image assetSpaceShip = new Image(Main.class.getResourceAsStream("sample/asset/Ship.png"));



    public SpaceShip(){
        shipMovment();
        addToScreen();
    }


    public void shipMovment(){
        hyperSpaceShip = new Rectangle(50,50, Color.BLUE);
        hyperSpaceShip.setLayoutX(100);
        hyperSpaceShip.setLayoutY(100);



    }

    public void addToScreen(){
        HBox boxForShip = new HBox();
        boxForShip.getChildren().addAll(hyperSpaceShip);
        main.getRoot().getChildren().add(boxForShip);
    }

}
