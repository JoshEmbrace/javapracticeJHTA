package chapter2.ex1.cutting;

public class BoardProgram_test1 {
	
	static int WIDTH = 20;
    static int HEIGHT = 10;
    static char[][] board = new char[HEIGHT][WIDTH];
    static int[] xs = new int[WIDTH*HEIGHT];
	
	public static void main(String[] args) {
		

        // ������ �迭 board �迭�� �������� �ٵ��� ������ ���ڸ� ä��ÿ�. (��. �ٵ��� ����� ������ ���ƾ� �Ѵ�.)
        fillBoard();
        /*
        ��������������������������������������������
        ��������������������������������������������
        ��������������������������������������������
        */

        // board �迭�� ȭ�鿡 ���������� ����Ͻÿ�.
        printBoard();

        // board�� (3,4) ��ġ�� '��' ���ڸ� �νÿ�.
        putBstone();

        // board �迭�� ȭ�鿡 ���������� ����Ͻÿ�.
        printBoard();

    }

    private static void fillBoard(){
    	for(int y=0;y<10;y++) {
    		for(int x=0;x<20;x++){
    				board[y][x]= '��';
    				board[0][x]= '��';
					board[y][0]= '��';
					board[y][WIDTH-1]= '��';
					board[HEIGHT-1][x]= '��';	
					board[0][0]= '��';
					board[0][WIDTH-1]= '��';
					board[HEIGHT-1][0]= '��';
					board[HEIGHT-1][WIDTH-1]= '��';	
					
    		}
    	}
    	
    	private static void printBoard(){
        	for(int y=0;y<10;y++) {
        		for(int x=0;x<20;x++){
        		System.out.printf("%c",board[x][y]);
        		}
        	}
        }

        private static void putBstone(){
        	board[3][4] = '��';
        }

	}
    

}
