package chapter2.ex1.array;
import java.util.Scanner;

public class FinalVariableProgram{

	public static void main(String[] args) {
		
	
		int menu;
		final int SIZE = 5; // ���߿� �ٲ� �� ���� ����� ������ ���(Ȥ�ó� ���� ������ ������ ���ֱ�����) ���������� �빮�ڷ� ����.
//		int SIZE = 5;
		int[] kors = new int[SIZE];
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		total = 0; 
		
		for(int i=0; i<SIZE; i++)
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
				
				
				

					
				for(int i=0; i<SIZE; i++)
					do {
						System.out.printf("����%d:", i+1);
						kors[i] = scan.nextInt();
						if(kors[i]<0 || 100<kors[i])
							System.out.println("0~100������ ���ڸ� ���ÿ�.");
					} while(kors[i]<0 || 100<kors[i]);

				
				System.out.println("��������������������������������������������������������������������");
				break;
			
			case 2:
				
//				total = kors[0]+kors[1]+kors[2];
				for(int i=0; i<SIZE; i++)
					total = total + kors[i];
				
				avg = total / SIZE;
				
				System.out.println("��������������������������������������������������������������������");
				System.out.println("��                                ��");
				System.out.println("��            ���� ���                                ��");
				System.out.println("��                                ��");
				System.out.println("��������������������������������������������������������������������");
				
				
				for( int i = 0; i<SIZE; i++)
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
