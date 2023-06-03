package utiles;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.json.JSONObject;

public class RequetesHttp {
	private static final String API_SITE = "http://192.168.10.109:8080/donneeReference/sites/all";
	
	private static final String  API_URL = "http://192.168.10.109:8080/donneeReference/mobile-societes?size=30&page=0";
	private static final String API ="http://192.168.10.109:8080/auth/login";
	
	private static String accesToken = "eyJhbGciOiJIUzM4NCJ9.eyJsb2dpbiI6IkFCQSIsInR5cGUiOiJhY2Nlc3MiLCJpYXQiOjE2ODU1MzcxMzYsImlzcyI6InNpZ2lmIiwiZXhwIjoxNjg2NDAxMTM2LCJvcmdhbmlzYXRpb24iOjEwNCwidHlwZW9yZ2FuaXNhdGlvbiI6Ik9OIn0.-HZaasdP6gLJaZHVqETCErqc7v6fPjvZrR4tp8bTdgd5tCGK2jOzPDpKVpDsltmc";
	
	//private static String accesToken="eyJhbGciOiJIUzM4NCJ9.eyJsb2dpbiI6IkNFQ0lMSUEiLCJ0eXBlIjoiYWNjZXNzIiwiaWF0IjoxNjg0MjQ3Njk2LCJpc3MiOiJzaWdpZiIsImV4cCI6MTY4NTExMTY5Niwib3JnYW5pc2F0aW9uIjowLCJ0eXBlb3JnYW5pc2F0aW9uIjoiTUYifQ.YyCeGsQkMtEH4U5JLFwYu-zEFdZpP5HlgJ24-JRb5bUancA9JMfYIVLcjUCXr4PA";
	
	public static HttpURLConnection httpGet(String requestMethod) {
		
		URL obj;
		try {
			obj = new URL(API_SITE);
			HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();
			httpURLConnection.setUseCaches(false);
			httpURLConnection.setDoInput(true);
	        httpURLConnection.setRequestProperty("Content-Type","application/json");
	        httpURLConnection.setRequestProperty("Accept","*/*");
	        httpURLConnection.setRequestProperty("Authorization", "Bearer " + accesToken);
	       //httpURLConnection.setAllowUserInteraction(false);
	        httpURLConnection.setDoOutput(true);
	        httpURLConnection.setRequestMethod(requestMethod);
	        return httpURLConnection;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
        
		return null;
		
		
	}
	
	public static HttpURLConnection httpPost(JSONObject jsonObject) throws IOException{
		
		URL obj=new URL(API);
		HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();
		httpURLConnection.setUseCaches(false);
		httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("Content-Type","application/json");
        httpURLConnection.setRequestProperty("Accept","application/json");
       // httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        
        //for POST only start
        OutputStreamWriter  outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());
        outputStreamWriter.write(jsonObject.toString());
        outputStreamWriter.flush();
        outputStreamWriter.close();
		return httpURLConnection; 
		
	}

	public static String apiurl() {
		
		return API_URL;
	}
	
	public static String API() {return API;}
	
	public static String ApiSite() {return API_SITE;}
	
}
