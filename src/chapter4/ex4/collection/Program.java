package chapter4.ex4.collection;

import chapter3.ex1.capsule.Exam;

public class Program {

	public static void main(String[] args) {
		
		int x = 3;
		Integer z = 7; //auto boxing����.  new Integer(7);
		Exam exam = new Exam();
		String s = "Hello";
		double d = 4.232;
		
		Object[] list = new Object[5];
		
		//list[0] = x; ������ �ȳ����� �̷����ϸ� �ȵ�
		list[0] = new Integer(x); //�⺻���� �ݵ��� Wrapping class Ȥ�� Boxing class�� ��ƾ��Ѵ�.0
		list[1] = exam;
		list[2] = s;
		list[3] = d;
		list[4] = z; 
		
		//int x1 = list[4]; 
		int x1 = (Integer)list[4]; // z; // z.intValue(); <-�̰� unboxing �ϴ°ǵ� 
														    // �̰�쿡�� auto unboxing��
		System.out.println(x1);
		for(int i=0; i<4; i++)
			System.out.println(list[i]);

		

	}

}
