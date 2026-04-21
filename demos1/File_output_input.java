package demos1;

import java.util.Scanner;

public class File_output_input {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		java.io.File file2 = new java.io.File("hsyn2");
		
		try(
		
				java.io.PrintWriter output = new java.io.PrintWriter(file2);
		){
			
			output.print("ali\t");
			output.print("90\n");
			output.print("delgado \t");
			output.print("80\n");
			output.print("delgado \t");
			output.print("89\n");
			output.print("hsyn\t86");
			output.close();
			
			Scanner input = new Scanner(file2);
			
			
			
			while(input.hasNext()) {			
				System.out.print(input.next() +" ");
			}
			System.out.println();
			
			
		}catch(java.util.InputMismatchException ex) {
			System.out.println("Something went wrong OMFG :O)");
		}
		if (file2.exists()) {
			System.out.println("File can exists");
			System.exit(0);
		}else {
			System.out.println("File can't exists");
		}
		
	}

}
