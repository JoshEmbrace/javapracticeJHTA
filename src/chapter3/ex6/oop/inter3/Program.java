package chapter3.ex6.oop.inter3;

import chapter3.ex6.oop.inter.PrintListener;

public class Program {

	public static void main(String[] args) {
		
	TestConsole console = new TestConsole();

	console.setListener(new PrintListener() { //�� �������̽��� �������ִ� ��ü�� �������ڸ���
		//�̸��� �ʿ���� ��ɸ� �����Ͽ� ���������ڴ�
		//�̸��� �������� ��ɱ����� ��ü�� ���� ��������
		@Override
		public void onPrint() {
			
			System.out.println("�����ƴ�");
			
		}
	});

	console.print();
	
	}

}
