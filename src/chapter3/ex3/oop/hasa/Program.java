package chapter3.ex3.oop.hasa;

import java.util.Scanner;

/*
 
 
 
 */

public class Program {

	public static void main(String[] args) {

		// ���
		//Exam[] exams = new Exam[3];
		//int current = 0;
		ExamList exams = new ExamList();//ExamList + () ��ü�����Լ�
		//exams.init(); <- ��� �̰� �ʱ�ȭ��� ���� "exams.reset();"�� �ش��Ѵ�.
			
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
