package chapter2.ex1.cutting;

import java.util.Scanner;

// 코드 수정을 용이하게 수정한 BoardProgram
// 이런 요구 사항을 잘 적용할 수 있는지
// 1. 보드 크기를 현재 10x10으로 되어 있는데 이것을 15x10으로 수정해주세요.
/*
final int WIDTH = 15;
final int HEIGHT = 10;
*/
// 2. 아이템으로 조커(※)도 포함할 수 있도록 코드를 수정해주세요.
// 3. 보드를 이쁘게(예쁘게) 꾸며주세요.
/*
 Decoration이 가능한 방법으로 가야할것  같드아...
 출력에 배열을 이용한다는 말... => 출력 버퍼를 준비한다고 해....
 스크린 버퍼 =>
 // 4. 좌표 시스템이 생긴다.
 */
/*		   
 // 1차 배열 방식으로 격자 배열 다루기
 char[] board = new char[WIDTH*HEIGHT];
 (3,2) 
 int x = 3, y = 2;
 board[(y-1)*WIDTH+(x-1)] = '●';

 ┌┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┐├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤
 
 // 2차 배열 방식으로 격자 배열 다루기
 char[][] board = new char[HEIGHT][WIDTH]; // 표현이 머릿속의 격자형과 비슷한 표현 방법으로 구현할 수 있도록
  (3,2) 
 int x = 3, y = 2;
 board[y][x] = '●';
 
┌┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┐
├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤
├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤		
 */



public class BoardProgram_cutting {
	
	static final int WIDTH = 15;
	static final int HEIGHT = 10;
	
	static int[] xs = new int[100];
	static int[] ys = new int[100];
	static int current = 0;
	
	
	//char 형식의 2차 배열 board를 생성.
	static char[][] board = new char[HEIGHT][WIDTH];
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		//board 배열을 오목판으로 꾸며주세요. (다음 그림처럼 문자로 배열을 채워주세요);
		/*
		┌┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┐
		├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤
		├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤		
		*/
		//1. 모든 배열항목에 '┼'문자로 채우기
		board[0][0] = '┼';	
		board[0][1] = '┼';
		board[1][0] = '┼';
		/*		
		┼┼
		┼
		
		 */		
		
		initBoard();	
		
		printBoard();
		
		while(true) {
			// 오목판을 출력하기
			printBoard();
		
			
			// 오목을 입력받기
			inputOmok();
			
		}
		
		
		/*		
		┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
		┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
		┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
		 */
		// 2. 상단에 있는 내용을 ┬ 문자로 대치하기
		/*		
		┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬
		┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
		┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
		 */
		
		
		/*
		
		// 문제 3. 오목 데이터에 색상을 위한 변수가 추가되었다. 그 변수 배열을 이용하여 흑색, 백색 오목을 두도록 하자.
		int[] colors = new int[100];	
		// 힌트 : 흰돌과 검은돌은 colors 상태에 따라서 배타적으로 출력해야 한다.
				
		// 문제 2. 다음 오목 데이터를 오목판에 출력하는 코드를 작성하시오.
		int[] xs = new int[100];
		int[] ys = new int[100];
		
		int current = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			for(int y=1; y<=HEIGHT;y++)
			{
				for(int x=1; x<=WIDTH; x++) {
					
					boolean found = false;
					// 오목배열(xs, ys)에서 현재 x,y 위치에 출력할 오목이 있다면
					// 오목 배열의 항목이 여러개이므로 반복적으로 조사하는 흐름이 필요하다.
					for(int i=0; i<4; i++)
						if(x==xs[i] && y==ys[i]) {//현재 위치에 둘 오목이 발견되었다면
							if(colors[i] == 0)
								System.out.printf("%c", '●');// 현재 위치에 오목을 출력하고
							else
								System.out.printf("%c", '○');// 현재 위치에 오목을 출력하고
							
							found = true;
							break;
						}
					
					if(found != true)// 그렇지 않다면
						if(x==1 && y==1)
							System.out.printf("%c", '┌');
						
						else if(x==WIDTH && y==1)
							System.out.printf("%c", '┐');
						else if(x==1 && y==HEIGHT)
							System.out.printf("%c", '└');
						else if(x==WIDTH && y==HEIGHT)
							System.out.printf("%c", '┘');
						else if(y==1)
							System.out.printf("%c", '┬');
						else if(y==HEIGHT)
							System.out.printf("%c", '┴');
						else if(x==1)
							System.out.printf("%c", '├');
						else if(x==WIDTH)
							System.out.printf("%c", '┤');
						else
							System.out.printf("%c", '┼');
				}			
				System.out.println();
			}
			
			System.out.print("(x sp y) > ");
			xs[current] = scan.nextInt();
			ys[current] = scan.nextInt();
			colors[current] = current%2;
			
			current++;
			
		}while(current < 100);
		
		*/
				
		
		
		
		// 문제 1. 절차로 오목판을 출력하시오.
		/*
		for(int y=1; y<=10;y++)
		{
			for(int x=1; x<=10; x++) {
				
				if(x==1 && y==1)
					System.out.printf("%c", '┌');
				else if(x==10 && y==1)
					System.out.printf("%c", '┐');
				else if(x==1 && y==10)
					System.out.printf("%c", '└');
				else if(x==10 && y==10)
					System.out.printf("%c", '┘');
				else if(y==1)
					System.out.printf("%c", '┬');
				else if(y==10)
					System.out.printf("%c", '┴');
				else if(x==1)
					System.out.printf("%c", '├');
				else if(x==10)
					System.out.printf("%c", '┤');
				else
					System.out.printf("%c", '┼');
			}			
			System.out.println();
		}*/

	}

	private static void inputOmok() {
		System.out.print("(x sp y) > ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		xs[current] = x;
		ys[current] = y;
		current++;
					
		// 오목돌을 오목판에 놓기			
		// 마지막 새로운 돌만 놓기
		board[y][x] = '○';
	}

	private static void printBoard() {
		for(int y=0; y<HEIGHT; y++) {
			for(int x=0; x<WIDTH; x++)
				System.out.printf("%c", board[y][x]);
			
			System.out.println();
		}
	}
	

	private static void initBoard() {
		
		for(int y=0; y<HEIGHT; y++)
			for(int x=0; x<WIDTH; x++)
				board[y][x] =  '┼';
	}

}
