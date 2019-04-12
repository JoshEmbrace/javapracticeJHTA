package chapter2.ex2.파일다루기;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Program1fileCopy2 {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("D:\\java\\workspace\\pic1.bmp");
		
		FileOutputStream fos = new FileOutputStream("D:\\java\\workspace\\pic1_복사본.bmp");
		
		int b = 0;
		
		/*
		while(b != -1) {
			
			b = fis.read();
			fos.write(b);
		
		}
		*/
		/*방법1 
		while(true) {
			b = fis.read();
				if(b == -1)
					break;
				
			fos.write(b);
		}*/
		
		//방법2 짱짱맨~
		while((b=fis.read()) != -1)
			fos.write(b);
		
		
		fos.close();
		fis.close();
		
		System.out.println("복사완료");
		
	}

}
