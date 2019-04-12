package chapter3.ex3.oop.hasa;

import java.util.Scanner;

/*
 
 
 
 */

public class Program {

	public static void main(String[] args) {

		// 재료
		//Exam[] exams = new Exam[3];
		//int current = 0;
		ExamList exams = new ExamList();//ExamList + () 객체생성함수
		//exams.init(); <- 사실 이건 초기화라기 보단 "exams.reset();"에 해당한다.
			
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
				//ExamList.inputExamList(exams);
				//ExamList.input(exams);
				exams.input();
				break;

			case 2:
				exams.print();
				break;

			case 3:
				System.out.println("\t\t\tByeBye~~~");
				break EXIT;

			default:
			}

		}

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
