package chapter2.ex1.cutting;

import java.io.File;

public class ExplorerProgram {

	public static void main(String[] args) {
		
		File file = new File("D:\\java\\workspace");
		
		String[] names = file.list();
		
		for(int i=0; i<names.length; i++)
			System.out.println(names[i]);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		File[] files = file.listFiles();
		
		for(int i=0; i<names.length; i++)
			System.out.printf("%s : %s\n", files[i].isDirectory(), files[i].getName());
		
		
	}

}
