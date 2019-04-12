package chapter2.ex1.cutting;

import java.util.Random;
import java.util.Scanner;


public class LottoProgram_test1 {
	
    static Random rand = new Random();
    static int[] lotto = new int[6];
    
    
	public static void main(String[] args) {
		
		// 1번 문제 : 로또 배열에 랜덤 숫자를 채우기. //(단, 중복체크 할 것)
        //1번함수명();
        fillNumber();
        		

        // 2번 문제 : 로또 배열을 출력.(단, 출력결과의 예: 34, 22, 5, 12, 34, 11) 
        //2번함수명();
        printLottoarray();
       
 
        // 3번 문제 : 배열에서 [0] 번째 숫자와 [5] 번째 숫자를 교환하기
        //3번함수명();
        changeNumber();
        
        // 4번 문제 : 로또 배열을 출력.(단, 출력결과의 예: 11, 22, 5, 12, 34, 34) 
        //2번함수명();
        printLottoarray();

	}
	
	private static void fillNumber(){
    	for(int i=0; i<6; i++)
    		lotto[i]=rand.nextInt(45)+1;
    		
    }

    private static void  printLottoarray(){
    	for(int i=0; i<6; i++) {
    		System.out.printf("%d, ",lotto[i]);
    		if(i==5)
    			System.out.printf("%d",lotto[i]);
    	}
    }

    private static void changeNumber(){
    	int a;
    	a=lotto[0];
    	lotto[0]=lotto[5];
    	lotto[5]=a;
    }
	
}
