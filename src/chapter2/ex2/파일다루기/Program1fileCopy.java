package chapter2.ex2.���ϴٷ��;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Program1fileCopy {

	public static void main(String[] args) throws IOException {
		
		
		//1."D:\java\workspace\first.java"������ �Է��ϱ� ���� FileInputStream ��ü�� fis ��� �̸����� ����.
		

		FileInputStream fis = new FileInputStream("D:\\java\\workspace\\First.java");
		
		//2.���� ������ �����ؼ� �纻���� ������ ������ "D:\java\workspace\first_����.java"���Ϸ� �����ϱ� ���� FileOutputStream��ü�� fos ��� �̸����� ����
		

		FileOutputStream fos = new FileOutputStream("D:\\java\\workspace\\First_����1.java");
		
		//3.������ ����
		// [][][][][][][][] ==> First.java�� 8����Ʈ ũ���� �����̶�� �����ϸ�
		int b = 0;
		
		//fis.read()�� ȣ��� ��, fis�� ��� ������ block ���¿��� ���Ϸκ��� �����͸� �����ͼ� ���۸� ä��
		//���� �� �Է½�Ʈ�� ���۰� 8����Ʈ ���۶�� ���Ϸκ��� 8����Ʈ�� �о ���۸� ä��
		while(b!=-1) { // read() method�� �дٰ� ���������� �о���� �� -1 ���� ��ȯ�ϹǷ� ������ ������ �����
			b = fis.read(); // _[][][][][][][] => ���ۿ��� ù ��° ����Ʈ�� �о���̰� �������� 7�� ����Ʈ�� ����
			fos.write(b);
//			b=fis.read();  __[][][][][][] => ���ۿ��� �� ��° ����Ʈ�� �о���̰� �������� 6�� ����Ʈ�� ����
//			fos.write(b);     
		}
		
		
		//4. fis �� fos�� �ݴ� �ڵ带 �ۼ��Ѵ�.
		
		fos.close();
		
		fis.close();
		
		System.out.println("����Ϸ�");
		
	}

}
