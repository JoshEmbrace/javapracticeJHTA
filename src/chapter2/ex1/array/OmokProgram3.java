package chapter2.ex1.array;

//�ڵ������ �����ϰ� ������ �������α׷�
// �̷� �䱸 ������ �� �����Ҽ��ִ���
// 1. ����ũ�⸦ ���� 10*10���� �Ǿ��ִµ� �̰��� 15*10���� �������ּ���
// 2. ���������� ��Ŀ(��)�� ������ �� �ֵ��� �ڵ带 �������ּ���
// 3. ���带 �̻ڰ� �ٸ��ּ���
// ���ڷ��̼��� ������ ���, ��¿� �迭�� �̿���. -> ��� ���۸� �غ���
// ��ũ������
// 4. ��ǥ �ý����� �����.
// char[] board = new char[WIDTH*HEIGHT];
// (3.2) -> int x=3, y=2
// board[(y-1)*WIDTH+(x-1)] ='��';
// 2�� �迭 ������� ���� �迭 �ٷ��
// char[][] board = new char[HEIGHT][WIDTH]; ǥ���� �Ӹ����� �������� ����� ǥ�� ������� ������ �� �ֵ���
//(3.2) x=3, y=2 board[y][x]='��';
import java.util.Scanner;
//int[] colors = new int[100];

public class OmokProgram3 {

   public static void main(String[] args) {
        // ����� �Է³ִ� �迭
         int[] xs = new int[100];
         int[] ys = new int[100];
         int current = 0;
         final int WIDTH = 15;
         final int HEIGHT = 10;
         Scanner scan = new Scanner(System.in);
         //boolean put;

         // char ������ 2�� �迭�� board�� ����.
         char[][] board = new char[HEIGHT][WIDTH];

         for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
               board[y][x] = '��';
               board[0][0] = '��';
               board[0][x] = '��';
               board[0][WIDTH - 1] = '��';
               board[y][0] = '��';
               board[y][WIDTH - 1] = '��';
               board[HEIGHT - 1][0] = '��';
               board[HEIGHT - 1][x] = '��';
               board[HEIGHT - 1][WIDTH - 1] = '��';
            }
         }
         //out: 
         while (true) {
            // ������ ����ϱ�
            for (int y = 0; y < HEIGHT; y++) {
               for (int x = 0; x < WIDTH; x++) {
                  System.out.printf("%c", board[y][x]);
               }
               System.out.println();
            }
            // ������ �Է¹ޱ�
            System.out.print("(x sp y) > ");
            int x = scan.nextInt();
            int y = scan.nextInt();

            xs[current] = x;
            ys[current] = y;
            /*
            //y�� ����Ȯ��
            int cnt = 0;
            for (int j = 0; j < 4; j++) {
               if (board[j][x] == board[j + 1][x]) {
                  cnt++;

                  if (cnt == 4 && board[j][x] == '��') {
                     System.out.print("��������.\n���ӿ��� �̰���ϴ�.\n");
                     break out;
                  } else if (cnt == 4 && board[j][x] == '��') {
                     System.out.print("��������.\n���ӿ��� �̰���ϴ�.\n");
                     break out;
                  }
               }
            }*/

            // �ߺ��� Ȯ��
            //put = false;
            if (board[y][x] == '��' || board[y][x] == '��') {
               System.out.println("�ٽ� �Է��ϼ���");
               continue;
            } else {
               // ������ �����ǿ� ����
               if (current % 2 == 0)
                  board[y][x] = '��';

               else
                  board[y][x] = '��';

               //put = true;
            }

            current++;
         }
      }
   }