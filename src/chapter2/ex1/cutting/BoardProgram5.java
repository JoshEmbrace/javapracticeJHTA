package chapter2.ex1.cutting;

import java.util.Scanner;

//코드 수정을 용이하게 수정한 BoardProgram
//이런 요구 사항을 잘 적용할 수 있는지
//1.보드 크기를 현재 10x10으로 되어 있는데 이것을 15x10으로 수정해주세요
//final int WIDTH = 15;
//final int HEIGHT = 10;
//2.아이템으로 폭탄(※)도 포함할 수 있도록 코드를 수정해주세요
//3.보드를 예쁘게 꾸며주세요

//출력에 배열을 이용한다는 말 -> 출력버퍼를 준비한다고해 
//스크린 버퍼 ->
//좌표시스템이 생긴다
public class BoardProgram5 {

	public static void main(String[] args) {
		//문제3. 오목 데이터에 색상을 위한 변수가 추가되었다. 그 변수 배열을 이용하여 흑색, 백색 오목을 두도록 하자.
		final int WIDTH = 15;
		final int HEIGHT = 10;
		
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
		
		
		//char 형식의 2차 배열 board를 생성.
		char[][] board = new char[HEIGHT][WIDTH];    //[행][열]
		
		/*board 배열을 오목판으로 꾸며 주세요. (다음 그림처럼 문자로 배열을 채워주세요);
		┌┬┬┬┬┬┬┬┬┬┬┬┬┬┐
		├┼┼┼┼┼┼┼┼┼┼┼┼┼┤
		├┼┼┼┼┼┼┼┼┼┼┼┼┼┤
		
		1.모든 배열항목에 '┼'문자로 채우기
		board[0][0] = '┼';
		board[0][1] = '┼';
		board[1][0] = '┼';
		
		┼┼
		┼
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int current =0 ;
		int[] xs = new int[100]; //좌표만 저장받는 배열
		int[] ys = new int[100];
		
	
		for(int y=0; y<HEIGHT; y++) {//행 
			for(int x=0; x<WIDTH; x++) {//열
				board[y][x] = '┼';  //바둑판을 화면에 출력하기 위해 배열에 '+' 문자 저장
			}
		}
		
		while(true) {
		//오목판을 출력하기
			for(int i=0; i<HEIGHT; i++) { //행
				for(int j=0; j<WIDTH; j++)  //열
					System.out.printf("%c", board[i][j]);
					
				System.out.println();
			}	
			//오목을 입력받기
			System.out.print("(x sp y)스페이스로 구분해서 입력하시오 > ");
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			xs[current] = x;
			ys[current] = y;
			
			
			board[y][x]='○';
			
			current ++;
			    
			//오목돌을 오목판에 놓기
			
		}
		/*
		├┼┼┼┼┼┼┼┼┼┼┼┼┼┤
		├┼┼┼┼┼┼┼┼┼┼┼┼┼┤
		├┼┼┼┼┼┼┼┼┼┼┼┼┼┤
		2.상단에 있는 내용을 '┬'문자로 대치하기
		*/
			
		
		
	}	

}


