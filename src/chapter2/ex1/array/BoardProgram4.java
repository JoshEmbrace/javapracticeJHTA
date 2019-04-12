package chapter2.ex1.array;

import java.util.Scanner;

public class BoardProgram4 {

	public static void main(String[] args) {
		//문제3. 오목 데이터에 색상을 위한 변수가 추가되었다. 그 변수 배열을 이용하여 흑색, 백색 오목을 두도록 하자.
		
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
					//오목배열(xs, ys)에서 현재 x,y위치에 출력할 오목이 있다면
					//오목배열의 항목이 여러개이므로 반복적으로 조사하는 흐름이 필요하다.
					for(int i=0; i<current; i++) 
						if(x==xs[i] && y==ys[i]) {//현재 위치에 둘 오목이 발견되었다면
							if(colors[i]==0)
								System.out.printf("%c", '○');//현재 위치에 오목을 출력하고
							else
								System.out.printf("%c", '★');
							put = false;
							break;
						}
	
					if(put)//그렇지 않다면
						if(x==1 && y==1)
							System.out.printf("%c", '┌');
						else if(x==10 && y==1)
							System.out.printf("%c", '┐');
						else if(x==1 && y==10)
							System.out.printf("%c", '└');
						else if(x==10 && y==10)
							System.out.printf("%c", '┘');	
						else if(x==1)
							System.out.printf("%c", '├');
						else if(x==10)
							System.out.printf("%c", '┤');
						else if( y==1)
							System.out.printf("%c", '┬');
						else if(y==10)
							System.out.printf("%c", '┴');
						else
							System.out.printf("%c", '┼');
								
				}
				System.out.println();
				
			}
			
			System.out.print("(x sp y)스페이스로 구분해서 입력하시오 > ");
		      xs[current] = scan.nextInt();
		      ys[current] = scan.nextInt();
		      colors[current] = current%2;
		
		      current ++;
		     
		}
		
	}

}
