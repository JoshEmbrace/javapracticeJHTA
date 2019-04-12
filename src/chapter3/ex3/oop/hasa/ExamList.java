package chapter3.ex3.oop.hasa;

import java.util.Scanner;

public class ExamList {

	/*
	 * 객체의 결합 관계 객체가 객체를 가지는 상속 일명 마인부우 상속 ------------------------- 우리가 ExamList를
	 * 캡슐화라는 것을 했다. 왜 했지? 어떤 장점이 있길래 "캡슐화"를 했지?
	 * 
	 * ->데이터구조를 사용하는 함수들을 묶어 놓은 것이 캡슐 ->데이터구조의 변경에 영향을 받는 함수들을 묶어 놓은 것이 캡슐 ->캡슐화의
	 * 장점은 외부에서의 변화로 함수가 영향을 받지 않게 하기 위한 캐슬?을 만드는 것 ->따라서, 은닉화는 캡슐을 완성시키는 가장 중요한 방법
	 * 또는 도구라고 할 수 있뜨아~~
	 * 
	 * 오늘의 내용은...
	 * 
	 * ### 1. 분명히 캡슐화를 했는데....#### Exam 클래스에서 kor 변수를 변경하면 그 클래스 밖에 있는 ExamList 파일에서
	 * 오류가 발생하는 것을 볼 수 있다.... 이 또한 캡슐화가 필요하지 아니한가.. 에 대한 내용입니다.
	 * 
	 * ### 2. 연산에 대한 고민.... kor, eng, math를 이용하는 연산을 List 클래스에 하는 것이 맞나? 총점, 평균을 구할
	 * 때마다 항상 연산을 해주는 것이 맞나? 연산의 집중화를 위해서라도 kor,eng,math를 이용하는 코드는 Exam 에서 하는 것이
	 * 맞다요....
	 */

	Exam[] list;
	int current;

	public ExamList() {
		this.list = new Exam[3];
		this.current = 0;
		System.out.println("얏호~~~");
	}

	public void input() {

		System.out.println();
		System.out.println("┌───────────────────────────┐");
		System.out.println("│          			성적 입력             		     │");
		System.out.println("└───────────────────────────┘");
		Scanner scan = new Scanner(System.in);

		int kor, eng, math;
		int current = this.current;
		Exam[] list = this.list;

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
		list[current] = new Exam();
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
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		*/
		
		Exam exam = new Exam(kor, eng, math);
		
		list[current] = exam;

		current++;
		this.current = current;

		System.out.println("─────────────────────────────");

	}

	public void print() {

		int current = this.current;
		Exam[] list = this.list;

		System.out.println();
		System.out.println("┌───────────────────────────┐");
		System.out.println("│          			성적 출력             		     │");
		System.out.println("└───────────────────────────┘");

		for (int i = 0; i < current; i++) {

			Exam exam = list[i];
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
