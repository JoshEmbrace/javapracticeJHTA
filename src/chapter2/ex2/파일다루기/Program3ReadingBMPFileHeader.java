package chapter2.ex2.파일다루기;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//2.파일을 바이너리와 텍스트로 저장해보기
public class Program3ReadingBMPFileHeader {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("D:\\java\\workspace\\pic1.bmp");
		
		final int BFH = 14; //bitmap file header (BMPfileFormat 이미지 한칸에 4byte)
		final int BIH =40; //bitmap information header
		
		byte[] fileBuffer = new byte[BFH];
		byte[] infoBuffer = new byte[BIH];

		fis.read(fileBuffer);
		fis.read(infoBuffer);
		
		int width = ((int)infoBuffer[4]&0xff)<<0 | // 교집합 연산자를 사용하여 비트에 0이 아닌 1이 채워지는것을 방지  
							((int)infoBuffer[5]&0xff)<<8 | 
							((int)infoBuffer[6]&0xff)<<16 | 
							((int)infoBuffer[7]&0xff)<<24 ;
		
		System.out.print(width);
		
		fis.close();
		
		System.out.println("저장 완료");
		
	}

}
