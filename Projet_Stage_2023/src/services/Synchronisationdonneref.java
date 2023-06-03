package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import org.json.JSONArray;
import org.json.JSONObject;

import javafx.fxml.Initializable;
import modeles.Organisation;
import modeles.Siteoper;
import utiles.Connexion;
import utiles.RequetesHttp;
	public class Synchronisationdonneref implements Initializable{
	
		
			//String Api = RequetesHttp.ApiSite();
		//private static  String API_SITE = "http://192.168.10.109:8080/donneeReference/sites/all";
			
				public  void methodeSite(Connection cnx) {
					
					HttpURLConnection httpURLConnection = RequetesHttp.httpGet("GET");
					
					 try {
						if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
						       Siteoper siteoper = new Siteoper();
						    	
						    	try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()))) {
						        	
						          JSONObject jsonResponse= new JSONObject(bufferedReader.readLine());
						          System.out.println("json "+jsonResponse);
						          
						          JSONArray jsonArray = jsonResponse.getJSONArray("result");
					          
						          int ligne = 0;
					          for(int i=0; i < jsonArray.length(); i++) {  
						        	  ligne+=1;
						        	  
						              siteoper.setIdsiteoper(jsonArray.getJSONObject(i).getInt("IDSITEOPER")) ;
						              siteoper.setTypeorganisation(jsonArray.getJSONObject(i).optString("TYPEORGANISATION")) ;
						              siteoper.setIdorganisation(jsonArray.getJSONObject(i).getInt("IDORGANISATION")) ;
						              siteoper.setTypesiteoper(jsonArray.getJSONObject(i).getString("TYPESITEOPER")) ;
						              siteoper.setTypeparctupture(jsonArray.getJSONObject(i).optString("TYPEPARCTUPTURE")) ;
						              siteoper.setIntitule(jsonArray.getJSONObject(i).getString("INTITULE")) ;
						              siteoper.setIdarrondissement(jsonArray.getJSONObject(i).getInt("IDARRONDISSEMENT")) ;
						              siteoper.setUtmzone(jsonArray.getJSONObject(i).getString("UTMZONE")) ;
						              siteoper.setUtmx(jsonArray.getJSONObject(i).getInt("UTMX")) ;
						              siteoper.setUtmy(jsonArray.getJSONObject(i).getInt("UTMY")) ;
						              siteoper.setIdsociete(jsonArray.getJSONObject(i).getInt("IDSOCIETE")) ;
						              siteoper.setIudautorisation(jsonArray.getJSONObject(i).getInt("IUDAUTORISATION")) ;
						              siteoper.setUtilisation(jsonArray.getJSONObject(i).optString("UTILISATION")) ;
						          //  siteoper.setDatecrea(jsonArray.getJSONObject(i).optString("DATECREA","0000/00/00"));
						         //	  siteoper.setDateupda(jsonArray.getJSONObject(i).optString("DATEUPDA","0000/00/00"));
						              siteoper.setUsercrea(jsonArray.getJSONObject(i).optString("USERCREA"));
						              siteoper.setUserupda(jsonArray.getJSONObject(i).optString("USERUPDA"));
						              siteoper.setInvalide(jsonArray.getJSONObject(i).optString("INVALIDE"));
						              siteoper.setStatut(jsonArray.getJSONObject(i).optString("STATUT"));
						              siteoper.setIudcertifenreg(jsonArray.getJSONObject(i).optString("IUDCERTIFENREG"));
						              siteoper.setStatutcertifenreg(jsonArray.getJSONObject(i).optString("STATUTCERTIFENREG"));
						              siteoper.setNumcertifenreg(jsonArray.getJSONObject(i).optString("NUMCERTIFENREG"));
						              siteoper.setDebvalcertifenreg(jsonArray.getJSONObject(i).optString("DEBVALCERTIFENREG","0000/00/00"));
						              siteoper.setFinalcertifenreg(jsonArray.getJSONObject(i).optString("FINVALCERTIFENREG","0000/00/00"));
						              siteoper.setIudactesuspension(jsonArray.getJSONObject(i).optInt("IUDACTESUSPENSION"));
						              siteoper.setIudactecreation(jsonArray.getJSONObject(i).optInt("IUDACTECREATION"));
						              siteoper.setCodepays(jsonArray.getJSONObject(i).optString("CODEPAYS"));
						              siteoper.setIdsitepere(jsonArray.getJSONObject(i).optInt("IDSITEPERE"));
						              siteoper.setPostfron(jsonArray.getJSONObject(i).optString("POSTFRON"));
						              siteoper.setIdaac(jsonArray.getJSONObject(i).optInt("IDAAC"));
						              siteoper.setTypeparcfor(jsonArray.getJSONObject(i).optString("TYPEPARCFOR"));
						              siteoper.setTypeautr(jsonArray.getJSONObject(i).optString("TYPEAUTR"));
						              siteoper.setExercice(jsonArray.getJSONObject(i).optString("EXERCICE"));
						              siteoper.setVillage(jsonArray.getJSONObject(i).optString("VILLAGE").replace("'", "''"));
						              siteoper.setIdpays(jsonArray.getJSONObject(i).optInt("IDPAYS"));
						              siteoper.setTypesiteminfof(jsonArray.getJSONObject(i).optString("TYPESITEMINFOF"));
						              siteoper.setIdsitepuutb(jsonArray.getJSONObject(i).optInt("IDSITEPUUTB"));
						              siteoper.setIdorgasitepuutb(jsonArray.getJSONObject(i).optInt("IDORGASITEPUUTB"));
						              
					              String sql ="INSERT INTO siteoper (IDSITEOPER, TYPEORGANISATION, IDORGANISATION, TYPESITEOPER, TYPEPARCTUPTURE, INTITULE, IDARRONDISSEMENT, UTMZONE, UTMX, UTMY, IDSOCIETE, IUDAUTORISATION, UTILISATION, USERCREA, USERUPDA, INVALIDE, STATUT, IUDCERTIFENREG, STATUTCERTIFENREG, NUMCERTIFENREG, DEBVALCERTIFENREG, FINVALCERTIFENREG, IUDACTESUSPENSION, IUDACTECREATION, CODEPAYS, IDSITEPERE, POSTFRON, IDAAC, TYPEPARCFOR, TYPEAUTR, EXERCICE, VILLAGE, IDPAYS, TYPESITEMINFOF, IDSITEPUUTB, IDORGASITEPUUTB) "
						                		+ "VALUES  ( "+siteoper.getIdsiteoper()+","+"'"+siteoper.getTypeorganisation() +"'"+","+"'"+siteoper.getIdorganisation()+"'"+","+"'"+siteoper.getTypesiteoper()+"'" +","+"'"+siteoper.getTypeparctupture()+"'"+","+"'"+siteoper.getIntitule()+"'"+","+"'"+siteoper.getIdarrondissement()+"'"+","+"'"+siteoper.getUtmzone()+"'"+","+"'"+siteoper.getUtmx()+"'"+","+"'"+siteoper.getUtmy()+"'"+","+"'"+siteoper.getIdsociete()+"'"+","+"'"+siteoper.getIudautorisation()+"'"+","+"'"+siteoper.getUtilisation()+"'"+","+"'"+siteoper.getUsercrea()+"'"+","+"'"+siteoper.getUserupda()+"'"+","+"'"+siteoper.getInvalide()+"'"+","+"'"+siteoper.getStatut()+"'"+","+"'"+siteoper.getIudcertifenreg()+"'"+","+"'"+siteoper.getStatutcertifenreg()+"'"+","+"'"+siteoper.getNumcertifenreg()+"'"+","+"'"+siteoper.getDebvalcertifenreg()+"'"+","+"'"+siteoper.getFinalcertifenreg()+"'"+","+"'"+siteoper.getIudactesuspension()+"'"+","+"'"+siteoper.getIudactecreation()+"'"+","+"'"+siteoper.getCodepays()+"'"+","+"'"+siteoper.getIdsitepere()+"'"+","+"'"+siteoper.getPostfron()+"'"+","+"'"+siteoper.getIdaac()+"'"+","+"'"+siteoper.getTypeparcfor()+"'"+","+"'"+siteoper.getTypeautr()+"'"+","+"'"+siteoper.getExercice()+"'"+","+"'"+siteoper.getVillage()+"'"+","+"'"+siteoper.getIdpays()+"'"+","+"'"+siteoper.getTypesiteminfof()+"'"+","+"'"+siteoper.getIdsitepuutb()+"'"+","+"'"+siteoper.getIdorgasitepuutb()+"'"+")";
						           
					              //String sql = "INSERT INTO siteoper(IDSITEOPER, TYPEORGANISATION) VALUES ("+siteoper.getIdsiteoper()+",'ON')";
						                
						              
						            //Elle prepare la requete
						              PreparedStatement st=cnx.prepareStatement(sql);
						              //Elle execute la requete
						              int result = st.executeUpdate();
						              //System.out.println("result "+ result);
						              System.out.println("ligne  "+ ligne);
						             
						          }
					          
						        }
						        catch (Exception e) {
						            System.err.println("Error retrieving data: " + e.getMessage());
						        }
						    	
						    }else {
						  	  System.out.println("status  " + httpURLConnection.getResponseCode());
						        	//Alert alert = new Alert(AlertType.ERROR,"mot de passe ou login incorrect",ButtonType.OK);
						  		  	//alert.showAndWait();
						    }
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					 
			}
	

				@Override
				public void initialize(URL arg0, ResourceBundle arg1) {
					
				}
	
}