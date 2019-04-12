package chapter3.ex6.oop.abtract;

import java.util.Scanner;

public abstract class ExamConsole { //추상화하여 생성은 안되고 참조할 수 있게

	private ExamList list;
	Exam exam = newExam(); //자식에게 생성을 부탁하기 위해 새로운 메소드 껍떼기생성
	//참조는 부모만큼하는데 객체자체는 자식만큼 객체가 생성됨
	
	public ExamConsole () {
		list = new ExamList();
	}

	public void input() {
		Exam exam = newExam();
		onInput(exam, current);
	
	}


	protected abstract void onInput(Exam exam, int current);

	protected abstract Exam newExam();

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
			System.out.printf("성적%d > 국어:%d, 영어:%d, 수학:%d", i + 1, kor, eng, math);
			onPrint(exam);
			System.out.printf("총점:%d, 평균:%.4f\n", total, avg);

		}

		System.out.println("─────────────────────────────");

	}

	protected abstract void onPrint(Exam exam);

}
