import java.util.Scanner;

public class HasNext {

	public static void main(String[] args) {
		
		int x=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("data > ");
		
//		while(scan.hasNext()) {
//			x = scan.nextInt();
//			System.out.println(x);	
//		}
		
		
		do {
			x = scan.nextInt();
			System.out.println(x);	
		}
		while(scan.hasNext());
		

		scan.close();
	}

}
