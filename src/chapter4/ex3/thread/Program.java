package chapter4.ex3.thread;

public class Program implements Runnable {

	public static void download() {
		
		for(int i=0; i<10; i++) {
			System.out.printf("print: %d%%\n", i+1);
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.printf("main: %d\n", i+1);
		}
		
		Thread th = new Thread(new Program()); //(? �� �ٸ� �帧���� ����� �Լ�); 
														//���⼭ �Լ��� �ٷ� ȣ������ ���ϹǷ� �������̽��� �����ؼ� �־��ش�.
		//download();
		th.start();

		System.out.println("����");
		
	}

	@Override
	public void run() { //���ο� ���� ���μ����� main�Լ���	�����ϸ� ��.	
									// ���� ���μ����� main�Լ� -> ������ ���� �Լ�
		download();
		
	}

}
