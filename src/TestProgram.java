import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestProgram {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("D:\\testprogram.txt");
		PrintStream fout = new PrintStream(fos);
		
		/*
		fos.write('A');
		fos.flush();
		fos.close();
		*/
		int kor1, kor2, kor3;
		int total;
		float avg;
				
		kor1 = 30;
		kor2 = 40;
		kor3 = 50;

		total = kor1+kor2+kor3;
		avg = total / 3;
		
		fout.println("��������������������������\\������������������������������������������\n");
		fout.println("��          \"  \"                      ��");
		fout.println("��            ���� ���                                ��");
		fout.println("��         \t                       ��");
		fout.println("��������������������������������������������������������������������");
		fout.printf("����1 : %d\n", kor1); //10����
		fout.printf("����1 : %x\n", kor1); //16����
		fout.printf("����2 : %d\n", kor2);
		fout.printf("����3 : %d\n", kor3);
		fout.printf("����3 : %1d\n", kor3); //���� �����ϴ°��̾ƴ϶� �������̸� ������ �� ���� �ڷ� �з����� �׷��Ƿ� �ִ��� �ִ��� ���ߴ°� ����

		fout.println(""); //out�� ����Ͱ� ����� ��ü. ��½�Ʈ��. ��Ʈ���� ����ϴ� ������ ���ð��� ���ְ� ȿ������ ���̱� ����, ���ü��� ������ �����ϱ� ����.
		fout.printf("���� : %d\n", total);
		fout.printf("��� : %f\n", avg);
		fout.printf("��� : %5.2f\n", avg);
		fout.printf("��� : %.2f\n", avg);
		fout.printf("��� : %e\n", avg); //�Ǽ� ����ǥ����
		fout.println("��������������������������������������������������������������������");
		fout.println(80);
		fout.printf("%d\n", 80);
		fout.printf("����1 : %d\n", kor1);
		fout.printf("��� : %f\n", avg);
		fout.printf("%d�� %d�� %d��\n", 2019, 03, 15);

		fout.close();
		fos.close();
		System.out.print("�۾��Ϸ�");
	}

}
