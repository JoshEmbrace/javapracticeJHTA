package chapter3.ex2.capsule;

import java.util.Scanner;

/*
	���� ������ �����ϴ� ���α׷���
	����, ���� ������ �߰��� ���α׷�
 */

public class Program1 {

	public static void main(String[] args) {

		int[] kors = new int[3];

		/*
		 * int kor1, kor2, kor3; int total; float avg; int menu;
		 */
		Exam[] exams = new Exam[3];
		int current = 0;

		Scanner scan = new Scanner(System.in);

		�󺧺�: while (true) {
			System.out.println("����������������������������������������������������������");
			System.out.println("��           ���� �޴�               				    ��");
			System.out.println("����������������������������������������������������������");
			System.out.println("\t1. �����Է� ");
			System.out.println("\t2. ������� ");
			System.out.println("\t3. ���� ");
			System.out.println("\t����> ");
			int menu = scan.nextInt();

			switch (menu) {
			case 1: {

				System.out.println("����������������������������������������������������������");
				System.out.println("��           ����  �Է�          				        ��");
				System.out.println("����������������������������������������������������������");
				System.out.println();
				/*
				 * for(int i=0; i<3; i++) do { System.out.printf("����%d : ", i+1); kors[i] =
				 * scan.nextInt();
				 * 
				 * if(kors[i] < 0 || 100 < kors[i])
				 * System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
				 * 
				 * }while(kors[i] < 0 || 100 < kors[i]);
				 */

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

				break;
			}
			case 2: {

				for (int i = 0; i < current; i++) {

					int kor = exams[i].kor;
					int eng = exams[i].eng;
					int math = exams[i].math;

					int total = kor + eng + math;
					float avg = total / 3.0f;

					System.out.println("����������������������������������������������������������");
					System.out.println("��           ����  ���            				       ��");
					System.out.println("����������������������������������������������������������");
					System.out.println();

					System.out.printf("����%d, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n", i + 1, kor, eng, math, total, avg);

				}

				System.out.println("����������������������������������������������������������");

				break;
			}
			case 3:
				System.out.println("Bye~~");
				break �󺧺�;

			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �޴��� 1~3�����Դϴ�.");

			}

		}

	}

}