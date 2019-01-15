package Main;

import UI.MainScene;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class Driver extends Application {

    public static Stage stage;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        this.stage=primaryStage;
        primaryStage.setTitle("ISOM3320 Group 3");
        primaryStage.setMaximized(true);
        SceneManager.getInstance().setScene(SCENELIST.MainScene);
        primaryStage.show();


        //ensure all thread close when exit the application listen to window close event, in lambda expression
        primaryStage.setOnCloseRequest(t->{
                Platform.exit();
                System.exit(0);
        });
    }
}
