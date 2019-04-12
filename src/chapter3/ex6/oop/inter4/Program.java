package chapter3.ex6.oop.inter4;

import chapter3.ex6.oop.inter.PrintListener;

public class Program {

	public static void main(String[] args) {
		
	TestConsole console = new TestConsole();

	PrintListener listener1 = new PrintListener() { //원래대로라면 이런 구성이었지만
		
		@Override
		public void onPrint() {
			System.out.println("나 구현 되었어요");
			
		}
	};
	
	
	PrintListener listener2 = () -> {    							//람다식으로 하게된다면 이렇게된다.
		System.out.println("나 구현 되었어요");
	};
	
	console.setListener(listener2);
	console.print();
	
	}

}
