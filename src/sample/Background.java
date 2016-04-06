package sample;

/**
 * Created by ROSA on 4/4/16.
 */

public class Background {

    Main changeBG;

    public Background(Main changebg){
        changeBG = changebg;
    }

    public void changeBackground(){
        changeBG.root.setStyle("-fx-background-color: #FFFF3E;");
    }
}
