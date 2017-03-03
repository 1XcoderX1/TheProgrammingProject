package acm634;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Printer {

	public static void main(String[] args) {
		
		 BufferedReader reader = null;
		
		try {
			
			reader = new BufferedReader(new FileReader("/Users/merlin11/Desktop/TheProgrammingProject/Lecture3/Homework/acm634/file.txt"));
			
			String line = reader.readLine();

            while (line != null) {
           
                System.out.println(line);
                line = reader.readLine();
            }			
		}
		
		catch (FileNotFoundException e) {
			
			System.out.println("No file has been found");
		}
		
		catch (IOException e) {
			
			System.out.println("There is some input problem");
		}
		
		try { 
			
			if (reader != null){ 
				
				reader.close(); 
			}
		
		}
		
		catch (Exception e) {
			
		}

	}

}
