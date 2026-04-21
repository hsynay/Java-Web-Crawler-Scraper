package demos1;

import java.io.File;

public class File_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file1 = new File("hsyn.txt");
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.canRead());
		System.out.println(file1.getName());
		System.out.println(file1.canExecute());
		System.out.println(file1.isFile());
		System.out.println(file1.isDirectory());
		System.out.println(file1.isAbsolute());
		System.out.println(file1.lastModified());
		System.out.println(file1.isHidden());

	}

}
