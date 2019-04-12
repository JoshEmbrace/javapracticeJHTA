package Studying;

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.print("100,000보다 작거나 같은 자연수 N을 입력하시오 : ");
		n = scan.nextInt();
		
		
		for(int i=0; i<n; i++) {
			
			System.out.println(i+1);
		}

	}

}
