import java.util.Scanner;

public class Array0320 {

	public static void main(String[] args) {
		
	
		int menu;
		int[] kors = new int[3];
		int total;
		float avg;

		for(int i=0; i<3; i++)
			kors[i] = 0;
		
		

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
				
				for(int i=0; i<3; i++)
				do {
					System.out.print("����%d:");
					kors[i] = scan.nextInt();
					if(kors[i]<0 || 100<kors[i])
						System.out.println("0~100������ ���ڸ� ���ÿ�.");
				} while(kors[i]<0 || 100<kors[i]);

				
				System.out.println("__________________________");
				break;
			
			case 2:
				
				total = kors[0]+kors[1]+kors[2];
				avg = total / 3.0f;
				
				System.out.println("��������������������������������������������������������������������");
				System.out.println("��                                ��");
				System.out.println("��            ���� ���                                ��");
				System.out.println("��                                ��");
				System.out.println("��������������������������������������������������������������������");
				
				
				for( int i = 0; i<3; i++)
					System.out.printf("����%d:%d\n", i+1, kors[i]);
				
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
