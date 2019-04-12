package chapter2.ex1.array;

//코드수정을 용이하게 수정한 보드프로그램
// 이런 요구 사항을 잘 적용할수있는지
// 1. 보드크기를 현재 10*10으로 되어있는데 이걸을 15*10으로 수정해주세요
// 2. 아이템으로 조커(※)도 포함할 수 있도록 코드를 수정해주세요
// 3. 보드를 이쁘게 꾸며주세요
// 데코레이션이 가능한 방법, 출력에 배열을 이용함. -> 출력 버퍼를 준비함
// 스크림버퍼
// 4. 좌표 시스템이 생긴다.
// char[] board = new char[WIDTH*HEIGHT];
// (3.2) -> int x=3, y=2
// board[(y-1)*WIDTH+(x-1)] ='●';
// 2차 배열 방식으로 격자 배열 다루기
// char[][] board = new char[HEIGHT][WIDTH]; 표현이 머릿속의 격자형과 비슷한 표현 방법으로 구현할 수 있도록
//(3.2) x=3, y=2 board[y][x]='●';
import java.util.Scanner;
//int[] colors = new int[100];

public class OmokProgram3 {

   public static void main(String[] args) {
        // 사용자 입력넣는 배열
         int[] xs = new int[100];
         int[] ys = new int[100];
         int current = 0;
         final int WIDTH = 15;
         final int HEIGHT = 10;
         Scanner scan = new Scanner(System.in);
         //boolean put;

         // char 형식의 2차 배열을 board를 생성.
         char[][] board = new char[HEIGHT][WIDTH];

         for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
               board[y][x] = '┼';
               board[0][0] = '┌';
               board[0][x] = '┬';
               board[0][WIDTH - 1] = '┐';
               board[y][0] = '├';
               board[y][WIDTH - 1] = '┤';
               board[HEIGHT - 1][0] = '└';
               board[HEIGHT - 1][x] = '┴';
               board[HEIGHT - 1][WIDTH - 1] = '┘';
            }
         }
         //out: 
         while (true) {
            // 오목판 출력하기
            for (int y = 0; y < HEIGHT; y++) {
               for (int x = 0; x < WIDTH; x++) {
                  System.out.printf("%c", board[y][x]);
               }
               System.out.println();
            }
            // 오목을 입력받기
            System.out.print("(x sp y) > ");
            int x = scan.nextInt();
            int y = scan.nextInt();

            xs[current] = x;
            ys[current] = y;
            /*
            //y축 승패확인
            int cnt = 0;
            for (int j = 0; j < 4; j++) {
               if (board[j][x] == board[j + 1][x]) {
                  cnt++;

                  if (cnt == 4 && board[j][x] == '●') {
                     System.out.print("게임종료.\n게임에서 이겻습니다.\n");
                     break out;
                  } else if (cnt == 4 && board[j][x] == '○') {
                     System.out.print("게임종료.\n게임에서 이겻습니다.\n");
                     break out;
                  }
               }
            }*/

            // 중복값 확인
            //put = false;
            if (board[y][x] == '○' || board[y][x] == '●') {
               System.out.println("다시 입력하세요");
               continue;
            } else {
               // 오목돌을 오목판에 놓기
               if (current % 2 == 0)
                  board[y][x] = '●';

               else
                  board[y][x] = '○';

               //put = true;
            }

            current++;
         }
      }
   }