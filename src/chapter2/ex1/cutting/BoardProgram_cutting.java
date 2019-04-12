package chapter2.ex1.cutting;

import java.util.Scanner;

// �ڵ� ������ �����ϰ� ������ BoardProgram
// �̷� �䱸 ������ �� ������ �� �ִ���
// 1. ���� ũ�⸦ ���� 10x10���� �Ǿ� �ִµ� �̰��� 15x10���� �������ּ���.
/*
final int WIDTH = 15;
final int HEIGHT = 10;
*/
// 2. ���������� ��Ŀ(��)�� ������ �� �ֵ��� �ڵ带 �������ּ���.
// 3. ���带 �̻ڰ�(���ڰ�) �ٸ��ּ���.
/*
 Decoration�� ������ ������� �����Ұ�  �����...
 ��¿� �迭�� �̿��Ѵٴ� ��... => ��� ���۸� �غ��Ѵٰ� ��....
 ��ũ�� ���� =>
 // 4. ��ǥ �ý����� �����.
 */
/*		   
 // 1�� �迭 ������� ���� �迭 �ٷ��
 char[] board = new char[WIDTH*HEIGHT];
 (3,2) 
 int x = 3, y = 2;
 board[(y-1)*WIDTH+(x-1)] = '��';

 ������������������������������������������������������������������������������������������������������������������������������������
 
 // 2�� �迭 ������� ���� �迭 �ٷ��
 char[][] board = new char[HEIGHT][WIDTH]; // ǥ���� �Ӹ����� �������� ����� ǥ�� ������� ������ �� �ֵ���
  (3,2) 
 int x = 3, y = 2;
 board[y][x] = '��';
 
��������������������������������������������
��������������������������������������������
��������������������������������������������		
 */



public class BoardProgram_cutting {
	
	static final int WIDTH = 15;
	static final int HEIGHT = 10;
	
	static int[] xs = new int[100];
	static int[] ys = new int[100];
	static int current = 0;
	
	
	//char ������ 2�� �迭 board�� ����.
	static char[][] board = new char[HEIGHT][WIDTH];
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		//board �迭�� ���������� �ٸ��ּ���. (���� �׸�ó�� ���ڷ� �迭�� ä���ּ���);
		/*
		��������������������������������������������
		��������������������������������������������
		��������������������������������������������		
		*/
		//1. ��� �迭�׸� '��'���ڷ� ä���
		board[0][0] = '��';	
		board[0][1] = '��';
		board[1][0] = '��';
		/*		
		����
		��
		
		 */		
		
		initBoard();	
		
		printBoard();
		
		while(true) {
			// �������� ����ϱ�
			printBoard();
		
			
			// ������ �Է¹ޱ�
			inputOmok();
			
		}
		
		
		/*		
		��������������������������������������������
		��������������������������������������������
		��������������������������������������������
		 */
		// 2. ��ܿ� �ִ� ������ �� ���ڷ� ��ġ�ϱ�
		/*		
		��������������������������������������������
		��������������������������������������������
		��������������������������������������������
		 */
		
		
		/*
		
		// ���� 3. ���� �����Ϳ� ������ ���� ������ �߰��Ǿ���. �� ���� �迭�� �̿��Ͽ� ���, ��� ������ �ε��� ����.
		int[] colors = new int[100];	
		// ��Ʈ : �򵹰� �������� colors ���¿� ���� ��Ÿ������ ����ؾ� �Ѵ�.
				
		// ���� 2. ���� ���� �����͸� �����ǿ� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		int[] xs = new int[100];
		int[] ys = new int[100];
		
		int current = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			for(int y=1; y<=HEIGHT;y++)
			{
				for(int x=1; x<=WIDTH; x++) {
					
					boolean found = false;
					// ����迭(xs, ys)���� ���� x,y ��ġ�� ����� ������ �ִٸ�
					// ���� �迭�� �׸��� �������̹Ƿ� �ݺ������� �����ϴ� �帧�� �ʿ��ϴ�.
					for(int i=0; i<4; i++)
						if(x==xs[i] && y==ys[i]) {//���� ��ġ�� �� ������ �߰ߵǾ��ٸ�
							if(colors[i] == 0)
								System.out.printf("%c", '��');// ���� ��ġ�� ������ ����ϰ�
							else
								System.out.printf("%c", '��');// ���� ��ġ�� ������ ����ϰ�
							
							found = true;
							break;
						}
					
					if(found != true)// �׷��� �ʴٸ�
						if(x==1 && y==1)
							System.out.printf("%c", '��');
						
						else if(x==WIDTH && y==1)
							System.out.printf("%c", '��');
						else if(x==1 && y==HEIGHT)
							System.out.printf("%c", '��');
						else if(x==WIDTH && y==HEIGHT)
							System.out.printf("%c", '��');
						else if(y==1)
							System.out.printf("%c", '��');
						else if(y==HEIGHT)
							System.out.printf("%c", '��');
						else if(x==1)
							System.out.printf("%c", '��');
						else if(x==WIDTH)
							System.out.printf("%c", '��');
						else
							System.out.printf("%c", '��');
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
				
		
		
		
		// ���� 1. ������ �������� ����Ͻÿ�.
		/*
		for(int y=1; y<=10;y++)
		{
			for(int x=1; x<=10; x++) {
				
				if(x==1 && y==1)
					System.out.printf("%c", '��');
				else if(x==10 && y==1)
					System.out.printf("%c", '��');
				else if(x==1 && y==10)
					System.out.printf("%c", '��');
				else if(x==10 && y==10)
					System.out.printf("%c", '��');
				else if(y==1)
					System.out.printf("%c", '��');
				else if(y==10)
					System.out.printf("%c", '��');
				else if(x==1)
					System.out.printf("%c", '��');
				else if(x==10)
					System.out.printf("%c", '��');
				else
					System.out.printf("%c", '��');
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
					
		// ������ �����ǿ� ����			
		// ������ ���ο� ���� ����
		board[y][x] = '��';
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
				board[y][x] =  '��';
	}

}
