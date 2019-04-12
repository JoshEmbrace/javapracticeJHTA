package chapter3.ex3.oop;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		// ���
		Exam[] exams = new Exam[3];
		int current = 0; //������, �����Ұ���
		// �ݺ�
		// 1.�޴� �Է�
		EXIT: while (true) {

			int menu = inputMenu();

			// 2.�޴��� ����
			// �����Է�
			// �������
			// ����
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
		System.out.println("����������������������������������������������������������");
		System.out.println("��          			���� ���             		     ��");
		System.out.println("����������������������������������������������������������");

		for (int i = 0; i < current; i++) {

			int kor = exams[i].kor;
			int eng = exams[i].eng;
			int math = exams[i].math;

			int total = kor + eng + math;
			float avg = total / 3.0f;
			System.out.printf("����%d > ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n", i + 1, kor, eng, math, total, avg);

		}

		System.out.println("����������������������������������������������������������");

	}

	private static void inputExam(Exam[] exams, int current) {

		System.out.println();
		System.out.println("����������������������������������������������������������");
		System.out.println("��          			���� �Է�             		     ��");
		System.out.println("����������������������������������������������������������");
		Scanner scan = new Scanner(System.in);

		int kor, eng, math;

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

		exams[current] = new Exam();
		exams[current].kor = kor;
		exams[current].eng = eng;
		exams[current].math = math;
		current++;

		System.out.println("����������������������������������������������������������");

	}

	private static int inputMenu() {

		System.out.println();
		System.out.println("����������������������������������������������������������");
		System.out.println("��          			���� �޴�             		     ��");
		System.out.println("����������������������������������������������������������");
		System.out.println("\t1. �����Է� ");
		System.out.println("\t2. ������� ");
		System.out.println("\t3. ���� ");
		System.out.print("\t����> ");
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();

		return menu;
	}

}
