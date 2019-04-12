package chapter4.ex4.collection;

import java.util.Scanner;

public class ObjectList { // ������ �迭, ���� �迭

	private int capacity;
	private Object[] list;
	private int current;
	private int amount; //�߰� ������

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
		list[current++] = object; // ���� list[++current] = object; ���
									// Ŀ��Ʈ�� 1������Ű�� ������Ʈ�� �־��شٴ°�
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
