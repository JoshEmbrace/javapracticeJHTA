package chapter2.ex1.array;

public class OmokProgram {

	public static void main(String[] args) {
		
		int[] xs = new int[] {3,3,4,4};
		int[] ys = new int[] {4,5,5,6};
		
		char[] board = new char[200];
		
		for(int i=0; i<200; i++)
			board[i] = '¦«';
		/*
		for(int i=0; i<200; i++) {
			if(i%20==0) {
				System.out.println();	
			}
			else
				System.out.printf("%c", board[i]);
		}
		*/
		for(int y=0; y<10; y++ ) {
			for(int x=0; x<20; x++)
				if(y==0) {
									
					if(x==0)
						System.out.printf("%c", '¦£');
					else if(x==19)
						System.out.printf("%c", '¦¤');
					else	
						System.out.printf("%c", '¦¨');
				}
				else if(y==9) {
					if(x==0)
						System.out.printf("%c", '¦¦');
					else if(x==19)
						System.out.printf("%c", '¦¥');
					else
						System.out.printf("%c", '¦ª');
				}	
				else if(x==0)
					System.out.printf("%c",'¦§');
			
				else if(x==19)
					System.out.printf("%c",'¦©');
				else
					System.out.printf("%c", board[10*y+x]);
			System.out.println();
			
			
		}
		/*
		char[] board = new char[20*10];
		
		for(int y=0; y<10; y++)
			for(int x=0; x<20; x++)
				board[10*y+x] = '¦«';
		*/
		
		
	}

}
