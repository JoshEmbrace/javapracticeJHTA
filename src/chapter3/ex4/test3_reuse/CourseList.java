package chapter3.ex4.test3_reuse;

import java.util.Scanner;

//캡슐화-데이터 구조, 함수 묶은것.
public class CourseList {
	
	private Course[] courses;
	private int current;

	// CourseList 형식의 객체가 생성될 때만 호출될 수 있는 생성자 함수
	public CourseList() {
			this.courses = new Course[10];// 이름만 정의
			this.current = 0;
		}

	public int getCurrent() {
		
		return current;
	}

	public void set(Course course) {
		
		this.courses[current] = course;
		current++;
		
	}

	public Course getList(int i) {

		return courses[i];
		
	}

	public void remove(int i) {
		
		courses[i] = null;
		for (int j = 0; j < current - i - 1; j++)
			courses[i + j] = courses[i + 1 + j];
		current--;
		
	}





	
}