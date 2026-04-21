package demos1;

import java.util.Scanner;

public class Exceptions {
		  public static int quotient(int number1, int number2) {
			  
			  if (number2 == 0) {
		      System.out.println("Divisor cannot be zero");
		      System.exit(1);
		    }

		    return number1 / number2;
		  }
		  
		  public static void main(String[] args) {
			Scanner inputs = new Scanner(System.in);
			try {
		    
				// Prompt the user to enter two integers
				System.out.print("Enter two integers: ");
				int number1 = inputs.nextInt();
				int number2 = inputs.nextInt();
				
				int result = quotient(number1, number2);
				System.out.println(number1 + " / " + number2 + " is " + result);
				
				inputs.close();
				
				}catch(java.util.InputMismatchException e) {
				System.out.println("Enter integer not double or other things...");
				}catch(Exception e2) {
				System.out.println("Somethings went wrong");
				}
				finally {
					inputs.close(); 
					System.out.println("The program ended successfully");
				}
		  }
}