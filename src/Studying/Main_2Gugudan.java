package Studying;

import java.util.Scanner;

public class Main_2Gugudan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("구구단 : ");
			n = scan.nextInt();
			
			if(n<1 || 9<n)
				System.out.print("1부터 9까지의 숫자를 넣어주세요");
		}
		while(n<1 || 9<n);
			
		for(int i=0; i<9; i++) {
			
			System.out.printf("%d x %d = %d\n", n, i+1, n*(i+1));
		}

	}

}
