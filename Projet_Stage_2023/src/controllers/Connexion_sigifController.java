package controllers;

import java.awt.MenuBar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

//import org.json.JSONArray;
import org.json.JSONObject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Menu;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
//import modeles.Sessionutilisateur;
import utiles.Connexion;
import utiles.RequetesHttp;
//import utiles.SqlRequettes;

public class Connexion_sigifController implements Initializable {

	@FXML
	private TextField login;
	@FXML
	private PasswordField password;
	@FXML
	private Button cancelButton;
	@FXML
	private MenuBar menubar;
	@FXML
	private Menu menu;
	
	Connection cnx;
	

	// Event Listener on Button[#cancelButton].onAction
	@FXML
	public void cancel(ActionEvent event) {
		Stage stage = (Stage) cancelButton.getScene().getWindow();
		stage.close();
	}
	
	//private static final String API_URL = "http://192.168.10.109:8080/auth/login";
	
	 
	
		public void connexion(ActionEvent event) throws SQLException, IOException {
			
			String textlogin = (String) login.getText();
			String textpass = (String) password.getText();
			//Boolean recon = true;		
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("login", textlogin);
			jsonObject.put("password", textpass);
			jsonObject.put("reconnexion", true);
			
			HttpURLConnection httpURLConnection = RequetesHttp.httpPost(jsonObject);
			
    
	        StringBuffer response = new StringBuffer();
	        if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
	        	System.out.println("status" + httpURLConnection.getResponseCode());
	        	try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()))) {
	            
	        		/*String inputLine;
	            	
	                 while ((inputLine = bufferedReader.readLine()) != null) {
	               	  response.append(inputLine);
	                 }*/
      
	              Node windows = (Node) event.getSource();
					Stage stage = (Stage)windows.getScene().getWindow();
					stage.close();
	              
	             Interface_principaleController.donneReferencemenu.setDisable(false);
	             Interface_principaleController.titreforestiermenu.setDisable(false);
	             Interface_principaleController.barremenu.setDisable(false);
	             Interface_principaleController.Inventairemenu.setDisable(false);
	             Interface_principaleController.Abattagemenu.setDisable(false);
	             Interface_principaleController.OperationParcmenu.setDisable(false);
	             Interface_principaleController.Transformationmenu.setDisable(false);
	             Interface_principaleController.BoisCemacmenu.setDisable(false);
	             Interface_principaleController.Controlemenu.setDisable(false);
	              
	             System.out.println("status" + httpURLConnection.getResponseCode());
	              //Alert alert = new Alert(AlertType.ERROR,response.toString(),ButtonType.OK);
		  		  	//alert.showAndWait();
	              
	             // Sessionutilisateur sessionutilisateur = new Sessionutilisateur();

	              JSONObject jsonResponse= new JSONObject(bufferedReader.readLine());
	              jsonObject= new JSONObject(response);
	              JSONObject jsonRespons= jsonResponse.getJSONObject("result");
	              
	              String access_token = jsonRespons.getString("access_token");
	              
	              try {
	            	  String sql = "INSERT INTO session_utilisateur(ID_SESSION, LOGIN, ACCESS_TOKEN) VALUES ( "+1+","+"'"+textlogin+"'"+","+"'"+access_token+"'"+")";		
	          		PreparedStatement preparedStatement = cnx.prepareStatement(sql);
	          		preparedStatement.executeUpdate();
					
				} catch (Exception e) {
					System.err.println("erreur  "+ e.getMessage());
				}
	              
	              System.out.println("access_token : "+ access_token);
           
	            }
	            
	            catch (Exception e) {
	                 System.err.println("Error retrieving data: " + e.getMessage());}
       
	          } else {
	        	  System.out.println("status" + httpURLConnection.getResponseCode());
		        	Alert alert = new Alert(AlertType.ERROR,"mot de passe ou login incorrect",ButtonType.OK);
		  		  	alert.showAndWait();
	          }
       
	       }
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		cnx = Connexion.connexionDB();
		
	}
	
	 }


/*
	}
	
	// TODO Autogenerated
		String textlogin = (String) login.getText();
		String textpass = (String) password.getText();
		
		// Créer un objet URL pour le point de terminaison de l'API
		boolean recon = true;
		URL url = new URL(API_URL+"?login="+textlogin+"&password="+textpass+"&reconnexion="+recon);
		
		
		
		System.out.println("loign="+textlogin +" "+"password=" + textpass );
		
		
		// Ouvrir une connexion HTTP au point de terminaison de l'API
		HttpURLConnection connection =(HttpURLConnection)url.openConnection();

		
		// Définissez la méthode de requête sur GET
		
		//setRequestProperty("Content-Length", "" + responseJSONArray.toString(2).getBytes("UTF8").length);
		
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type","application/json; charset=UTF-8");
		connection.setRequestProperty("Content-Length", String.valueOf(3));
		connection.setConnectTimeout(5000);
		connection.setReadTimeout(5000);
		 
		int status = connection.getResponseCode();
		System.out.println("statut " +status );
		if (status !=200) {
			System.out.println("Okkkkkkkkkkkk");
		}
		//Elle prepare la requete
		//st=cnx.prepareStatement(sql);
		 // pour executer la requete SQL
		//result = st.executeQuery();
		boolean boolcon = false ;
		//Permet de parcourir la liste de login pour la recherche de l'élement
		/*while (result.next()) {
			System.out.println("login "+result.getString("LOGIN"));
			if (textlogin.equals(result.getString("LOGIN"))) {
				Stage home = new Stage();
				try {
					fxml = FXMLLoader.load(getClass().getResource("/vues/Parametre_sys.fxml"));
					Scene scene = new Scene(fxml);
					home.setScene(scene);
					home.show();
						//
					Node windows = (Node) event.getSource();
					Stage stage = (Stage)windows.getScene().getWindow();
					stage.close();
					boolcon =true;
					break;
					//Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			} 
		}*/
		
		/*if(!boolcon) {
		  Alert alert = new Alert(AlertType.ERROR, "nom d'utilisateur ou mot de pass incorect",ButtonType.OK);
		  alert.showAndWait();
		}
	}*/