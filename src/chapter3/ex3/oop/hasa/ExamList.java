package chapter3.ex3.oop.hasa;

import java.util.Scanner;

public class ExamList {

	/*
	 * ��ü�� ���� ���� ��ü�� ��ü�� ������ ��� �ϸ� ���κο� ��� ------------------------- �츮�� ExamList��
	 * ĸ��ȭ��� ���� �ߴ�. �� ����? � ������ �ֱ淡 "ĸ��ȭ"�� ����?
	 * 
	 * ->�����ͱ����� ����ϴ� �Լ����� ���� ���� ���� ĸ�� ->�����ͱ����� ���濡 ������ �޴� �Լ����� ���� ���� ���� ĸ�� ->ĸ��ȭ��
	 * ������ �ܺο����� ��ȭ�� �Լ��� ������ ���� �ʰ� �ϱ� ���� ĳ��?�� ����� �� ->����, ����ȭ�� ĸ���� �ϼ���Ű�� ���� �߿��� ���
	 * �Ǵ� ������� �� �� �ֶ߾�~~
	 * 
	 * ������ ������...
	 * 
	 * ### 1. �и��� ĸ��ȭ�� �ߴµ�....#### Exam Ŭ�������� kor ������ �����ϸ� �� Ŭ���� �ۿ� �ִ� ExamList ���Ͽ���
	 * ������ �߻��ϴ� ���� �� �� �ִ�.... �� ���� ĸ��ȭ�� �ʿ����� �ƴ��Ѱ�.. �� ���� �����Դϴ�.
	 * 
	 * ### 2. ���꿡 ���� ���.... kor, eng, math�� �̿��ϴ� ������ List Ŭ������ �ϴ� ���� �³�? ����, ����� ����
	 * ������ �׻� ������ ���ִ� ���� �³�? ������ ����ȭ�� ���ؼ��� kor,eng,math�� �̿��ϴ� �ڵ�� Exam ���� �ϴ� ����
	 * �´ٿ�....
	 */

	Exam[] list;
	int current;

	public ExamList() {
		this.list = new Exam[3];
		this.current = 0;
		System.out.println("��ȣ~~~");
	}

	public void input() {

		System.out.println();
		System.out.println("����������������������������������������������������������");
		System.out.println("��          			���� �Է�             		     ��");
		System.out.println("����������������������������������������������������������");
		Scanner scan = new Scanner(System.in);

		int kor, eng, math;
		int current = this.current;
		Exam[] list = this.list;

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

		System.out.println("����������������������������������������������������������");

	}

	public void print() {

		int current = this.current;
		Exam[] list = this.list;

		System.out.println();
		System.out.println("����������������������������������������������������������");
		System.out.println("��          			���� ���             		     ��");
		System.out.println("����������������������������������������������������������");

		for (int i = 0; i < current; i++) {

			Exam exam = list[i];
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();

			int total = exam.total();// kor + eng + math;
			float avg = exam.avg();// total / 3.0f;
			System.out.printf("����%d > ����:%d, ����:%d, ����:%d, ����:%d, ���:%.4f\n", i + 1, kor, eng, math, total, avg);

		}

		System.out.println("����������������������������������������������������������");

	}

}
