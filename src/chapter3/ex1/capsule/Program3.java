package chapter3.ex1.capsule;

import java.util.Scanner;

/*
 
 
 
 */

public class Program3 {

	public static void main(String[] args) {

		// 재료
		//Exam[] exams = new Exam[3];
		//int current = 0;
		ExamList exams = new ExamList();
		
		exams.list = new Exam[3];
		exams.current = 0;
			
		//객체, 참조변수, 값변수
		
		
		// 반복
		// 1.메뉴 입력
		EXIT: 
			while (true) {

			int menu = inputMenu();

			// 2.메뉴에 따라서
			// 성적입력
			// 성적출력
			// 종료
			switch (menu) {

			case 1:
				inputExamList(exams);
				break;

			case 2:
				printExamList(exams);
				break;

			case 3:
				System.out.println("\t\t\tByeBye~~~");
				break EXIT;

			default:
			}

		}

	}

	private static void printExamList(ExamList exams) {

		int current = exams.current;
		Exam[] list = exams.list;
		
		System.out.println();
		System.out.println("┌───────────────────────────┐");
		System.out.println("│          			성적 출력             		     │");
		System.out.println("└───────────────────────────┘");

		for (int i = 0; i < current; i++) {

			int kor = list[i].kor;
			int eng = list[i].eng;
			int math = list[i].math;

			int total = kor + eng + math;
			float avg = total / 3.0f;
			System.out.printf("성적%d > 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n", i + 1, kor, eng, math, total, avg);

		}

		System.out.println("─────────────────────────────");

	}

	private static void inputExamList(ExamList exams) {

		System.out.println();
		System.out.println("┌───────────────────────────┐");
		System.out.println("│          			성적 입력             		     │");
		System.out.println("└───────────────────────────┘");
		Scanner scan = new Scanner(System.in);

		int kor, eng, math;
		int current = exams.current;
		Exam[] list = exams.list;
		
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

		
		
		list[current] = new Exam();
		list[current].kor = kor;
		list[current].eng = eng;
		list[current].math = math;
		current++;
		exams.current = current;
		
		
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
