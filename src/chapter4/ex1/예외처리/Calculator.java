package chapter4.ex1.예외처리;


public class Calculator {
	// 업무적인 예외 덧셈의 합이 1000을 넘을 수 없다.
	public static int add(int x, int y) throws 천을넘는오류{

		int result = x + y;
		
		if(result > 1000)
			throw new 천을넘는오류();
		//웹, 윈도우, 콘솔...
		return result;
		
	}

	// 분모는 0이 될 수 없다. 분모는 음수가 될 수 없다.
	public static int div(int x, int y) throws 분모는0보다작거나같을수없는오류 {

		int result = x / y;
		
		if(y<=0)
			throw new 분모는0보다작거나같을수없는오류();

		return result;
		
	}
	
}