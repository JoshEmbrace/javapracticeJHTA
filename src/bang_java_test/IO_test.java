package bang_java_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IO_test {

	public static void main(String[] args) {
		
		try {
            File file = new File("D:\\java\\workspace\\ionum.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000); 
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }

	}

}
