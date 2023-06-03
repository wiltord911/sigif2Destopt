package utiles;
 
 import java.sql.*;

//import com.mysql.jdbc.Statement;
 
public class Connexion {
	public Connexion cn=null;
	public static Connection connexionDB() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sigif?characterEncoding=utf8","root","");
			System.out.println("Connexion reussie");
			return cn;	
	}catch(ClassNotFoundException | SQLException e) {
		System.out.println("Connexion echouée");
		e.printStackTrace();
		return null;
	} 
			
	}	
}
 
 /*public class Connexion {
	 public Connexion cn=null;
	 //private Statement stmt1, stmt2;
	 public static Connection connexionDB() {
     try {
    	 
       //étape 1: charger la classe de driver
       Class.forName("oracle.jdbc.driver.OracleDriver");
       
       //étape 2: créer l'objet de connexion
       Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@//192.168.10.110:1521/otp","sigif","sigif2015");
       
       System.out.println("Connexion reussie");
		return cn;
       
       //étape 3: créer l'objet statement 
      // Statement stmt = con.createStatement();
       
       //étape 4: exécuter la requête
       ResultSet res = stmt.executeQuery("select * from utilisateur");
       
  		while(res.next())
    	System.out.println(res.getInt(1)+"  "+res.getString(2)+"  "+res.getString(3));
       
       //étape 5: fermez l'objet de connexion
       con.close();
     }
     catch(ClassNotFoundException | SQLException e) {
 		System.out.println("Connexion echouée");
 		e.printStackTrace();
 		return null;
     }
   }
 }*/
