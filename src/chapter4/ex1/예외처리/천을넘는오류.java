package chapter4.ex1.예외처리;

public class 천을넘는오류 extends Exception {

	@Override
	public String getMessage() {

		return "천을 넘는 오류";
	}
	
}
