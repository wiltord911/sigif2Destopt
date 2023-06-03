package api;

import java.net.InetAddress;

public class Api_Internet_connect {

	
		public static void main(String[] args) {
	        try {
	            // Vérifier si l'adresse IP de Google est accessible
	            InetAddress address = InetAddress.getByName("www.google.com");
	            boolean isReachable = address.isReachable(5000);

	            if (isReachable) {
	                System.out.println("Connected to the Internet");
	            } else {
	                System.out.println("Not connected to the Internet");
	            }
	        } catch (Exception e) {
	            System.out.println("Not connected to the Internet");
	        }

		}
	}
