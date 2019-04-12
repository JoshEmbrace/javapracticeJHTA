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
	protected void onInput(Exam exam, int current) { //Exam exam 자체가 
		
		YBMExam ybmExam = (YBMExam)exam; // 이 exam은 참조는 부모만큼하는데 객체자체는 자식만큼 객체가 생성된것이라
																					//YBMExam형변환이 가능하다
		//ybmExam에 값을 넣으면 exam에 넣는거랑 같음
		Scanner scan = new Scanner(System.in);
		int toeic;
		do {
			System.out.printf("토익%d : ", current + 1);
			toeic = Integer.parseInt(scan.nextLine());

			if (toeic < 0 || 100 < toeic)
				System.out.println("토익성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (toeic < 0 || 100 < toeic);
		
		ybmExam.setToeic(toeic);//입력받은것을세팅
		
	}

	@Override
	protected void onPrint(Exam exam) {
		
		YBMExam ybmExam = (YBMExam)exam;
		System.out.printf("토익:%d,", ybmExam.getToeic());
		
	}
	

}
