package chapter3.ex5.oop.isa;

import java.util.Scanner;

public class ExamConsole {

	private ExamList list;

	public ExamConsole () {
		list = new ExamList();
	}

	public void input() {
		int current = list.getCurrent();

		System.out.println();
		System.out.println("┌───────────────────────────┐");
		System.out.println("│          			성적 입력             		     │");
		System.out.println("└───────────────────────────┘");
		Scanner scan = new Scanner(System.in);

		int kor, eng, math;

		do {
			System.out.printf("국어%d : ", current + 1);
			kor = Integer.parseInt(scan.nextLine());

			if (kor < 0 || 100 < kor)
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("영어%d : ", current + 1);
			eng = Integer.parseInt(scan.nextLine());

			if (eng < 0 || 100 < eng)
				System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("수학%d : ", current + 1);
			math = Integer.parseInt(scan.nextLine());

			if (math < 0 || 100 < math)
				System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (math < 0 || 100 < math);

		/*
		 * list[current] = new Exam();
		 */
		// 01.
//		list[current].kor = kor;
//		list[current].eng = eng;
//		list[current].math = math;
//		Exam exam = list[current];
		// 02.
//		exam.kor = kor;
//		exam.eng = eng;
//		exam.math = math;
		/*
		 * exam.setKor(kor); exam.setEng(eng); exam.setMath(math);
		 */

		Exam exam = new Exam(kor, eng, math);

		//add기능
		/*
		list[current] = exam;
		current++;
		this.current = current;
		*/
		list.add(exam);

		System.out.println("─────────────────────────────");

	}

	public void print() {
		/*
		int current = this.current;
		Exam[] list = this.list;
		*/
		int size = list.size();

		System.out.println();
		System.out.println("┌───────────────────────────┐");
		System.out.println("│          			성적 출력             		     │");
		System.out.println("└───────────────────────────┘");

		for (int i = 0; i < size; i++) {

			Exam exam = list.get(i);
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();

			int total = exam.total();// kor + eng + math;
			float avg = exam.avg();// total / 3.0f;
			System.out.printf("성적%d > 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.4f\n", i + 1, kor, eng, math, total, avg);

		}

		System.out.println("─────────────────────────────");

	}

}
