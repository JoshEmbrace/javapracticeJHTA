package chapter3.ex4.test3_reuse;

import java.util.Scanner;

//ĸ��ȭ-������ ����, �Լ� ������.
public class CourseList {
	
	private Course[] courses;
	private int current;

	// CourseList ������ ��ü�� ������ ���� ȣ��� �� �ִ� ������ �Լ�
	public CourseList() {
			this.courses = new Course[10];// �̸��� ����
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