package acm634;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Customer {

	Socket restaurant;
	DataInputStream fromRestaurant;
	DataOutputStream toRestaurant;
	String host;
	
	public Customer(String host) throws UnknownHostException, IOException {
		
		this.host = host;
		
		restaurant = new Socket(host, 4444);
		
		fromRestaurant = new DataInputStream(restaurant.getInputStream());
		
		toRestaurant = new DataOutputStream(restaurant.getOutputStream());
			
	}
	
	
	public void run() throws IOException {

		BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));
		
		
 	    
		String customerInput;
		
		while((customerInput = fromUser.readLine()) != null){
			
			if (customerInput.equals("0")) {
				
				break;
			}
			
			if (!customerInput.equals("0")) {
				
				int customerOrder;
				customerOrder = Integer.parseInt(customerInput);
				
				toRestaurant.writeInt(customerOrder);
                System.out.println("I have sent order number " + customerOrder + " to the restaurant.");
            
                int restaurantOrderConfirmation = fromRestaurant.readInt();
                System.out.println("I have got the confirmation for order number " + restaurantOrderConfirmation + " from the restaurant.");
			}					
		}
		
		toRestaurant.close();
		fromRestaurant.close();
		restaurant.close();		
	}	
}
