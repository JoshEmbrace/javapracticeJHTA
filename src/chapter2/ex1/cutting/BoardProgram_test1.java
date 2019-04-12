package chapter2.ex1.cutting;

public class BoardProgram_test1 {
	
	static int WIDTH = 20;
    static int HEIGHT = 10;
    static char[][] board = new char[HEIGHT][WIDTH];
    static int[] xs = new int[WIDTH*HEIGHT];
	
	public static void main(String[] args) {
		

        // 이차원 배열 board 배열에 격자형의 바둑판 문양의 문자를 채우시오. (단. 바둑판 모양은 다음과 같아야 한다.)
        fillBoard();
        /*
        ┌┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┐
        ├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤
        ├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤
        */

        // board 배열을 화면에 격자형으로 출력하시오.
        printBoard();

        // board에 (3,4) 위치에 '●' 문자를 두시오.
        putBstone();

        // board 배열을 화면에 격자형으로 출력하시오.
        printBoard();

    }

    private static void fillBoard(){
    	for(int y=0;y<10;y++) {
    		for(int x=0;x<20;x++){
    				board[y][x]= '╋';
    				board[0][x]= '┳';
					board[y][0]= '┣';
					board[y][WIDTH-1]= '┫';
					board[HEIGHT-1][x]= '┻';	
					board[0][0]= '┏';
					board[0][WIDTH-1]= '┓';
					board[HEIGHT-1][0]= '┗';
					board[HEIGHT-1][WIDTH-1]= '┛';	
					
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
        	board[3][4] = '●';
        }

	}
    

}
