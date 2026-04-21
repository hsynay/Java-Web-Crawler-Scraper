package demos1;

import java.net.URL;
import java.util.Scanner;

public class WEB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter URL: ");
		String inputFromUser = new Scanner(System.in).next();
		
		try {		
			java.net.URL newUrl = new URL(inputFromUser);
			Scanner input = new Scanner(newUrl.openStream());
			int count = 0 ;
			while(input.hasNext()) {
				String line = input.nextLine();
			    count += line.length();
			    System.out.println(input.nextLine());
			}
			
		System.out.println("The file size is " + count + " characters");
		}
		
		catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		    }
		catch (java.io.IOException ex) {
			System.out.println("IO Errors");
		}

		
	}

}
