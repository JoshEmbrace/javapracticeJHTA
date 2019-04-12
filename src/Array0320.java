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
				
				for(int i=0; i<3; i++)
				do {
					System.out.print("국어%d:");
					kors[i] = scan.nextInt();
					if(kors[i]<0 || 100<kors[i])
						System.out.println("0~100사이의 숫자를 쓰시오.");
				} while(kors[i]<0 || 100<kors[i]);

				
				System.out.println("__________________________");
				break;
			
			case 2:
				
				total = kors[0]+kors[1]+kors[2];
				avg = total / 3.0f;
				
				System.out.println("┌────────────────────────────────┐");
				System.out.println("│                                │");
				System.out.println("│            성적 출력                                │");
				System.out.println("│                                │");
				System.out.println("└────────────────────────────────┘");
				
				
				for( int i = 0; i<3; i++)
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
