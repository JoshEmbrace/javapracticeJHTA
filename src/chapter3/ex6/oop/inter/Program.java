package chapter3.ex6.oop.inter;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		class AA implements PrintListener {

			@Override
			public void onPrint() {
				System.out.println("구현완료!!!");
			}

		}

		TestConsole console = new TestConsole();
		console.setListener(new AA());
		console.print();

	}

}