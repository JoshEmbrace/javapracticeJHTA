package chapter4.ex1.예외처리;
//던지는 놈이 아닌 받는 쪽이 처리한다(응용프로그램)
//메세지를 내가 재정의 하는 것.
public class Program {

	public static void main(String[] args)  {
	
		try {
			int x = Calculator.add(1000, 20);
			System.out.println("x: " + x);
			x = Calculator.div(50, -1);
		}
		catch (분모는0보다작거나같을수없는오류 e) {
			//var nums = new int[200000];
			//nums = null;
			System.out.println(e.getMessage());
		}
		catch(Exception e) { //모든 예외처리를 받아줌
			System.out.println(e.getMessage());
			//System.out.println("죄송합니다. 예기치 않은 오류로 불편을 드려서 죄송합니다.");
		} 
		finally {
			System.out.println("죄송합니다. 예기치않은 오류로 불편을 드려서 죄송합니다.");
		}
		
		/*catch(천을넘는오류 e) {
			System.out.println("죄송합니다. 예기치 않은 오류로 불편을 드려서 죄송합니다.");
		} 
		catch (분모는0보다작거나같을수없는오류 e) {
			System.out.println("분모는 0보다 커야한다니까!!!!");
		}*/
		
		System.out.println("종료");

	}

}
