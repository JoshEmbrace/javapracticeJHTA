package chapter3.ex6.oop.abtract.ybm;

import chapter3.ex6.oop.abtract.Exam;
import chapter3.ex6.oop.abtract.ExamConsole;

public class TestProgram {

	public static void main(String[] args) {
		
		ExamConsole console = new YBMExamConsole();
		console.input();
		console.print();
		
		//Exam exam = new Exam(); 틀로만 쓸 수 있게 만듦. (new로 객체화 못함)
		/*
		Exam exam = new YBMExam();
		
		exam.avg();
		exam.total();
		*/

	}

}
