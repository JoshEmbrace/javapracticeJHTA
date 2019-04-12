package chapter3.ex6.oop.abtract;

import java.util.Scanner;
/*
 * 이번에 달라지는 코드는 사용자 UI와 성적을 관리하는 코드를
 * 분리함으로써 코드의 재사용율을 높이는 캡슐 분리를 할 예정입니다.
 * 
 * 현재 클래스는 ExamList로써 성적을 관리하는 클래스이며 
 * 이중에 포함되어 있는 UI 관련 코드를 분리할 예정입니다.
 * 
 * 분리되는 코드의 파일명은 ExamConsole.java 입니다.
 * 
 */
public class ExamList {
	/*
	 * 객체의 결합 관계 객체가 객체를 가지는 상속 일명 마인부우 상속 ------------------------- 우리가 ExamList를
	 * 캡슐화라는 것을 했다. 왜 했지? 어떤 장점이 있길래 "캡슐화"를 했지?
	 * 
	 * ->데이터구조를 사용하는 함수들을 묶어 놓은 것이 캡슐 ->데이터구조의 변경에 영향을 받는 함수들을 묶어 놓은 것이 캡슐 ->캡슐화의
	 * 장점은 외부에서의 변화로 함수가 영향을 받지 않게 하기 위한 캐슬?을 만드는 것 ->따라서, 은닉화는 캡슐을 완성시키는 가장 중요한 방법
	 * 또는 도구라고 할 수 있뜨아~~
	 * 
	 * 오늘의 내용은...
	 * 
	 * ### 1. 분명히 캡슐화를 했는데....#### Exam 클래스에서 kor 변수를 변경하면 그 클래스 밖에 있는 ExamList 파일에서
	 * 오류가 발생하는 것을 볼 수 있다.... 이 또한 캡슐화가 필요하지 아니한가.. 에 대한 내용입니다.
	 * 
	 * ### 2. 연산에 대한 고민.... kor, eng, math를 이용하는 연산을 List 클래스에 하는 것이 맞나? 총점, 평균을 구할
	 * 때마다 항상 연산을 해주는 것이 맞나? 연산의 집중화를 위해서라도 kor,eng,math를 이용하는 코드는 Exam 에서 하는 것이
	 * 맞다요....
	 */

	private Exam[] list;
	private int current;

	public ExamList() {
		list = new Exam[3];
		current = 0;
		System.out.println("얏호~~~");
	}

	public int getCurrent() {
		
		return current;
		
	}

	public void add(Exam exam) {
		
		list[current] = exam;
		current++;
		
	}

	public int size() {
		
		return current;
		
	}

	public Exam get(int i) {
		
		return list[i];
		
	}



}
