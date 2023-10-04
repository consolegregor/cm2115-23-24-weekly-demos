package uk.ac.rgu.topic2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * This example demonstrates a simple JavaFX project, with an FXML scene and associated Controller class
 * 
 * Suggested exercises to deepen your understanding:
 * 
 * 1) Add some more components to the created scene (you'll find it under src/main/resouces/uk/ac/rgu/topic2). Explore
 *      the different components available and think about what they could be used for.
 * 
 * 2) Explore the different properties of different components in the Properties panel of the Scene Builder. For example,
 *      changing the text on a Button or in a Label, or using the Style section to add CSS styling.
 * 
 * 3) Create a new scene and use the setRoot() method below to switch to it from MyScene (using the Controller class). Note: 
 *      we will use a slightly different method of switching scenes in the Smart Home project, and the coursework.
 */
public class App extends Application{

    private static Scene scene = null;
    private static final Map<String, Object> models = new HashMap<>();



    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {

        App.setScene("MyScene", new Object());

        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * Method to set the scene, with a given domain model
     * @param <T>
     * @param fxml
     * @param model
     * @throws IOException
     */    
    public static <T> void setScene(String fxml, T model) throws IOException {

        if(scene == null){
            scene = new Scene(loadFXML(fxml), 640, 480);
        }

        /* Strip off .fxml if it's been passed in the filename */
        if (fxml.endsWith(".fxml")) {
            fxml = fxml.replace(".fxml", "");
        }

        FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        Parent root = loader.load();

        @SuppressWarnings("unchecked")
        Controller<T> controller = (Controller<T>) loader.getController();
        controller.setModel(model);

        scene.setRoot(root);
    }

    /**
     * Method to set the scene. This can only be called if a domain model
     * has previously been used with this scene - otherwise an IOException is thrown
     * @param fxml
     * @throws IOException
     */
    public static void setScene(String fxml) throws IOException{
        /* Strip off .fxml if it's been passed in the filename */
        if(fxml.endsWith(".fxml")){
            fxml = fxml.replace(".fxml","");
        }

        Object model = App.models.get(fxml);

        if(model == null){
            throw new IOException("Scene cannot be used for the first time without a domain model");
        }

        App.setScene(fxml, model);
     }


}
