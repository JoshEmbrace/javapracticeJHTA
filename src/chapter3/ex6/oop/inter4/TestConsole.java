package chapter3.ex6.oop.inter4;

import chapter3.ex6.oop.inter.PrintListener;

public class TestConsole {

	private PrintListener listener;
	
	public void print() {
		
		System.out.println("1");
		System.out.println("2");
		listener.onPrint();
		System.out.println("3");
		System.out.println("4");
	}
	
	public void setListener(PrintListener pl) {
		
		this.listener = pl;
		
	}
	
}
