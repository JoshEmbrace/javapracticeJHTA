package chapter3.ex2.capsule;

import java.util.Scanner;

public class ExamList {

	Exam[] list;
	int current;
	//public static void printExamList(ExamList exams) {
	public static void print(ExamList exams) {

		int current = exams.current;
		Exam[] list = exams.list;

		System.out.println();
		System.out.println("����������������������������������������������������������");
		System.out.println("��          			���� ���             		     ��");
		System.out.println("����������������������������������������������������������");

		for (int i = 0; i < current; i++) {

			int kor = list[i].kor;
			int eng = list[i].eng;
			int math = list[i].math;

			int total = kor + eng + math;
			float avg = total / 3.0f;
			System.out.printf("����%d > ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n", i + 1, kor, eng, math, total, avg);

		}

		System.out.println("����������������������������������������������������������");

	}
	
	//public static void inputExamList(ExamList exams) {
	public static void input(ExamList exams) {

		System.out.println();
		System.out.println("����������������������������������������������������������");
		System.out.println("��          			���� �Է�             		     ��");
		System.out.println("����������������������������������������������������������");
		Scanner scan = new Scanner(System.in);

		int kor, eng, math;
		int current = exams.current;
		Exam[] list = exams.list;

		do {
			System.out.printf("����%d : ", current + 1);
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("����%d : ", current + 1);
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("����%d : ", current + 1);
			math = scan.nextInt();

			if (math < 0 || 100 < math)
				System.out.println("���м����� 0~100������ ������ �Է��� �����մϴ�.");

		} while (math < 0 || 100 < math);

		list[current] = new Exam();
		list[current].kor = kor;
		list[current].eng = eng;
		list[current].math = math;
		current++;
		exams.current = current;

		System.out.println("����������������������������������������������������������");

	}

	//public static void initExamList(ExamList exams) {
	public static void init(ExamList exams) {	
		exams.list = new Exam[3];
		exams.current = 0;
	}

}
