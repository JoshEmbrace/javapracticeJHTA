package chapter3.ex6.oop.abtract.ybm;

import java.util.Scanner;

import chapter3.ex6.oop.abtract.Exam;
import chapter3.ex6.oop.abtract.ExamConsole;

public class YBMExamConsole extends ExamConsole{
	
	protected Exam newExam() {
		
		Exam exam = new YBMExam();
		return exam;
		
	}

	@Override
	protected void onInput(Exam exam, int current) { //Exam exam ��ü�� 
		
		YBMExam ybmExam = (YBMExam)exam; // �� exam�� ������ �θ�ŭ�ϴµ� ��ü��ü�� �ڽĸ�ŭ ��ü�� �����Ȱ��̶�
																					//YBMExam����ȯ�� �����ϴ�
		//ybmExam�� ���� ������ exam�� �ִ°Ŷ� ����
		Scanner scan = new Scanner(System.in);
		int toeic;
		do {
			System.out.printf("����%d : ", current + 1);
			toeic = Integer.parseInt(scan.nextLine());

			if (toeic < 0 || 100 < toeic)
				System.out.println("���ͼ����� 0~100������ ������ �Է��� �����մϴ�.");

		} while (toeic < 0 || 100 < toeic);
		
		ybmExam.setToeic(toeic);//�Է¹�����������
		
	}

	@Override
	protected void onPrint(Exam exam) {
		
		YBMExam ybmExam = (YBMExam)exam;
		System.out.printf("����:%d,", ybmExam.getToeic());
		
	}
	

}
