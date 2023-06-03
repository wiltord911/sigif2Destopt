package services;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Interface_principale_service {
	
	/**
	 * Elle lance l'execute l'interface connexion_sigif.fxml
	 */
	public static void login(Class<?> clas) {
		
		try {
			//getClass().getResource("/vues/Connexion_sigif.fxml")
	    	FXMLLoader loader = new FXMLLoader(clas.getResource("/vues/Connexion_sigif.fxml"));
	    	//loader.setLocation(Connexion_sigifController.class.getResource("/vues/Connexion_sigif.fxml"));
	    	Parent root=(Parent)loader.load();
	    	Scene scene = new Scene(root,400,400);
	    	Stage stage = new Stage();
	    	stage.setMinWidth(450);   
	    	stage.setMinHeight(550);
	    	stage.setTitle("CONNEXION AU SIGIF");
	    	stage.setScene(scene);
	    	stage.setResizable(false);
	    	//stage.setVisible(true);
	    	//application_modal remplace window_modal
	    	stage.initModality(Modality.APPLICATION_MODAL);
	    	stage.show();
		}
	catch(Exception e) {
	    e.printStackTrace();}
		
	}
	

}
