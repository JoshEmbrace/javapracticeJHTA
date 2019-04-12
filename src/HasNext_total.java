import java.util.Scanner;

public class HasNext_total {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("data > ");
		
		int x=0;
		int count=0;
		int total=0;
		
		do {
			
			x = scan.nextInt();
			
			System.out.println(x);
			
			count++;
			
			total = total + x;
			
		} while(scan.hasNext()); 
		
		
		System.out.printf("count is %d\n", count);
		//ctrl + Z 가 있어야 결과 볼수있음
		System.out.printf("total is %d\n", total);
		
		scan.close();
	}

}
