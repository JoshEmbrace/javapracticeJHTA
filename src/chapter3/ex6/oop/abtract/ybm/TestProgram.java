package chapter3.ex6.oop.abtract.ybm;

import chapter3.ex6.oop.abtract.Exam;
import chapter3.ex6.oop.abtract.ExamConsole;

public class TestProgram {

	public static void main(String[] args) {
		
		ExamConsole console = new YBMExamConsole();
		console.input();
		console.print();
		
		//Exam exam = new Exam(); Ʋ�θ� �� �� �ְ� ����. (new�� ��üȭ ����)
		/*
		Exam exam = new YBMExam();
		
		exam.avg();
		exam.total();
		*/

	}

}
