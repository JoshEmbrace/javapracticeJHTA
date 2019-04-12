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
			
			System.out.println("┌───────────────────────┐");
			System.out.println("│                       메인 메뉴                    │");
			System.out.println("└───────────────────────┘");
			System.out.println("1.성적 입력");
			System.out.println("2.성적 출력");
			System.out.println("3.종료");
			System.out.print("선택 > ");
			menu = scan.nextInt();
			
			라벨벨:
			switch(menu) {
			
			case 1:
				System.out.println("┌───────────────────────┐");
				System.out.println("│                       성적 입력                    │");
				System.out.println("└───────────────────────┘");
				
				
				for(int i=0; i<SIZE; i++) {
					
					System.out.printf("국어%d", i+1);
					do {
							kors[i] = scan.nextInt();
							if(kors[i]<0 || 100<kors[i])
								System.out.println("유효한 값을입력하시오");
							
					}while (kors[i]<0 || 100<kors[i]);
					
				}
			
				
			case 2:
				System.out.println("┌───────────────────────┐");
				System.out.println("│                       성적 출력                    │");
				System.out.println("└───────────────────────┘");
			
				for(int i=0; i<SIZE; i++) {
					
				}
				
				
				
			}
			
			
		}
		
		
	}

}
