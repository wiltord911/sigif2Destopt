package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/vues/Interface_principale.fxml"));
 
			// BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 1400, 900);
			primaryStage.setMinWidth(1400);
			primaryStage.setMinHeight(900);
			primaryStage.setTitle("SIGIF DESKTOP");

			// FXMLLoader loader = new FXMLLoader();

			primaryStage.getIcons().add(new Image("/icones/logoSIGIF_64x64.png"));
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
