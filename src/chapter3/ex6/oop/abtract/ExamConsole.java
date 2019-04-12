package chapter3.ex6.oop.abtract;

import java.util.Scanner;

public abstract class ExamConsole { //�߻�ȭ�Ͽ� ������ �ȵǰ� ������ �� �ְ�

	private ExamList list;
	Exam exam = newExam(); //�ڽĿ��� ������ ��Ź�ϱ� ���� ���ο� �޼ҵ� ���������
	//������ �θ�ŭ�ϴµ� ��ü��ü�� �ڽĸ�ŭ ��ü�� ������
	
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
