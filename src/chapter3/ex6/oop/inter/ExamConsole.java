package chapter3.ex6.oop.inter;

import java.util.Scanner;

public abstract class ExamConsole { //�߻�ȭ�Ͽ� ������ �ȵǰ� ������ �� �ְ�

	private ExamList list;
	Exam exam = newExam(); //�ڽĿ��� ������ ��Ź�ϱ� ���� ���ο� �޼ҵ� ���������
	//������ �θ�ŭ�ϴµ� ��ü��ü�� �ڽĸ�ŭ ��ü�� ������
	
	public ExamConsole () {
		list = new ExamList();
	}

	public void input() {
		int current = list.getCurrent();

		System.out.println();
		System.out.println("����������������������������������������������������������");
		System.out.println("��          			���� �Է�             		     ��");
		System.out.println("����������������������������������������������������������");
		Scanner scan = new Scanner(System.in);

		int kor, eng, math;

		do {
			System.out.printf("����%d : ", current + 1);
			kor = Integer.parseInt(scan.nextLine());

			if (kor < 0 || 100 < kor)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("����%d : ", current + 1);
			eng = Integer.parseInt(scan.nextLine());

			if (eng < 0 || 100 < eng)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("����%d : ", current + 1);
			math = Integer.parseInt(scan.nextLine());

			if (math < 0 || 100 < math)
				System.out.println("���м����� 0~100������ ������ �Է��� �����մϴ�.");

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

		//Exam exam = new Exam(kor, eng, math);
		
		
		//add���
		/*
		list[current] = exam;
		current++;
		this.current = current;
		*/
		//Exam exam = new Exam(kor,eng,math);//��ü�� �����ʰ� ���ÿ� ���� �־���
		//onInput(exam, current); //�Է��Ҷ�����, ���͸� ���� ����
		onInput(exam, current);
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		list.add(exam);

		
		
		System.out.println("����������������������������������������������������������");

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
		System.out.println("����������������������������������������������������������");
		System.out.println("��          			���� ���             		     ��");
		System.out.println("����������������������������������������������������������");

		for (int i = 0; i < size; i++) {

			Exam exam = list.get(i);
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();

			int total = exam.total();// kor + eng + math;
			float avg = exam.avg();// total / 3.0f;
			System.out.printf("����%d > ����:%d, ����:%d, ����:%d", i + 1, kor, eng, math);
			onPrint(exam);
			System.out.printf("����:%d, ���:%.4f\n", total, avg);

		}

		System.out.println("����������������������������������������������������������");

	}

	protected abstract void onPrint(Exam exam);

}
