package Studying;

import java.util.Scanner;

public class Main_3PrintStar2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("별 가지고싶니?(1줄부터100줄까지가능) : ");
			n = scan.nextInt();
			
			if(n<1 || 100<n)
				System.out.print("1부터 100까지의 숫자를 넣어주세요");
		}
		while(n<1 || 100<n);
			
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<i+1; j++)
				System.out.print("*");
			System.out.println();
			
		}
		
		scan.close();

	}

}
