package chapter3.ex2.capsule;

import java.util.Scanner;

/*
	국어 성적을 관리하는 프로그램에
	영어, 수학 과목을 추가한 프로그램
 */

public class Program1 {

	public static void main(String[] args) {

		int[] kors = new int[3];

		/*
		 * int kor1, kor2, kor3; int total; float avg; int menu;
		 */
		Exam[] exams = new Exam[3];
		int current = 0;

		Scanner scan = new Scanner(System.in);

		라벨벨: while (true) {
			System.out.println("┌───────────────────────────┐");
			System.out.println("│           메인 메뉴               				    │");
			System.out.println("└───────────────────────────┘");
			System.out.println("\t1. 성적입력 ");
			System.out.println("\t2. 성적출력 ");
			System.out.println("\t3. 종료 ");
			System.out.println("\t선택> ");
			int menu = scan.nextInt();

			switch (menu) {
			case 1: {

				System.out.println("┌───────────────────────────┐");
				System.out.println("│           성적  입력          				        │");
				System.out.println("└───────────────────────────┘");
				System.out.println();
				/*
				 * for(int i=0; i<3; i++) do { System.out.printf("국어%d : ", i+1); kors[i] =
				 * scan.nextInt();
				 * 
				 * if(kors[i] < 0 || 100 < kors[i])
				 * System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
				 * 
				 * }while(kors[i] < 0 || 100 < kors[i]);
				 */

				int kor, eng, math;

				do {
					System.out.printf("국어%d : ", current + 1);
					kor = scan.nextInt();

					if (kor < 0 || 100 < kor)
						System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

				} while (kor < 0 || 100 < kor);

				do {
					System.out.printf("영어%d : ", current + 1);
					eng = scan.nextInt();

					if (eng < 0 || 100 < eng)
						System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");

				} while (eng < 0 || 100 < eng);

				do {
					System.out.printf("수학%d : ", current + 1);
					math = scan.nextInt();

					if (math < 0 || 100 < math)
						System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");

				} while (math < 0 || 100 < math);

				exams[current] = new Exam();
				exams[current].kor = kor;
				exams[current].eng = eng;
				exams[current].math = math;
				current++;

				System.out.println("─────────────────────────────");

				break;
			}
			case 2: {

				for (int i = 0; i < current; i++) {

					int kor = exams[i].kor;
					int eng = exams[i].eng;
					int math = exams[i].math;

					int total = kor + eng + math;
					float avg = total / 3.0f;

					System.out.println("┌───────────────────────────┐");
					System.out.println("│           성적  출력            				       │");
					System.out.println("└───────────────────────────┘");
					System.out.println();

					System.out.printf("성적%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n", i + 1, kor, eng, math, total, avg);

				}

				System.out.println("─────────────────────────────");

				break;
			}
			case 3:
				System.out.println("Bye~~");
				break 라벨벨;

			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");

			}

		}

	}

}