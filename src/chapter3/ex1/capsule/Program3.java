package chapter3.ex1.capsule;

import java.util.Scanner;

/*
 
 
 
 */

public class Program3 {

	public static void main(String[] args) {

		// ���
		//Exam[] exams = new Exam[3];
		//int current = 0;
		ExamList exams = new ExamList();
		
		exams.list = new Exam[3];
		exams.current = 0;
			
		//��ü, ��������, ������
		
		
		// �ݺ�
		// 1.�޴� �Է�
		EXIT: 
			while (true) {

			int menu = inputMenu();

			// 2.�޴��� ����
			// �����Է�
			// �������
			// ����
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

	private static void inputExamList(ExamList exams) {

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