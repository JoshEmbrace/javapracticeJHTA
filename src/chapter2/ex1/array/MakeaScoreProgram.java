package chapter2.ex1.array;

import java.util.Scanner;

public class MakeaScoreProgram {
	
	public static void main(String[] args) {
		
		int menu;
		final int SIZE = 7;
		int[] kors = new int[SIZE];
		
		for(int i=0; i<SIZE; i++)
			kors[i] = 0;
		
		
		int total = 0;
		float avg = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("��������������������������������������������������");
			System.out.println("��                       ���� �޴�                    ��");
			System.out.println("��������������������������������������������������");
			System.out.println("1.���� �Է�");
			System.out.println("2.���� ���");
			System.out.println("3.����");
			System.out.print("���� > ");
			menu = scan.nextInt();
			
			�󺧺�:
			switch(menu) {
			
			case 1:
				System.out.println("��������������������������������������������������");
				System.out.println("��                       ���� �Է�                    ��");
				System.out.println("��������������������������������������������������");
				
				
				for(int i=0; i<SIZE; i++) {
					
					System.out.printf("����%d", i+1);
					do {
							kors[i] = scan.nextInt();
							if(kors[i]<0 || 100<kors[i])
								System.out.println("��ȿ�� �����Է��Ͻÿ�");
							
					}while (kors[i]<0 || 100<kors[i]);
					
				}
			
				
			case 2:
				System.out.println("��������������������������������������������������");
				System.out.println("��                       ���� ���                    ��");
				System.out.println("��������������������������������������������������");
			
				for(int i=0; i<SIZE; i++) {
					
				}
				
				
				
			}
			
			
		}
		
		
	}

}
