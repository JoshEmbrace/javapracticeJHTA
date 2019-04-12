package chapter3.ex6.oop.inter2;

import chapter3.ex6.oop.inter.PrintListener;

public class Program {

	public static void main(String[] args) {
/*
		class AA implements PrintListener{ //구현해야할 것 
			//

			@Override
			public void onPrint() {
				
				System.out.println("안녕");
				
			}
			
		}
*/
		TestConsole console = new TestConsole();
//		console.setListener(new AA());
		console.setListener(new PrintListener() { // 익명클래스
			
			@Override
			public void onPrint() {
				
				System.out.println("안녕");
				
			}
		});
		console.print();
		
	}

}
