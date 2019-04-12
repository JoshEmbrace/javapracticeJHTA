package chapter2.ex1.cutting;

public class BoardProgram {

	static int[] xs = new int[] {3,3,4,4};
	static int[] ys = new int[] {4,5,5,6};
	static int[] colors = new int[] {0,1,0,1};
/*	
	private static int findOmok(int x, int y) {
		return -1;
	}
	
	void printOmok(int x, int y) {
		
	}
*/

	public static void main(String[] args) {
		//문제3. 오목 데이터에 색상을 위한 변수가 추가되었다. 그 변수 배열을 이용하여 흑색, 백색 오목을 두도록 하자.
//		int[] colors = new int[] {0,1,0,1};
		
//		int[] xs = new int[] {3,3,4,4};
//		int[] ys = new int[] {4,5,5,6};
		
//연습		float a = func1(3, 4.5, 'A');
//		    Top-Down / Bottom-Up
		
		
		for(int y=1; y<=10; y++)
		{
			
			for(int x=1; x<=10; x++) {
				
				boolean put = true;
				//오목배열(xs, ys)에서 현재 x,y위치에 출력할 오목이 있다면
				//오목배열의 항목이 여러개이므로 반복적으로 조사하는 흐름이 필요하다.
				
				//1.다음 코드를 한 단어 또는 한 문장으로 표현하시오.
				//아래 코드는 : 현재위치(x,y)의 오목돌을 찾아서 출력하는 코드	
				
				//2.그렇다면 어떤 문장과 어떤 문장으로 이루어진 문장일까요?
				// [현재위치(x,y)의 오목돌]  "찾아서" 결합 "출력"하는 코드
				
				//3.그럼 두 개의 문장을 따로 구현하는 것이 좋을까요? 아니면 하나의 문장으로 합쳐서
				// 구현하는 것이 좋을까요?
				//찾는 작업은 굳이 출력하는 작업과 묶일 필요가 없다
				
				//4. 다음 두 개의 문장을 함수명(영어)으로 표현하시오
				//1)현재 위치의 오목을 찾다
				int idx = findOmok(x, y);
				
				//2)현재 위치에 오목을 출력하다
				printOmok(idx);
				
//연습				int sum = add(3,4);
//					System.out.print(sum);
				
				
				
				/*
				for(int i=0; i<4; i++) 
					if(x==xs[i] && y==ys[i]) {//현재 위치에 둘 오목이 발견되었다면
						if(i%2==0)
							System.out.printf("%c", '○');//현재 위치에 오목을 출력하고
						else
							System.out.printf("%c", '●');
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
							
			}*/
			System.out.println();
			
			}
		}

	}

	


//연습 private static float func1(int i, double d, char c) {
//	return 0.0f;
//}


private static void printOmok(int idx) {
	//오목을 배열 idk 번째 오목의 색상을 기준으로 오목을 출력하시오.
	if(colors[idx] == 1)
		System.out.printf("%c", '○');//현재 위치에 오목을 출력하고
	else
		System.out.printf("%c", '●');
}

private static int findOmok(int x, int y) {
	//구현할 내용 : 오목을 배열에서 찾아서 그 인덱스를 반환하시오.
	for(int i=0; i<4; i++) 
		if(x==xs[i] && y==ys[i]) {
			return i;
		}
	return -1; 
}


//연습 private static int add(int x, int y) {
//	return x+y;
//}


}
