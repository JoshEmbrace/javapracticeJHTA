package chapter2.ex1.array;

import java.util.Scanner;

public class BoardProgram4 {

	public static void main(String[] args) {
		//����3. ���� �����Ϳ� ������ ���� ������ �߰��Ǿ���. �� ���� �迭�� �̿��Ͽ� ���, ��� ������ �ε��� ����.
		
		int current =0 ;
		int[] colors = new int[100] ;
		int[] xs = new int[100] ;
		int[] ys = new int[100];
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			for(int y=1; y<=10; y++)
			{
				
				for(int x=1; x<=10; x++) {
					
					boolean put = true;
					//����迭(xs, ys)���� ���� x,y��ġ�� ����� ������ �ִٸ�
					//����迭�� �׸��� �������̹Ƿ� �ݺ������� �����ϴ� �帧�� �ʿ��ϴ�.
					for(int i=0; i<current; i++) 
						if(x==xs[i] && y==ys[i]) {//���� ��ġ�� �� ������ �߰ߵǾ��ٸ�
							if(colors[i]==0)
								System.out.printf("%c", '��');//���� ��ġ�� ������ ����ϰ�
							else
								System.out.printf("%c", '��');
							put = false;
							break;
						}
	
					if(put)//�׷��� �ʴٸ�
						if(x==1 && y==1)
							System.out.printf("%c", '��');
						else if(x==10 && y==1)
							System.out.printf("%c", '��');
						else if(x==1 && y==10)
							System.out.printf("%c", '��');
						else if(x==10 && y==10)
							System.out.printf("%c", '��');	
						else if(x==1)
							System.out.printf("%c", '��');
						else if(x==10)
							System.out.printf("%c", '��');
						else if( y==1)
							System.out.printf("%c", '��');
						else if(y==10)
							System.out.printf("%c", '��');
						else
							System.out.printf("%c", '��');
								
				}
				System.out.println();
				
			}
			
			System.out.print("(x sp y)�����̽��� �����ؼ� �Է��Ͻÿ� > ");
		      xs[current] = scan.nextInt();
		      ys[current] = scan.nextInt();
		      colors[current] = current%2;
		
		      current ++;
		     
		}
		
	}

}
