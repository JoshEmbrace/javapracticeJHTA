package chapter2.ex1.cutting;

import java.util.Random;

public class LottoProgram {

	public static void main(String[] args) {
		
		//로또 프로그램
		//1. 준비물
		//변수 : 번호를 저장할 수 있는 공간
		//입력받는 번호 (사용자로부터 받아야 할 번호 : 6개)
		//int[] lotto.
		Random rand = new Random();
		
		//2.초기화 : 로또 번호를 초기화
		for(int i =0; i<6; i++) {
			int x = rand.nextInt(45)+1;
			
			System.out.printf("%d ", x);
		}
		

		
		
		//4.출력
		
		

	}

}
