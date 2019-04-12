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
		
		Thread th = new Thread(new Program()); //(? 너 다른 흐름에서 실행될 함수); 
														//여기서 함수를 바로 호출하지 못하므로 인터페이스를 구현해서 넣어준다.
		//download();
		th.start();

		System.out.println("종료");
		
	}

	@Override
	public void run() { //새로운 서브 프로세스의 main함수로	생각하면 됨.	
									// 보조 프로세스의 main함수 -> 스레드 진입 함수
		download();
		
	}

}
