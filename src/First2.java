import java.util.Scanner;

public class First2 {

	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
				

		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("��������������������������������������������������������������������");
			System.out.println("��                                                                                        ��");
			System.out.println("��                                 ���� �Է�                                ��");
			System.out.println("��                                                                                        ��");
			System.out.println("��������������������������������������������������������������������");
			
			
			do{
				System.out.print("����1:");
				kor1 = scan.nextInt();
			
			
			//kor1�� ���� 100���� ũ�� 0���� ���� ���ȿ�, while�� �� ��ġ�� �ʿ��� ��(��˻�)
				if(kor1<0 || 100<kor1)
					System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
			}
			while(kor1<0 || 100<kor1);
			
			
			do {
				System.out.print("����2:");
				kor2 = scan.nextInt();
				
				if(kor1<0 || 100<kor1)
					System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
				
			}
			
			while(kor2<0 || 100<kor2);
				
				
				
			
			do {
			System.out.print("����3:");
			kor3 = scan.nextInt();
			
				if(kor1<0 || 100<kor1)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
			
			}
			while(kor3<0 || 100<kor3);
			
			while(kor1<0 || 100<kor1);
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
			
			
		}
		
		
	}

}
