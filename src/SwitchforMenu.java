import java.util.Scanner;

public class SwitchforMenu {

	public static void main(String[] args) {
		
		int menu;
		int kor1, kor2, kor3;
		int total;
		float avg;

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		

		Scanner scan = new Scanner(System.in);
		
		�󺧺�:
		while(true) {
			System.out.println("��������������������������������������������������������������������");
			System.out.println("��                                ��");
			System.out.println("��            ���� �޴�                                ��");
			System.out.println("��                                ��");
			System.out.println("��������������������������������������������������������������������");
			
			System.out.println("\t1.���� �Է�");
			System.out.println("\t2.���� ���");
			System.out.println("\t3.����");	
			System.out.print("\t���� > ");	
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				
				System.out.println("��������������������������������������������������������������������");
				System.out.println("��                                ��");
				System.out.println("��            ���� �Է�                                ��");
				System.out.println("��                                ��");
				System.out.println("��������������������������������������������������������������������");
				
				do {
					System.out.print("����1:");
					kor1 = scan.nextInt();
					if(kor1<0 || 100<kor1)
						System.out.println("0~100������ ���ڸ� ���ÿ�.");
				} while(kor1<0 || 100<kor1);
				
				do {
					System.out.print("����2:");
					kor2 = scan.nextInt();
					if(kor2<0 || 100<kor2)
						System.out.println("0~100������ ���ڸ� ���ÿ�.");
				} while(kor2<0 || 100<kor2);
				do {
					System.out.print("����3:");
					kor3 = scan.nextInt();
					if(kor3<0 || 100<kor3)
					System.out.println("0~100������ ���ڸ� ���ÿ�.");
				} while(kor3<0 || 100<kor3);
				
				System.out.println("__________________________");
				break;
			
			case 2:
				
				total = kor1+kor2+kor3;
				avg = total / 3.0f;
				
				System.out.println("��������������������������������������������������������������������");
				System.out.println("��                                ��");
				System.out.println("��            ���� ���                                ��");
				System.out.println("��                                ��");
				System.out.println("��������������������������������������������������������������������");
				
				
				for( int i = 0; i<3; i++)
					System.out.printf("����%d:%d\n", i+1, kor1);
				
				System.out.printf("����:%d\n", total);
				System.out.printf("���:%f\n", avg);
				break;
				
			
			case 3:
				System.out.println("Bye~~~");
				break �󺧺�;
				
			
			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �޴��� 1~3�����Դϴ�.");
			
			
			}

		}	
		
	}

}
