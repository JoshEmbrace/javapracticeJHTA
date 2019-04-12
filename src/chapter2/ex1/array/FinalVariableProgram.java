package chapter2.ex1.array;
import java.util.Scanner;

public class FinalVariableProgram{

	public static void main(String[] args) {
		
	
		int menu;
		final int SIZE = 5; // 나중에 바꿀 수 없는 상수형 변수를 사용(혹시나 있을 변수의 변동을 없애기위해) 관습적으로 대문자로 쓴다.
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
		
		라벨벨:
		while(true) {
			System.out.println("┌────────────────────────────────┐");
			System.out.println("│                                │");
			System.out.println("│            메인 메뉴                                │");
			System.out.println("│                                │");
			System.out.println("└────────────────────────────────┘");
			
			System.out.println("\t1.성적 입력");
			System.out.println("\t2.성적 출력");
			System.out.println("\t3.종료");	
			System.out.print("\t선택 > ");	
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				
				System.out.println("┌────────────────────────────────┐");
				System.out.println("│                                │");
				System.out.println("│            성적 입력                                │");
				System.out.println("│                                │");
				System.out.println("└────────────────────────────────┘");
				
				
				

					
				for(int i=0; i<SIZE; i++)
					do {
						System.out.printf("국어%d:", i+1);
						kors[i] = scan.nextInt();
						if(kors[i]<0 || 100<kors[i])
							System.out.println("0~100사이의 숫자를 쓰시오.");
					} while(kors[i]<0 || 100<kors[i]);

				
				System.out.println("──────────────────────────────────");
				break;
			
			case 2:
				
//				total = kors[0]+kors[1]+kors[2];
				for(int i=0; i<SIZE; i++)
					total = total + kors[i];
				
				avg = total / SIZE;
				
				System.out.println("┌────────────────────────────────┐");
				System.out.println("│                                │");
				System.out.println("│            성적 출력                                │");
				System.out.println("│                                │");
				System.out.println("└────────────────────────────────┘");
				
				
				for( int i = 0; i<SIZE; i++)
					System.out.printf("국어%d:%d\n", i+1, kors[i]);
				
				System.out.printf("총점:%d\n", total);
				System.out.printf("평균:%f\n", avg);
				break;
				
			
			case 3:
				System.out.println("Bye~~~");
				break 라벨벨;
				
			
			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
				
			}
			
		}

	}

}
