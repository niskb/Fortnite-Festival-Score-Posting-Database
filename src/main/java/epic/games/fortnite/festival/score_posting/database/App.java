package epic.games.fortnite.festival.score_posting.database;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    private final String VIEW_PATH = "view/";
    private final String LOAD_FXML_FILE_NAME = "home";

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML(VIEW_PATH + LOAD_FXML_FILE_NAME));
        stage.setTitle("Fortnite Festival Score Posting Database");
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
