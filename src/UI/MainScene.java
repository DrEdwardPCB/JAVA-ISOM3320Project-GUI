package UI;

import Main.Config;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainScene extends BorderPane {
    //try not to use fxml, is very annoying


    //All ui element are created as private field
    private Label firstMessage;
    private Label secondMessage;

    //menu
    private MenuBar menuBar;
    private Menu fileMenu;
    private MenuItem importFile;
    private MenuItem exportFile;

    //constructor is used to constructor all private UI element
    public MainScene(Stage stage){
        firstMessage=new Label("HelloWorld");
        secondMessage=new Label("Created by Edward as example");

        menuBar=new MenuBar();
        fileMenu=new Menu("File");
        importFile=new MenuItem("Import");
        exportFile=new MenuItem("Export");


        Connect();
        Style();
    }

    //connect UI element to form a DOM tree
    public void Connect(){

        fileMenu.getItems().addAll(importFile,exportFile);
        menuBar.getMenus().add(fileMenu);
        this.setTop(menuBar);
        this.setCenter(firstMessage);
        this.setBottom(secondMessage);
    }
    //refer to Config and add class to the label
    //if wanted to change style, change Application.css
    public void Style(){

        this.getStylesheets().add(Config.CSS_STYLES);
        firstMessage.getStyleClass().add("haha");

    }


}
