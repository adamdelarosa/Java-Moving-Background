package sample;

/**
 * Created by ROSA on 4/4/16.
 */

public class Background {

    Main changeBG;

    Main main;

    public Background(Main changebg){
        changeBG = changebg;
    }

    public void changeBackground(){
        changeBG.root.setStyle("-fx-background-color: #FFFF3E;");
        main.getStage().setTitle("Hello BG!");
    }
}
