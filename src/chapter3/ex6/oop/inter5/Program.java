package chapter3.ex6.oop.inter5;

import chapter3.ex6.oop.inter.PrintListener;

public class Program {

	public static void main(String[] args) {
		
	TestConsole console = new TestConsole();
	
/*
	PrintListener listener = new PrintListener() {
		
		@Override
		public void onPrint() {
			
			System.out.println("나 구현되었다요");
			
		}
	};
*/
	
	PrintListener listener = () ->  {
			
			System.out.println("나 구현되었다요");
			
	};
	
	console.setListener(listener);
	
	console.print();
	
	}

}
