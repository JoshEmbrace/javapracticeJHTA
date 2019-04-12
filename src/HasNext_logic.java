import java.util.Scanner;

public class HasNext_logic {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("data > ");
		
		int x=0;
		int count=0;
		
		do {
			
			x = scan.nextInt();
			
			System.out.println(x);
			
			count++;
			
		}while(scan.hasNext()); 
		
		
		System.out.printf("count is %d", count);
		//ctrl + Z 가 있어야 결과 볼수있음
		scan.close();
	}

}
