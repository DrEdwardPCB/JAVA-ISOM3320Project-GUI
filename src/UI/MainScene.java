package UI;

import Main.Config;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainScene extends BorderPane {
    //try not to use fxml, is very annoying


    //All ui element are created as private field
    private Label firstMessage;

    //constructor is used to constructor all private UI element
    public MainScene(Stage stage){
        firstMessage=new Label("HelloWorld");
        Connect();
        Style();
    }

    //connect UI element to form a DOM tree
    public void Connect(){
        this.setTop(firstMessage);
    }
    //refer to Config and add class to the label
    //if wanted to change style, change Application.css
    public void Style(){
        this.getStylesheets().add(Config.CSS_STYLES);
    }


}
