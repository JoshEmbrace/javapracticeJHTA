import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
				

		Scanner scan = new Scanner(System.in);

		System.out.println("┌────────────────────────────────┐");
		System.out.println("│                                                                                        │");
		System.out.println("│            						성적 입력                              │");
		System.out.println("│                                                                                        │");
		System.out.println("└────────────────────────────────┘");
		
		System.out.print("국어1:");
		kor1 = scan.nextInt();
		
		System.out.print("국어2:");
		kor2 = scan.nextInt();
		
		System.out.print("국어3:");
		kor3 = scan.nextInt();
		
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
	    
		System.out.println("┌────────────\\────────────────────┐\n");
		System.out.println("│          \"  \"                      │");
		System.out.println("│            성적 입력                                │");
		System.out.println("│         \t                       │");
		System.out.println("└────────────────────────────────┘");
		System.out.printf("국어1 : %d\n", kor1); //10진수
		System.out.printf("국어1 : %x\n", kor1); //16진수
		System.out.printf("국어2 : %d\n", kor2);
		System.out.printf("국어3 : %d\n", kor3);
		System.out.printf("국어3 : %1d\n", kor3); //값을 제한하는것이아니라 고정길이만 제어할 뿐 단지 뒤로 밀려난다 그러므로 최댓값을 최대한 맞추는게 좋다
		
		System.out.println("──────────────────────────────────");
		
		System.out.println("┌────────────\\────────────────────┐\n");
		System.out.println("│          \"  \"                      │");
		System.out.println("│            성적 출력                                │");
		System.out.println("│         \t                       │");
		System.out.println("└────────────────────────────────┘");
		System.out.printf("국어1 : %d\n", kor1); //10진수
		System.out.printf("국어1 : %x\n", kor1); //16진수
		System.out.printf("국어2 : %d\n", kor2);
		System.out.printf("국어3 : %d\n", kor3);
		System.out.printf("국어3 : %1d\n", kor3);
		
		System.out.println(""); //out은 모니터가 대상인 객체. 출력스트림. 스트림을 사용하는 이유는 대기시간을 없애고 효율성을 높이기 위해, 동시성의 문제를 제거하기 위해.
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %f\n", avg);
		System.out.printf("평균 : %5.2f\n", avg);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.printf("평균 : %e\n", avg); //실수 지수표현법
		System.out.println("──────────────────────────────────");
		System.out.println(80);
		System.out.printf("%d\n", 80);
		System.out.printf("국어1 : %d\n", kor1);
		System.out.printf("평균 : %f\n", avg);
		System.out.printf("%d/ %d/ %d/\n", 2019, 03, 15);
		
		scan.close();
		
	}

}
