package chapter3.ex6.oop.inter4;

import chapter3.ex6.oop.inter.PrintListener;

public class Program {

	public static void main(String[] args) {
		
	TestConsole console = new TestConsole();

	PrintListener listener1 = new PrintListener() { //������ζ�� �̷� �����̾�����
		
		@Override
		public void onPrint() {
			System.out.println("�� ���� �Ǿ����");
			
		}
	};
	
	
	PrintListener listener2 = () -> {    							//���ٽ����� �ϰԵȴٸ� �̷��Եȴ�.
		System.out.println("�� ���� �Ǿ����");
	};
	
	console.setListener(listener2);
	console.print();
	
	}

}
