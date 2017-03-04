package acm634;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PrinterWriter {

	public static void main(String[] args) throws IOException {
		
		File a = new File("\\Users\\andre\\Desktop\\TheProgrammingProject\\Lecture4\\Homework\\src\\acm634\\file3.txt");
		
		FileWriter w = new FileWriter(a);
		
		try {
			
			while (true) {
			
				Scanner s = new Scanner(System.in);
			
				String f = s.nextLine();
				
				w.write(f);
				
				if (f.equals("out")) {
					s.close();
					w.close();
				}
			}		
		}
		
		catch (NoSuchElementException e) {}
	}
}
