package api;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Api_Connect extends Application {
	
	private static final String API_URL = "https://192.168.10.109:8080/auth/login";

	    public void start(Stage primaryStage) throws Exception {
	        Label label = new Label("Loading...");
	        StackPane root = new StackPane(label);
	        Scene scene = new Scene(root, 300, 250);
	        primaryStage.setScene(scene);
	        primaryStage.show();

        // Créer un nouveau thread pour faire la requête HTTP
        Thread thread = new Thread(() -> {
            try {
                // Créer un objet URL pour le point de terminaison de l'API
                URL url = new URL(API_URL);

                // Ouvrir une connexion HTTP au point de terminaison de l'API
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                // Définissez la méthode de requête sur GET
                connection.setRequestMethod("GET");

                // Lire la réponse de l'API
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Mettre à jour l'interface utilisateur avec la réponse de l'API
                label.setText(response.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread.start();
    }

    public static void main(String[] args) {
        launch(args);
    }

	
}


