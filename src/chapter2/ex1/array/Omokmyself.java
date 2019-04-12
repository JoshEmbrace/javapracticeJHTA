package chapter2.ex1.array;

import java.util.Scanner;

public class Omokmyself {

	public static void main(String[] args) {
		
		final int HEIGHT = 10; //보드 y축크기
		final int WIDTH = 15; //보드 x축크기
				
		char[][] board = new char[HEIGHT][WIDTH]; // 보드배열 ys
		int[] xs = new int[100]; //입력받은 x좌표모음 배열 
		int[] ys = new int[100]; //입력받은 y좌표모음 배열
		int current = 0; //현재 몇번째 입력인지 구분
		Scanner scan = new Scanner(System.in);
		
		//보드배열에 도형채우기
		for(int y=0; y<HEIGHT; y++) {
			for(int x=0; x<WIDTH; x++) {
				board[y][x] = '┼';
				board[0][x] = '┬';
				board[HEIGHT-1][x] = '┴';
				board[y][0] = '├';
				board[y][WIDTH-1] = '┤';
				board[0][0] = '┌';
				board[HEIGHT-1][0] = '└';
				board[0][WIDTH-1] = '┐';
				board[HEIGHT-1][WIDTH-1]='┘';
			}
		}

		
		while(true) {
			
			//보드출력하기
			for(int y=0; y<HEIGHT; y++) {
				for(int x=0; x<WIDTH; x++) {
					System.out.printf("%c",board[y][x]);
				}
				System.out.println();
			}
			
			boolean put = true;
			while(put){
				System.out.print("(X sp Y) >_");
				//현재좌표 받아오기
				int x = scan.nextInt();
				int y = scan.nextInt();
				
				xs[current] = x;
				ys[current] = y;

				
				for(int i=0; i<current; i++) {
					if(x==xs[i]&&y==ys[i]) {
						System.out.print("중복값입니다. 다시입력해주세요.");
					}
					else {
						if(current%2 == 0) {
							board[y][x]='○';
							put = false;
						}
						else {
							board[y][x]='●';
							put = false;
						}
					}
				}
			}
			current ++;
		}
			
	}

}
