package chapter2.ex2.���ϴٷ��;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//2.������ ���̳ʸ��� �ؽ�Ʈ�� �����غ���
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
		
		
		System.out.println("���� �Ϸ�");
		
	}

}
