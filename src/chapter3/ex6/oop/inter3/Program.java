package chapter3.ex6.oop.inter3;

import chapter3.ex6.oop.inter.PrintListener;

public class Program {

	public static void main(String[] args) {
		
	TestConsole console = new TestConsole();

	console.setListener(new PrintListener() { //그 인터페이스를 가지고있는 객체를 생성하자마자
		//이름은 필요없고 기능만 구현하여 보내버리겠다
		//이름은 쓰지말고 기능구현한 객체만 만들어서 보내버림
		@Override
		public void onPrint() {
			
			System.out.println("생성됐다");
			
		}
	});

	console.print();
	
	}

}
