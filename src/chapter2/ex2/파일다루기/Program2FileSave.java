package chapter2.ex2.파일다루기;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//2.파일을 바이너리와 텍스트로 저장해보기
public class Program2FileSave {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("D:\\java\\workspace\\file_save.txt");
		PrintStream fout = new PrintStream(fos);
		
		int x = 53;
		
		fos.write(x);
		fos.write('\n');
		fos.write('\r');

		fout.close();
		fos.close();
		
		
		System.out.println("저장 완료");
		
	}

}
