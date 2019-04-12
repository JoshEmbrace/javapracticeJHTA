package chapter2.ex1.array;

public class ExcelProgram {
	public static void main(String[] args) {
		
		char[] board = new char[20*10];
		
		for(int y=0; y<10; y++)
			for(int x=0; x<20; x++) {
				board[10*y+x] = 'бр';
					System.out.print(board[10*y+x]);
			}
		
	}
}
