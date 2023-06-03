package utiles;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class SqlRequettes implements Initializable{
	public static PreparedStatement preparedStatement;
	public static ResultSet resultSet;
	private static Connection cnx;
	
	/**
	 * Cette requette permettent de faire la selection sur une table passer en parametre
	 * @param nomTable
	 * @return
	 * @throws SQLException
	 */
	public static ResultSet select(String nomTable) throws SQLException {
		
		String sql="select * from "+ nomTable;
		preparedStatement=cnx.prepareStatement(sql);
		resultSet=preparedStatement.executeQuery();
		
		return resultSet;
	}
	
	public static int insert(String nomTable,String login,String accesstoken ) throws SQLException {
		
		//String sql =" INSERT INTO "+nomTable+"(ID_SESSION, LOGIN, POSTE_TRAVAIL, NAVIGATEUR, DATECREA, FLAG, REFRESH_TOKEN, ACCESS_TOKEN)" 
			//	+"VALUES ("+1+","+"'"+login+"'"+","+"'"+null+"'"+","+"'"+null+"'"+","+"'"+null+"'"+","+"'"+null+"'"+","+"'"+null+"'"+","+"'"+accesstoken+"'"+")";
		
		 String sql = "INSERT INTO session_utilisateur(ID_SESSION, LOGIN, ACCESS_TOKEN) VALUES ( "+1+","+"'"+login+"'"+","+"'"+accesstoken+"'"+")";
   		
		PreparedStatement preparedStatement = cnx.prepareStatement(sql);
		
		int result=preparedStatement.executeUpdate();
		
		//System.out.println("result  "+ result);
		
		return result;
		
	}
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cnx = Connexion.connexionDB();
	}
	

}
