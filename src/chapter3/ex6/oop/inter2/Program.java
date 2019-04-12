package chapter3.ex6.oop.inter2;

import chapter3.ex6.oop.inter.PrintListener;

public class Program {

	public static void main(String[] args) {
/*
		class AA implements PrintListener{ //�����ؾ��� �� 
			//

			@Override
			public void onPrint() {
				
				System.out.println("�ȳ�");
				
			}
			
		}
*/
		TestConsole console = new TestConsole();
//		console.setListener(new AA());
		console.setListener(new PrintListener() { // �͸�Ŭ����
			
			@Override
			public void onPrint() {
				
				System.out.println("�ȳ�");
				
			}
		});
		console.print();
		
	}

}
