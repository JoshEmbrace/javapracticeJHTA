package chapter2.ex1.array;

import java.util.Scanner;

public class Omokmyself {

	public static void main(String[] args) {
		
		final int HEIGHT = 10; //���� y��ũ��
		final int WIDTH = 15; //���� x��ũ��
				
		char[][] board = new char[HEIGHT][WIDTH]; // ����迭 ys
		int[] xs = new int[100]; //�Է¹��� x��ǥ���� �迭 
		int[] ys = new int[100]; //�Է¹��� y��ǥ���� �迭
		int current = 0; //���� ���° �Է����� ����
		Scanner scan = new Scanner(System.in);
		
		//����迭�� ����ä���
		for(int y=0; y<HEIGHT; y++) {
			for(int x=0; x<WIDTH; x++) {
				board[y][x] = '��';
				board[0][x] = '��';
				board[HEIGHT-1][x] = '��';
				board[y][0] = '��';
				board[y][WIDTH-1] = '��';
				board[0][0] = '��';
				board[HEIGHT-1][0] = '��';
				board[0][WIDTH-1] = '��';
				board[HEIGHT-1][WIDTH-1]='��';
			}
		}

		
		while(true) {
			
			//��������ϱ�
			for(int y=0; y<HEIGHT; y++) {
				for(int x=0; x<WIDTH; x++) {
					System.out.printf("%c",board[y][x]);
				}
				System.out.println();
			}
			
			boolean put = true;
			while(put){
				System.out.print("(X sp Y) >_");
				//������ǥ �޾ƿ���
				int x = scan.nextInt();
				int y = scan.nextInt();
				
				xs[current] = x;
				ys[current] = y;

				
				for(int i=0; i<current; i++) {
					if(x==xs[i]&&y==ys[i]) {
						System.out.print("�ߺ����Դϴ�. �ٽ��Է����ּ���.");
					}
					else {
						if(current%2 == 0) {
							board[y][x]='��';
							put = false;
						}
						else {
							board[y][x]='��';
							put = false;
						}
					}
				}
			}
			current ++;
		}
			
	}

}
