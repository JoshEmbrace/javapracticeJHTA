package chapter2.ex2.���ϴٷ��;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//2.������ ���̳ʸ��� �ؽ�Ʈ�� �����غ���
public class Program3ReadingBMPFileHeader {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("D:\\java\\workspace\\pic1.bmp");
		
		final int BFH = 14; //bitmap file header (BMPfileFormat �̹��� ��ĭ�� 4byte)
		final int BIH =40; //bitmap information header
		
		byte[] fileBuffer = new byte[BFH];
		byte[] infoBuffer = new byte[BIH];

		fis.read(fileBuffer);
		fis.read(infoBuffer);
		
		int width = ((int)infoBuffer[4]&0xff)<<0 | // ������ �����ڸ� ����Ͽ� ��Ʈ�� 0�� �ƴ� 1�� ä�����°��� ����  
							((int)infoBuffer[5]&0xff)<<8 | 
							((int)infoBuffer[6]&0xff)<<16 | 
							((int)infoBuffer[7]&0xff)<<24 ;
		
		System.out.print(width);
		
		fis.close();
		
		System.out.println("���� �Ϸ�");
		
	}

}
