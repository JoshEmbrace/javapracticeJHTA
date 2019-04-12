package chapter4.ex4.collection;

import java.util.Scanner;

public class ObjectList { // 가변적 배열, 동적 배열

	private int capacity;
	private Object[] list;
	private int current;
	private int amount; //추가 증가량

	public ObjectList() {
		capacity = 3;
		current = 0;
		amount = 5;
		list = new Object[capacity];
	}

	public void add(Object object) {

		if (capacity == current) {
			Object[] temp = new Object[capacity + amount];
			for (int i = 0; i < current; i++) {
				temp[i] = list[i];
			}
			list = temp;
			capacity += amount;
		}

		/*
		 * list[current] = object; current++;
		 */
		list[current++] = object; // 만약 list[++current] = object; 라면
									// 커런트를 1증가시키고 오브젝트를 넣어준다는것
	}

	public int size() {

		return current;

	}

	public Object get(int i) {

		return list[i];

	}

	public int getCurrent() {

		return current;

	}

	public Object getCapacity() {

		return capacity;
	}

}
