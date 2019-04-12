package chapter4.ex4.collection;

import chapter3.ex1.capsule.Exam;

public class Program {

	public static void main(String[] args) {
		
		int x = 3;
		Integer z = 7; //auto boxing해줌.  new Integer(7);
		Exam exam = new Exam();
		String s = "Hello";
		double d = 4.232;
		
		Object[] list = new Object[5];
		
		//list[0] = x; 오류는 안나지만 이렇게하면 안됨
		list[0] = new Integer(x); //기본형은 반듯이 Wrapping class 혹은 Boxing class에 담아야한다.0
		list[1] = exam;
		list[2] = s;
		list[3] = d;
		list[4] = z; 
		
		//int x1 = list[4]; 
		int x1 = (Integer)list[4]; // z; // z.intValue(); <-이게 unboxing 하는건데 
														    // 이경우에서 auto unboxing됨
		System.out.println(x1);
		for(int i=0; i<4; i++)
			System.out.println(list[i]);

		

	}

}
