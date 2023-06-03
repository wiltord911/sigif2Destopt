package controllers;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import utiles.Connexion;

public class My_accountController implements Initializable{
	Connection cnx;
	public PreparedStatement st;
	public ResultSet result;
	
	
	@FXML
	private Button close;
	@FXML
	private TextField nom_pre_user;
	@FXML
	private TextField email_user;
	@FXML
	private TextField orga_user;
	@FXML
	private TextField type_user;
	@FXML
	private TextField role_user;
	@FXML
	private TextField sta_user;
	@FXML
	private TextField lang_user;

	// Event Listener on Button[#close].onMouseClicked
	@FXML
	public void closeButton(MouseEvent event) {
		Stage stage = (Stage) close.getScene().getWindow();
		stage.close();
	}
	
	public void showCompte() {
			String sql = "select * from utilisateur";
			
			
			try {
				st=cnx.prepareStatement(sql);
				result=st.executeQuery();
				if(result.next()) {
				
					nom_pre_user.setText(result.getString("nom"));
					nom_pre_user.setText(result.getString("prenom"));
					email_user.setText(result.getString("email"));
					orga_user.setText(result.getString("iudprofil"));
					type_user.setText(result.getString("typeorganisation"));
					role_user.setText(result.getString("iudprofil"));
					sta_user.setText(result.getString("statut"));
					lang_user.setText(result.getString("langue"));
				
				} else {System.out.println("Aucun");;}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cnx = Connexion.connexionDB();
		showCompte();
	}
}
