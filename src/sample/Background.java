package sample;

/**
 * Created by ROSA on 4/4/16.
 */

public class Background {

    Main changeBG,firstStage;

    public Background(Main changebg,Main firststage){
        changeBG = changebg;
        firstStage  =firststage;
    }

    public void changeBackground(){
        changeBG.root.setStyle("-fx-background-color: #FFFF3E;");
        firstStage.getStage().setTitle("Hello BG");
    }
}
