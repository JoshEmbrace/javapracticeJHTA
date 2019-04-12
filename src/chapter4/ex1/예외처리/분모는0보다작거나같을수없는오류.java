package chapter4.ex1.예외처리;

public class 분모는0보다작거나같을수없는오류 extends Exception {

	@Override
	public String getMessage() {
		
		return "분모는 0보다 커야합니다";
	}
	
}
