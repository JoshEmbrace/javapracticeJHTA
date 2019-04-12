package chapter3.ex6.oop.inter;

public class TestConsole {

	private PrintListener listener;

	public void print() {

		System.out.println("1");
		System.out.println("2");

		listener.onPrint();

		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
	}

	public void setListener(PrintListener pl) {

		this.listener = pl;

	}

}
