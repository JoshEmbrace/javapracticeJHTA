package chapter3.ex3.oop;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		// 재료
		Exam[] exams = new Exam[3];
		int current = 0; //값변수, 참조불가능
		// 반복
		// 1.메뉴 입력
		EXIT: while (true) {

			int menu = inputMenu();

			// 2.메뉴에 따라서
			// 성적입력
			// 성적출력
			// 종료
			switch (menu) {

			case 1:
				inputExam(exams, current);
				break;

			case 2:
				printExam(exams, current);
				break;

			case 3:
				System.out.println("\t\t\tByeBye~~~");
				break EXIT;

			default:
			}

		}

	}

	private static void printExam(Exam[] exams, int current) {

		System.out.println();
		System.out.println("┌───────────────────────────┐");
		System.out.println("│          			성적 출력             		     │");
		System.out.println("└───────────────────────────┘");

		for (int i = 0; i < current; i++) {

			int kor = exams[i].kor;
			int eng = exams[i].eng;
			int math = exams[i].math;

			int total = kor + eng + math;
			float avg = total / 3.0f;
			System.out.printf("성적%d > 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n", i + 1, kor, eng, math, total, avg);

		}

		System.out.println("─────────────────────────────");

	}

	private static void inputExam(Exam[] exams, int current) {

		System.out.println();
		System.out.println("┌───────────────────────────┐");
		System.out.println("│          			성적 입력             		     │");
		System.out.println("└───────────────────────────┘");
		Scanner scan = new Scanner(System.in);

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

	}

	private static int inputMenu() {

		System.out.println();
		System.out.println("┌───────────────────────────┐");
		System.out.println("│          			메인 메뉴             		     │");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.print("\t선택> ");
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();

		return menu;
	}

}
