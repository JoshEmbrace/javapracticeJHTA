package chapter3.ex4.oop.hasa;

import java.util.Scanner;

/*
 
 
 
 */

public class Program {

	public static void main(String[] args) {

		// ���
		//Exam[] exams = new Exam[3];
		//int current = 0;
		ExamConsole console = new ExamConsole();//ExamList + () ��ü�����Լ�
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
				console.input();
				break;

			case 2:
				console.print();
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
