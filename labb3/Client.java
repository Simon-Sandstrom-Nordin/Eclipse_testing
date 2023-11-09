package Eclipse_testing.labb3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Client {

	Client() {
		
	   try {
	       try (Socket socket = new Socket("localhost", 4713)) {
	    	   BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			   PrintWriter ut = new PrintWriter(socket.getOutputStream());
			   ut.println("Simon");
			   ut.flush();
			   System.out.println(in.readLine());
			   
			   Scanner sc = new Scanner(System.in);
			   Boolean looping = true;
			   while(looping) {
			       String input = null;
			       try {
			           input = sc.nextLine();
			       } catch (NoSuchElementException e) {
			           break; // End of input, break out of the loop
			       }
			       if (input == null || input.equals("")) {
			    	   looping = false;
			       }
			       ut.println(input);
			       ut.flush();
			       System.out.println(in.readLine());
			   }
	       }
	   } catch(IOException e) {
		   System.err.println(e);
	   }
	   
	}
	
}
