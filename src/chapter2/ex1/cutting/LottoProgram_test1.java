package chapter2.ex1.cutting;

import java.util.Random;
import java.util.Scanner;


public class LottoProgram_test1 {
	
    static Random rand = new Random();
    static int[] lotto = new int[6];
    
    
	public static void main(String[] args) {
		
		// 1�� ���� : �ζ� �迭�� ���� ���ڸ� ä���. //(��, �ߺ�üũ �� ��)
        //1���Լ���();
        fillNumber();
        		

        // 2�� ���� : �ζ� �迭�� ���.(��, ��°���� ��: 34, 22, 5, 12, 34, 11) 
        //2���Լ���();
        printLottoarray();
       
 
        // 3�� ���� : �迭���� [0] ��° ���ڿ� [5] ��° ���ڸ� ��ȯ�ϱ�
        //3���Լ���();
        changeNumber();
        
        // 4�� ���� : �ζ� �迭�� ���.(��, ��°���� ��: 11, 22, 5, 12, 34, 34) 
        //2���Լ���();
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
