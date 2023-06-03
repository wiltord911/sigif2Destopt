package controllers;

import java.awt.MenuBar;
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

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modeles.Organisation;
import services.Interface_principale_service;
import services.Synchronisationdonneref;
import utiles.Connexion;
import utiles.RequetesHttp;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderPane;
public class Interface_principaleController implements Initializable {
	
	@FXML
	private MenuBar menubar;
	@FXML
	private Menu menu;
	@FXML
	private Menu menudonneReference;
	@FXML
	private Menu menutitreforestier;
	@FXML
    private Menu menucodebarre;
	@FXML
	private Menu menuInventaire;
	@FXML
	private Menu menuAbattage;
	@FXML
	private Menu menuOperationParc;
	@FXML
	private Menu menuTransformation;
	@FXML
	private Menu menuBoisCemac;
	@FXML
	private Menu menuControle;
	@FXML
	private AnchorPane root;
	@FXML
	private Parent fxml ;
	
	Connection cnx;
	
	private static  String API_URL = "http://192.168.10.109:8080/donneeReference/mobile-societes?size=30&page=0";
	//API_URL = "http://192.168.10.109:8080/donneeReference/entites";
	
	// wiltord API_URL = "http://192.168.10.109:8080/donneeReference/mobile-societes";
	
	// patson API_URL = "http://192.168.0.116:8184/mobile-organisations?size=20&page=0";
	
	
	//API_URL = "http://192.168.0.116:8184/entites";
	
	//int ligne=0;
	
	

    @FXML
    void btn_FC(ActionEvent event) {

    }

    @FXML
    void btn_OFP(ActionEvent event) {

    }

    

    @FXML
    void btn_action(ActionEvent event) {

    }

    @FXML
    void btn_arron(ActionEvent event) {

    }

    @FXML
    void btn_autre(ActionEvent event) {

    }

    @FXML
    void btn_autreEntite(ActionEvent event) {

    }

    @FXML
    void btn_classeqlte(ActionEvent event) {

    }

    @FXML
    void btn_conti(ActionEvent event) {

    }

    @FXML
    void btn_departement(ActionEvent event) {

    }

    @FXML
    void btn_entiteFores(ActionEvent event) {

    }

    @FXML
    void btn_essence(ActionEvent event) {

    }

    @FXML
    void btn_foretC(ActionEvent event) {

    }

    @FXML
    void btn_minfof(ActionEvent event) {

    }

    @FXML
    void btn_miseajour(ActionEvent event) {
    	
    	 new Synchronisationdonneref().methodeSite(cnx);
    	
		/*
		 * Synchronisationdonneref synchronisationdonneref = new
		 * Synchronisationdonneref(); synchronisationdonneref.methodeSite(cnx);
		 */
    }

    @FXML
    void btn_pays(ActionEvent event) {

    }

    @FXML
    void btn_site(ActionEvent event) {

    }

    @FXML
    void btn_telechargement(ActionEvent event) {

    }

    @FXML
    void btn_traitesyvi(ActionEvent event) {

    }

    @FXML
    void btn_typeProduit(ActionEvent event) {

    }

    @FXML
    void btn_typeinfra(ActionEvent event) {

    }

    @FXML
    void btn_valeurFOB(ActionEvent event) {

    }

    @FXML
    void btn_zoneexploi(ActionEvent event) {

    }

   


    @FXML
    void iven(MouseEvent event) {

    }

   

    @FXML
    void miseajour(ActionEvent event) {

    }

   

    

   

    

	
	
	 @FXML
	 void btn_OPF(ActionEvent event) throws IOException {
		 try {
			 fxml= FXMLLoader.load(getClass().getResource("/vues/Liste_entite_forestiere.fxml"));
			 
		  	 root.getChildren().removeAll();
		  	 root.getChildren().setAll(fxml);
		  	 new Liste_entite_forestiereController();
		 } catch(IOException e) {
			 e.printStackTrace();
	 }	
		 
		 
		 
		 	//JSONObject jsonObject = new JSONObject();
			String accesToken="eyJhbGciOiJIUzM4NCJ9.eyJsb2dpbiI6Ik5ET05HTyIsInR5cGUiOiJhY2Nlc3MiLCJpYXQiOjE2ODQ0ODcwODYsImlzcyI6InNpZ2lmIiwiZXhwIjoxNjg1MzUxMDg2LCJvcmdhbmlzYXRpb24iOjAsInR5cGVvcmdhbmlzYXRpb24iOiJNRiJ9.QF0W5E8UWi7gT1u0P4HvyUOu18nt-chxFNoGn-2Vn4nFxyy8Icfi0gYO-ceYysS0";
			URL obj=new URL(API_URL);
			HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();
			httpURLConnection.setUseCaches(false);
			httpURLConnection.setDoInput(true);
	        httpURLConnection.setRequestProperty("Content-Type","application/json");
	        httpURLConnection.setRequestProperty("Accept","*/*");
	        httpURLConnection.setRequestProperty("Authorization", "Bearer " + accesToken);	       
	        httpURLConnection.setDoOutput(true);
	        httpURLConnection.setRequestMethod("GET");
		 
	        
	        //StringBuffer response = new StringBuffer();
	      /*  
	        if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
	         	//System.out.println("status " + httpURLConnection.getResponseCode());
	            Societe societe = new Societe();
	         	
	         	try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()))) {
	             	//String inputLine;
	             	
	              // while ((inputLine = bufferedReader.readLine()) != null) {
	             	//  response.append(inputLine);
	               //}
	               JSONObject jsonResponse= new JSONObject(bufferedReader.readLine());
	               //System.out.println("json "+jsonResponse);
	               //System.out.println("index " + response);
	               JSONObject jsonRespons= jsonResponse.getJSONObject("result");
	               int currentPage=jsonRespons.getInt("currentPage");
	               int totalPages=jsonRespons.getInt("totalPages");
	               JSONArray jsonArray = jsonRespons.getJSONArray("items");
	               
	               
	               
	               
	               for(int i=0; i < jsonArray.length(); i++)   
	               {  
	             	  //ligne+=1;
	            	   
	            	   String accessigif,socexploitation,socsylviculture,invalide,soctransformateur;
	            	   
	            	   
	            	   societe.setIdsociete(jsonArray.getJSONObject(i).getInt("idsociete"));
	            	   societe.setOrganisationtype(jsonArray.getJSONObject(i).getString("organisationType"));
	            	   
	            	   accessigif =jsonArray.getJSONObject(i).optString("accessigif","");	            	   
	            	   if (accessigif == "false") {	societe.setAccessigif(jsonArray.getJSONObject(i).optString("0","")); }
	            	   else { societe.setAccessigif(jsonArray.getJSONObject(i).optString("1","")); }
	            	   
	            	   societe.setNumregcommerce(jsonArray.getJSONObject(i).optString("numregcommerce","null"));
	            	   societe.setNumcontribuable(jsonArray.getJSONObject(i).optString("numcontribuable","null"));
	            	   societe.setEmail(jsonArray.getJSONObject(i).optString("email","null"));
	            	   societe.setTelephone(jsonArray.getJSONObject(i).getString("telephone"));
	            	   societe.setAdresse(jsonArray.getJSONObject(i).getString("adresse").replace("'", "''"));
	            	   societe.setCommentaire(jsonArray.getJSONObject(i).optString("commentaire","null").replace("'", "''"));
	            	   
	            	   socexploitation=jsonArray.getJSONObject(i).optString("socexploitation","");
	            	   if(socexploitation=="false") {  societe.setSocexploitation(jsonArray.getJSONObject(i).optString("0","")); }
	            	   else {societe.setSocexploitation(jsonArray.getJSONObject(i).optString("1",""));}
	            	   
	            	   societe.setNumagrexploit(jsonArray.getJSONObject(i).optString("numagrexploit",""));
	            	   societe.setDateagrexploit(jsonArray.getJSONObject(i).optString("dateagrexploit","0000/00/00"));
	            	   societe.setIudagrexploit(jsonArray.getJSONObject(i).optInt("iudagrexploit"));
	            	   societe.setSocinventaire(jsonArray.getJSONObject(i).optString("socinventaire",""));
	            	   societe.setNumagrinvent(jsonArray.getJSONObject(i).optString("numagrinvent","null"));
	            	   societe.setDateagrinvent(jsonArray.getJSONObject(i).optString("dateagrinvent","0000/00/00"));
	            	   societe.setIudagrinvent(jsonArray.getJSONObject(i).optInt("iudagrinvent"));
	            	   
	            	   socsylviculture=jsonArray.getJSONObject(i).optString("socsylviculture","");
	            	   if(socsylviculture=="false") {  societe.setSocsylviculture(jsonArray.getJSONObject(i).optString("0",""));		}
	            	   else{societe.setSocsylviculture(jsonArray.getJSONObject(i).optString("1",""));}
	            	   
	            	   	        
	            	   societe.setNumagrsylvic(jsonArray.getJSONObject(i).optString("numagrsylvic","null"));
	            	   societe.setDateagrsylvic(jsonArray.getJSONObject(i).optString("dateagrsylvic","0000/00/00"));
	            	   societe.setIudagrsylvic(jsonArray.getJSONObject(i).optInt("iudagrsylvic"));
	            	   societe.setIudempmarteau(jsonArray.getJSONObject(i).optInt("iudempmarteau"));
	            	   societe.setIudrecommand(jsonArray.getJSONObject(i).optInt("iudrecommand"));
	            	   societe.setDatecrea(jsonArray.getJSONObject(i).getString("datecrea"));
	            	   societe.setDateupda(jsonArray.getJSONObject(i).optString("dateupda","000/00/00"));
	            	   societe.setUserupda(jsonArray.getJSONObject(i).getString("usercrea"));
	            	   societe.setUserupda(jsonArray.getJSONObject(i).optString("userupda","0000/00/00"));
	            	   societe.setRaisonsociale(jsonArray.getJSONObject(i).getString("raisonsociale").replace("'", "''"));
	            	   
	            	   invalide=jsonArray.getJSONObject(i).optString("invalide","");
	            	   if(invalide=="false") {	societe.setInvalide(jsonArray.getJSONObject(i).optString("0",""));					}
	            	   else {	societe.setInvalide(jsonArray.getJSONObject(i).optString("1",""));}	   
	            		   
	            	   
	            	   societe.setStatut(jsonArray.getJSONObject(i).getString("statut"));
	            	   societe.setArrondissement(jsonArray.getJSONObject(i).optInt("arrondissement"));
	            	   
	            	   soctransformateur=jsonArray.getJSONObject(i).optString("soctransformateur","");
	            	   if(soctransformateur=="false") {	societe.setSoctransformateur(jsonArray.getJSONObject(i).optString("0",""));	}
	            	   else {societe.setSoctransformateur(jsonArray.getJSONObject(i).optString("1",""));}
	            	   
	            	   societe.setIdorganisation(jsonArray.getJSONObject(i).optInt("idorganisation"));
	            	   societe.setDatecertiftransf(jsonArray.getJSONObject(i).optString("datecertiftransf","0000/00/00"));
	            	   societe.setNumcertiftransf(jsonArray.getJSONObject(i).optString("numcertiftransf","null"));
	            	   societe.setSigle(jsonArray.getJSONObject(i).optString("sigle","null").replace("'", "''"));
	            	   societe.setIdpays(jsonArray.getJSONObject(i).optInt("idpays"));
	            	   societe.setCodeenreg(jsonArray.getJSONObject(i).getString("codeenreg"));
	            	   societe.setNomresponsable(jsonArray.getJSONObject(i).optString("nomresponsable").replace("'", "''"));
	            	   societe.setTelresponsable(jsonArray.getJSONObject(i).optString("telresponsable"));
	            	   societe.setIudregcommerce(jsonArray.getJSONObject(i).optInt("iudregcommerce"));
	            	   societe.setDateregcommerce(jsonArray.getJSONObject(i).optString("dateregcommerce","0000/00/00"));
	            	   societe.setIudcontribuable(jsonArray.getJSONObject(i).optInt("iudcontribuable"));
	            	   societe.setDatecontribuable(jsonArray.getJSONObject(i).optString("datecontribuable","0000/00/00"));
	            	   societe.setIuddocentjur(jsonArray.getJSONObject(i).optInt("iuddocentjur"));
	            	   societe.setNumdocentjur(jsonArray.getJSONObject(i).optString("numdocentjur","null"));
	            	   societe.setDatedocentjur(jsonArray.getJSONObject(i).optString("datedocentjur","0000/00/00"));
	            	   societe.setIudcertiftransf(jsonArray.getJSONObject(i).optInt("iudcertiftransf"));
	            	   societe.setTypeentjur(jsonArray.getJSONObject(i).optString("organisationTypecommunaute"));
	            	   societe.setNumcni(jsonArray.getJSONObject(i).optInt("numcni"));
	            	   societe.setDatecni(jsonArray.getJSONObject(i).optString("datecni","0000/00/00"));
	            	   societe.setStatutoperateur(jsonArray.getJSONObject(i).getString("statutoperateur"));
	            	   societe.setNumcertifdomicile(jsonArray.getJSONObject(i).optString("numcertifdomicile","null"));
	            	   societe.setDatecertifdomicile(jsonArray.getJSONObject(i).optString("datecertifdomicile","0000/00/00"));
	            	   societe.setIudcertifdomicile(jsonArray.getJSONObject(i).optInt("iudcertifdomicile"));
	            	   societe.setEmailresponsable(jsonArray.getJSONObject(i).optString("emailresponsable","null"));
	            	   societe.setTypeentiteminfof(jsonArray.getJSONObject(i).optString("typeentiteminfof","null"));
	            	   societe.setDepartement(jsonArray.getJSONObject(i).optString("departement","null"));
	            	   societe.setRegion(jsonArray.getJSONObject(i).optString("region","null"));
	            	   societe.setCivilte_responsable(jsonArray.getJSONObject(i).optString("civilte_responsable",""));
	            	   societe.setNumacteminfof(jsonArray.getJSONObject(i).optString("numacteminfof","null"));
	            	   societe.setDateacteminfof(jsonArray.getJSONObject(i).optString("dateacteminfof","0000/00/00"));
	            	   societe.setIudacteminfof(jsonArray.getJSONObject(i).optInt("iudacteminfof"));
	            	   societe.setNumrecepissedecla(jsonArray.getJSONObject(i).optString("numrecepissedecla","null"));
	            	   societe.setDaterecepissedecla(jsonArray.getJSONObject(i).optString("daterecepissedecla","0000/00/00"));
	            	   societe.setIudrecepissedecla(jsonArray.getJSONObject(i).optInt("iudrecepissedecla"));
	            	   
	            	   
	            	 
	            	   
	            	   System.out.println("idsocite    --------------------------"+societe.getIdsociete());
	            	   String sql ="INSERT INTO societe(IDSOCIETE, TYPEORGANISATION, ACCESSIGIF, NUMREGCOMMERCE, NUMCONTRIBUABLE, EMAIL, TELEPHONE, ADRESSE, COMMENTAIRE, SOCEXPLOITATION, NUMAGREXPLOIT, DATEAGREXPLOIT, IUDAGREXPLOIT, SOCINVENTAIRE, NUMAGRINVENT, DATEAGRINVENT, IUDAGRINVENT, SOCSYLVICULTURE, NUMAGRSYLVIC, DATEAGRSYLVIC, IUDAGRSYLVIC, IUDEMPMARTEAU, IUDRECOMMAND, DATECREA, DATEUPDA, USERCREA, USERUPDA, RAISONSOCIALE, INVALIDE, STATUT, ARRONDISSEMENT, SOCTRANSFORMATEUR, IDORGANISATION, DATECERTIFTRANSF, NUMCERTIFTRANSF, SIGLE, IDPAYS, CODEENREG, NOMRESPONSABLE, TELRESPONSABLE, IUDREGCOMMERCE, DATEREGCOMMERCE, IUDCONTRIBUABLE, DATECONTRIBUABLE, IUDDOCENTJUR, NUMDOCENTJUR, DATEDOCENTJUR, IUDCERTIFTRANSF, TYPEENTJUR, NUMCNI, DATECNI, STATUTOPERATEUR, NUMCERTIFDOMICILE, DATECERTIFDOMICILE, IUDCERTIFDOMICILE, EMAILRESPONSABLE, TYPEENTITEMINFOF, DEPARTEMENT, REGION, CIVILITE_RESPONSABLE, NUMACTEMINFOF, DATEACTEMINFOF, IUDACTEMINFOF, NUMRECEPISSEDECLA, DATERECEPISSEDECLA, IUDRECEPISSEDECLA)  "
	                     		+ "VALUES  ( "+societe.getIdsociete()+","+"'"+societe.getOrganisationtype() +"'"+","+"'"+societe.getAccessigif()+"'"+","+"'"+societe.getNumregcommerce()+"'" +","+"'"+societe.getNumcontribuable()+"'"+","+"'"+societe.getEmail()+"'"+","+"'"+societe.getTelephone()+"'"+","+"'"+societe.getAdresse()+"'"+","+"'"+societe.getCommentaire()+"'"+","+"'"+societe.getSocexploitation()+"'"+","+"'"+societe.getNumagrexploit()+"'"+","+"'"+societe.getDateagrexploit()+"'"+","+"'"+societe.getIudagrexploit()+"'"+","+societe.getSocinventaire()+","+"'"+societe.getNumagrinvent()+"'"+","+"'"+societe.getDateagrexploit()+"'"+","+"'"+societe.getIudagrexploit()+"'"+","+"'"+societe.getSocsylviculture()+"'"+","+"'"+societe.getNumagrsylvic()+"'"+","+"'"+societe.getDateagrsylvic()+"'"+","+"'"+societe.getIudagrsylvic()+"'"+","+"'"+societe.getIudempmarteau()+"'"+","+"'"+societe.getIudrecommand()+"'"+","+"'"+societe.getDatecrea()+"'"+","+"'"+societe.getDateupda()+"'"+","+"'"+societe.getUsercrea()+"'"+","+"'"+societe.getUserupda()+"'"+","+"'"+societe.getRaisonsociale()+"'"+","+"'"+societe.getInvalide()+"'"+","+"'"+societe.getStatut()+"'"+","+"'"+societe.getArrondissement()+"'"+","+"'"+societe.getSoctransformateur()+"'"+","+"'"+societe.getIdorganisation()+"'"+","+"'"+societe.getDatecertiftransf()+"'"+","+"'"+societe.getNumcertiftransf()+"'"+","+"'"+societe.getSigle()+"'"+","+"'"+societe.getIdpays()+"'"+","+"'"+societe.getCodeenreg()+"'"+","+"'"+societe.getNomresponsable()+"'"+","+"'"+societe.getTelresponsable()+"'"+","+"'"+societe.getIudregcommerce()+"'"+","+"'"+societe.getDateregcommerce()+"'"+","+"'"+societe.getIudcontribuable()+"'"+","+"'"+societe.getDatecontribuable()+"'"+","+"'"+societe.getIuddocentjur()+"'"+","+"'"+societe.getNumdocentjur()+"'"+","+"'"+societe.getDatedocentjur()+"'"+","+"'"+societe.getIudcertiftransf()+"'"+","+"'"+societe.getTypeentjur()+"'"+","+"'"+societe.getNumcni()+"'"+","+"'"+societe.getDatecni()+"'"+","+"'"+societe.getStatutoperateur()+"'"+","+"'"+societe.getNumcertifdomicile()+"'"+","+"'"+societe.getDatecertifdomicile()+"'"+","+"'"+societe.getIudcertifdomicile()+"'"+","+"'"+societe.getEmailresponsable()+"'"+","+"'"+societe.getTypeentiteminfof()+"'"+","+"'"+societe.getDepartement()+"'"+","+"'"+societe.getRegion()+"'"+","+"'"+societe.getCivilte_responsable()+"'"+","+"'"+societe.getNumacteminfof()+"'"+","+"'"+societe.getDateacteminfof()+"'"+","+"'"+societe.getIudacteminfof()+"'"+","+"'"+societe.getNumrecepissedecla()+"'"+","+"'"+societe.getDaterecepissedecla()+"'"+","+"'"+societe.getIudrecepissedecla()+"'"+")";
	                   
	            	   
	            	   
	            	   
	                     
	                   
	                 //Elle prepare la requete
	                   PreparedStatement st=cnx.prepareStatement(sql);
	                   //Elle execute la requete
	                   int result = st.executeUpdate();
	                   //System.out.println("result"+ result);
	                   
	                  
	               }
	               
	               if (currentPage<totalPages-1) {
	             	  currentPage+=1;
	             	  System.err.println("currentPage: " +currentPage);
	             	  API_URL = "http://192.168.10.109:8080/donneeReference/mobile-societes?page="+currentPage+"&size=30";
	             	  iven(event);
	               }
	               //else System.out.println("ligne total "+ ligne);
	               
	               
	             }
	             catch (Exception e) {
	                 System.err.println("Error retrieving data: " + e.getMessage());
	             }
	         	
	         }else {
	       	  System.out.println("status  " + httpURLConnection.getResponseCode());
	 	        	//Alert alert = new Alert(AlertType.ERROR,"mot de passe ou login incorrect",ButtonType.OK);
	 	  		  	//alert.showAndWait();
	         }
		 */

     }
	 
	 
	 
	
	
		@FXML
		void inventaire(MouseEvent event) throws IOException  {
			
			
		//JSONObject jsonObject = new JSONObject();
		
		HttpURLConnection httpURLConnection= RequetesHttp.httpGet("GET");
        	
        if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
           Organisation organisation = new Organisation();
        	
        	try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()))) {
            	//String inputLine;
            	
             // while ((inputLine = bufferedReader.readLine()) != null) {
            	//  response.append(inputLine);
              //}
              JSONObject jsonResponse= new JSONObject(bufferedReader.readLine());
              //System.out.println("json "+jsonResponse);
              //System.out.println("index " + response);
              JSONObject jsonRespons= jsonResponse.getJSONObject("result");
              int currentPage=jsonRespons.getInt("currentPage");
              int totalPages=jsonRespons.getInt("totalPages");
              JSONArray jsonArray = jsonRespons.getJSONArray("items");
              
              
              
              
              for(int i=0; i < jsonArray.length(); i++)   
              {  
            	  //ligne+=1;
                  organisation.setIdorganisation(jsonArray.getJSONObject(i).getLong("idorganisation")) ;
                  organisation.setTypeorganisation(jsonArray.getJSONObject(i).getString("organisationtype"));
                  organisation.setTypecommunaute(jsonArray.getJSONObject(i).optString("typecommunaute",""));
                  organisation.setTelephone(jsonArray.getJSONObject(i).getString("telephone"));
                  organisation.setEmail(jsonArray.getJSONObject(i).getString("email"));
                  organisation.setPresident(jsonArray.getJSONObject(i).optString("president","50"));
                  organisation.setResponsable(jsonArray.getJSONObject(i).optString("responsable","50"));
                  organisation.setIuddeclaration(jsonArray.getJSONObject(i).optString("iuddeclaration","50"));
                  organisation.setDatecrea(jsonArray.getJSONObject(i).getString("datecrea"));
                  organisation.setDateupda(jsonArray.getJSONObject(i).optString("dateupda","0000/00/00"));
                  organisation.setUsercrea(jsonArray.getJSONObject(i).getString("usercrea"));
                  organisation.setUserupda(jsonArray.getJSONObject(i).optString("userupda","null"));
                  organisation.setStatut(jsonArray.getJSONObject(i).getString("statut"));
                  organisation.setInvalide(jsonArray.getJSONObject(i).getBoolean("invalide"));
                  organisation.setAdresse(jsonArray.getJSONObject(i).optString("adresse","null").replace("'", "''"));  
                  organisation.setIntitule(jsonArray.getJSONObject(i).optString("intitule","null").replace("'", "''"));
                  organisation.setEst_societe(jsonArray.getJSONObject(i).getString("estSociete"));
                  
                  String sql ="INSERT INTO organisation(IDORGANISATION, TYPEORGANISATION, TYPECOMMUNAUTE, TELEPHONE, EMAIL, PRESIDENT, RESPONSABLE, IUDDECLARATION, DATECREA, DATEUPDA, USERCREA, USERUPDA, STATUT, INVALIDE, ADRESSE, INTITULE, EST_SOCIETE)  "
                    		+ "VALUES  ( "+organisation.getIdorganisation()+","+"'"+organisation.getTypeorganisation() +"'"+","+"'"+organisation.getTypecommunaute()+"'"+","+"'"+organisation.getTelephone()+"'" +","+"'"+organisation.getEmail()+"'"+","+"'"+organisation.getPresident()+"'"+","+"'"+organisation.getResponsable()+"'"+","+"'"+organisation.getIuddeclaration()+"'"+","+"'"+organisation.getDatecrea()+"'"+","+"'"+organisation.getDateupda()+"'"+","+"'"+organisation.getUsercrea()+"'"+","+"'"+organisation.getUserupda()+"'"+","+"'"+organisation.getStatut()+"'"+","+organisation.getInvalide()+","+"'"+organisation.getAdresse()+"'"+","+"'"+organisation.getIntitule()+"'"+","+"'"+organisation.getEst_societe()+"'"+")";
                  
                    
                  
                //Elle prepare la requete
                  PreparedStatement st=cnx.prepareStatement(sql);
                  //Elle execute la requete
                  int result = st.executeUpdate();
                  System.out.println("result"+ result);
                  
                 
              }
              
              if (currentPage<totalPages-1) {
            	  currentPage+=1;
            	  System.err.println("currentPage: " +currentPage);
            	  API_URL = "http://192.168.0.116:8184/mobile-organisations?page="+currentPage+"&size=20";
            	  inventaire(event);
              }
              //else System.out.println("ligne total "+ ligne);
              
              
            }
            catch (Exception e) {
                System.err.println("Error retrieving data: " + e.getMessage());
            }
        	
        }else {
      	  System.out.println("status  " + httpURLConnection.getResponseCode());
	        	//Alert alert = new Alert(AlertType.ERROR,"mot de passe ou login incorrect",ButtonType.OK);
	  		  	//alert.showAndWait();
        }
        
        
       
        
        
        
       
	} 
	
	public static Menu donneReferencemenu;
	public static Menu titreforestiermenu;
	public static Menu barremenu;
	public static Menu Inventairemenu;
	public static Menu Abattagemenu;
	public static Menu OperationParcmenu;
	public static Menu Transformationmenu;
	public static Menu BoisCemacmenu;
	public static Menu Controlemenu;
	
	// Event Listener on MenuItem.onAction
	@FXML
	public void login(ActionEvent event) {
		Interface_principale_service.login(getClass());
	}
	
	
	// Event Listener on MenuItem.onAction
	@FXML
	public void account(ActionEvent event) {
		// TODO Autogenerated
		try {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/vues/My_account.fxml"));
	    	Parent root=(Parent)loader.load();
	    	Scene scene = new Scene(root,550,600);
	    	Stage stage = new Stage();
	    	stage.setMinWidth(600);   
			stage.setMinHeight(550);
	    	stage.setTitle("DETAIL POUR PROFIL UTILISATEUR");
	    	stage.setScene(scene);
	    	stage.initModality(Modality.APPLICATION_MODAL);
	    	stage.show();
	    }
		catch(Exception e) {
		    e.printStackTrace();}
		
	}
	
		// Event Listener on MenuItem.onAction
		@FXML
		public void offmode(ActionEvent event) {
			// TODO Autogenerated
		}
		// Event Listener on MenuItem.onAction
		@FXML
		public void setting(ActionEvent event) {
			// TODO Autogenerated
		}
		
		// Event Listener on MenuItem.onAction
		@FXML
		public void signO(ActionEvent event) {
			// TODO Autogenerated
		}
		// Event Listener on MenuItem.onAction
		@FXML
		public void signO_E(ActionEvent event) {
			// TODO Autogenerated
		}
		// Event Listener on MenuItem.onAction
		@FXML
		public void cleanDB(ActionEvent event) {
			// TODO Autogenerated
		}
		


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		cnx = Connexion.connexionDB();
		/*try {
			 fxml= FXMLLoader.load(getClass().getResource("/vues/My_account.fxml"));
		  	 root.getChildren().removeAll();
		  	 root.getChildren().setAll(fxml);
			}  catch(IOException e) {
		 	 e.printStackTrace();
			}*/
		
		donneReferencemenu=this.menudonneReference;
		titreforestiermenu=this.menutitreforestier;
		barremenu=this.menuControle;
		Inventairemenu=this.menuInventaire;
		Abattagemenu=this.menuAbattage;
		OperationParcmenu=this.menuOperationParc;
		Transformationmenu=this.menuTransformation;
		BoisCemacmenu=this.menuBoisCemac;
		Controlemenu=this.menuControle;
	}
}