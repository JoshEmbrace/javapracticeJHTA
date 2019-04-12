import java.util.Scanner;

public class First2 {

	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
				

		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("┌────────────────────────────────┐");
			System.out.println("│                                                                                        │");
			System.out.println("│                                 성적 입력                                │");
			System.out.println("│                                                                                        │");
			System.out.println("└────────────────────────────────┘");
			
			
			do{
				System.out.print("국어1:");
				kor1 = scan.nextInt();
			
			
			//kor1의 값이 100보다 크고 0보다 작은 동안에, while은 후 조치가 필요할 때(재검사)
				if(kor1<0 || 100<kor1)
					System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
			}
			while(kor1<0 || 100<kor1);
			
			
			do {
				System.out.print("국어2:");
				kor2 = scan.nextInt();
				
				if(kor1<0 || 100<kor1)
					System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
				
			}
			
			while(kor2<0 || 100<kor2);
				
				
				
			
			do {
			System.out.print("국어3:");
			kor3 = scan.nextInt();
			
				if(kor1<0 || 100<kor1)
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
			
			}
			while(kor3<0 || 100<kor3);
			
			while(kor1<0 || 100<kor1);
			total = kor1+kor2+kor3;
			avg = total / 3.0f;
		
			
			
			System.out.println("__________________________");
			
			System.out.println("┌────────────────────────────────┐");
			System.out.println("│                                                                                        │");
			System.out.println("│                                 성적 출력                                │");
			System.out.println("│                                                                                        │");
			System.out.println("└────────────────────────────────┘");
			
			System.out.printf("국어1:%d\n", kor1);
			System.out.printf("국어2:%d\n", kor2);
			System.out.printf("국어3:%d\n", kor3);
	
			System.out.printf("총점:%d\n", total);
			System.out.printf("평균:%f\n", avg);
			
			
		}
		
		
	}

}
