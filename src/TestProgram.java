import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestProgram {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("D:\\testprogram.txt");
		PrintStream fout = new PrintStream(fos);
		
		/*
		fos.write('A');
		fos.flush();
		fos.close();
		*/
		int kor1, kor2, kor3;
		int total;
		float avg;
				
		kor1 = 30;
		kor2 = 40;
		kor3 = 50;

		total = kor1+kor2+kor3;
		avg = total / 3;
		
		fout.println("┌────────────\\────────────────────┐\n");
		fout.println("│          \"  \"                      │");
		fout.println("│            성적 출력                                │");
		fout.println("│         \t                       │");
		fout.println("└────────────────────────────────┘");
		fout.printf("국어1 : %d\n", kor1); //10진수
		fout.printf("국어1 : %x\n", kor1); //16진수
		fout.printf("국어2 : %d\n", kor2);
		fout.printf("국어3 : %d\n", kor3);
		fout.printf("국어3 : %1d\n", kor3); //값을 제한하는것이아니라 고정길이만 제어할 뿐 단지 뒤로 밀려난다 그러므로 최댓값을 최대한 맞추는게 좋다

		fout.println(""); //out은 모니터가 대상인 객체. 출력스트림. 스트림을 사용하는 이유는 대기시간을 없애고 효율성을 높이기 위해, 동시성의 문제를 제거하기 위해.
		fout.printf("총점 : %d\n", total);
		fout.printf("평균 : %f\n", avg);
		fout.printf("평균 : %5.2f\n", avg);
		fout.printf("평균 : %.2f\n", avg);
		fout.printf("평균 : %e\n", avg); //실수 지수표현법
		fout.println("──────────────────────────────────");
		fout.println(80);
		fout.printf("%d\n", 80);
		fout.printf("국어1 : %d\n", kor1);
		fout.printf("평균 : %f\n", avg);
		fout.printf("%d년 %d월 %d일\n", 2019, 03, 15);

		fout.close();
		fos.close();
		System.out.print("작업완료");
	}

}
