package Main;

import UI.MainScene;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {

    //store the instance of SceneManager
    private static SceneManager sm;
    private Stage primaryStage;
    private Scene mainScene;

    private SceneManager(){
        this.primaryStage=Driver.stage;
        mainScene=new Scene(new MainScene(primaryStage),1920,1080);
    }

    //get instance of SceneManager, maintain single instance of SceneManager
    public static SceneManager getInstance(){
        if(sm==null){
            sm=new SceneManager();
        }
        return sm;
    }

    public void setScene(SCENELIST scene){
        switch (scene){
            case MainScene:{
                primaryStage.setScene(mainScene);
                break;
            }
        }
    }
}
