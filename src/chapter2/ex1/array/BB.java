package chapter2.ex1.array;

public class BB {

	public static void main(String[] args) {
		
//		for( int n=1; n<=5; n++ ) {
//			System.out.printf("%d", 1+(n-1)*5);
//			System.out.println();
			
		final int SIZE = 5;
		
		
		for( int i=0; i<SIZE; i++ ) {
			
			if(i==SIZE-1)
				System.out.printf("%c", 65+i);
			else if(i%2==0)
				System.out.printf("%c,", 65+i);
			else
				System.out.printf(" ,");
		
		}
		
	}

}
