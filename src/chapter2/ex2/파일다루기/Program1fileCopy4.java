package chapter2.ex2.파일다루기;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Program1fileCopy4 {

	public static void main(String[] args) throws IOException {
		
//	FileInputStream fis = new FileInputStream("D:\\java\\workspace\\pic1.bmp");
//		
//	FileOutputStream fos = new FileOutputStream("D:\\java\\workspace\\pic1_copy.bmp");
//		
//	int b = 0;
//		
//	while((b = fis.read()) != -1)
//		fos.write(b);
//		
//	fos.close();
//	fis.close();
		
		FileInputStream fis = new FileInputStream("D:\\java\\workspace\\pic1.bmp");
		
		FileOutputStream fos = new FileOutputStream("D:\\java\\workspace\\pic1_copy.bmp");
		
		byte[] buf = new byte[1024];
		
		int size = 0;
		
		while((size = fis.read(buf)) != -1) {
			fos.write(buf, 0, size);
		}
		
		fos.close();
		fis.close();
		
		System.out.println("복사 완료");
	}

}
