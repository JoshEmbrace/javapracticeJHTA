package chapter3.ex5.oop.isa;

import java.util.Scanner;

/*

 * ��� : �����޴�..
 * �����κ��� �����޴°�? �θ�(x) -> ��ǰ(Dependendy)
 * A��� ģ���κ��� ��ӹ޾Ҵ�...
 * A��� ��ü�κ��� ������? �����޾Ҵ°�?
 * ��� OOP���� ����̶� ��ü�� �ɷ��� ���� �޴� ���� �ǹ��ϴµ�..
 * ���࿡ B��� ģ���� A ģ���� �ɷ��� �̿��Ϸ���?
 * B�� A�� ������ �־�߸� �Ѵ�.
 * 
 * class B{
 *      private A a;
 *      public B(){a = new A();}
 *      public int add(int x, int y){
 *           // ������ ��� ����? �� �׷� �ɷ��� ���ų� �����ϱ� ��������?
 *           return a.add(x, y);
 *      }
 * }
 * 
 * �ٸ� ��ü�� �ɷ��� ���� ���� ��� �������� �츮�� ��ü�� ���踦 ������ �־�� �Ѵ�.
 * �� ����� �� ������ ������... �ϳ��� Has a ����... �� �ϳ��� Is a ��������..
 * 
 *  1. (B) Has A (A) ���� : A��ǰ(<->B��ǰ) ����
 *  2. (B) Is A (A) ���� : AƲ(<->B��ǰ) ����
 
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
