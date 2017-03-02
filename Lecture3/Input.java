package Lecture3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		File f = new File("\\Users\\andre\\workspace\\TheProgrammingProject\\Lecture3\\myfile.txt");
		try {

			FileReader a = new FileReader(f);
			 
			int x = a.read();
			System.out.println((char)x);
		}
		
		catch (FileNotFoundException e) {
			
			System.out.println("No file");
		}
		
		catch (IOException e) {

			System.out.println("Input problem");
		}

	}
}
