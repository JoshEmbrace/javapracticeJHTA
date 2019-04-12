package chapter3.ex6.oop.inter5;

import chapter3.ex6.oop.inter.PrintListener;

public class Program {

	public static void main(String[] args) {
		
	TestConsole console = new TestConsole();
	
/*
	PrintListener listener = new PrintListener() {
		
		@Override
		public void onPrint() {
			
			System.out.println("�� �����Ǿ��ٿ�");
			
		}
	};
*/
	
	PrintListener listener = () ->  {
			
			System.out.println("�� �����Ǿ��ٿ�");
			
	};
	
	console.setListener(listener);
	
	console.print();
	
	}

}
