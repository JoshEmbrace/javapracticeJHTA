import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
				

		Scanner scan = new Scanner(System.in);

		System.out.println("��������������������������������������������������������������������");
		System.out.println("��                                                                                        ��");
		System.out.println("��            						���� �Է�                              ��");
		System.out.println("��                                                                                        ��");
		System.out.println("��������������������������������������������������������������������");
		
		System.out.print("����1:");
		kor1 = scan.nextInt();
		
		System.out.print("����2:");
		kor2 = scan.nextInt();
		
		System.out.print("����3:");
		kor3 = scan.nextInt();
		
		total = kor1+kor2+kor3;
		avg = total / 3.0f;
		
		
		System.out.println("__________________________");
		
		System.out.println("��������������������������������������������������������������������");
		System.out.println("��                                                                                        ��");
		System.out.println("��                                 ���� ���                                ��");
		System.out.println("��                                                                                        ��");
		System.out.println("��������������������������������������������������������������������");
		
		System.out.printf("����1:%d\n", kor1);
		System.out.printf("����2:%d\n", kor2);
		System.out.printf("����3:%d\n", kor3);

		System.out.printf("����:%d\n", total);
		System.out.printf("���:%f\n", avg);
	    
		System.out.println("��������������������������\\������������������������������������������\n");
		System.out.println("��          \"  \"                      ��");
		System.out.println("��            ���� �Է�                                ��");
		System.out.println("��         \t                       ��");
		System.out.println("��������������������������������������������������������������������");
		System.out.printf("����1 : %d\n", kor1); //10����
		System.out.printf("����1 : %x\n", kor1); //16����
		System.out.printf("����2 : %d\n", kor2);
		System.out.printf("����3 : %d\n", kor3);
		System.out.printf("����3 : %1d\n", kor3); //���� �����ϴ°��̾ƴ϶� �������̸� ������ �� ���� �ڷ� �з����� �׷��Ƿ� �ִ��� �ִ��� ���ߴ°� ����
		
		System.out.println("��������������������������������������������������������������������");
		
		System.out.println("��������������������������\\������������������������������������������\n");
		System.out.println("��          \"  \"                      ��");
		System.out.println("��            ���� ���                                ��");
		System.out.println("��         \t                       ��");
		System.out.println("��������������������������������������������������������������������");
		System.out.printf("����1 : %d\n", kor1); //10����
		System.out.printf("����1 : %x\n", kor1); //16����
		System.out.printf("����2 : %d\n", kor2);
		System.out.printf("����3 : %d\n", kor3);
		System.out.printf("����3 : %1d\n", kor3);
		
		System.out.println(""); //out�� ����Ͱ� ����� ��ü. ��½�Ʈ��. ��Ʈ���� ����ϴ� ������ ���ð��� ���ְ� ȿ������ ���̱� ����, ���ü��� ������ �����ϱ� ����.
		System.out.printf("���� : %d\n", total);
		System.out.printf("��� : %f\n", avg);
		System.out.printf("��� : %5.2f\n", avg);
		System.out.printf("��� : %.2f\n", avg);
		System.out.printf("��� : %e\n", avg); //�Ǽ� ����ǥ����
		System.out.println("��������������������������������������������������������������������");
		System.out.println(80);
		System.out.printf("%d\n", 80);
		System.out.printf("����1 : %d\n", kor1);
		System.out.printf("��� : %f\n", avg);
		System.out.printf("%d/ %d/ %d/\n", 2019, 03, 15);
		
		scan.close();
		
	}

}
