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
		//����3. ���� �����Ϳ� ������ ���� ������ �߰��Ǿ���. �� ���� �迭�� �̿��Ͽ� ���, ��� ������ �ε��� ����.
//		int[] colors = new int[] {0,1,0,1};
		
//		int[] xs = new int[] {3,3,4,4};
//		int[] ys = new int[] {4,5,5,6};
		
//����		float a = func1(3, 4.5, 'A');
//		    Top-Down / Bottom-Up
		
		
		for(int y=1; y<=10; y++)
		{
			
			for(int x=1; x<=10; x++) {
				
				boolean put = true;
				//����迭(xs, ys)���� ���� x,y��ġ�� ����� ������ �ִٸ�
				//����迭�� �׸��� �������̹Ƿ� �ݺ������� �����ϴ� �帧�� �ʿ��ϴ�.
				
				//1.���� �ڵ带 �� �ܾ� �Ǵ� �� �������� ǥ���Ͻÿ�.
				//�Ʒ� �ڵ�� : ������ġ(x,y)�� ������ ã�Ƽ� ����ϴ� �ڵ�	
				
				//2.�׷��ٸ� � ����� � �������� �̷���� �����ϱ��?
				// [������ġ(x,y)�� ����]  "ã�Ƽ�" ���� "���"�ϴ� �ڵ�
				
				//3.�׷� �� ���� ������ ���� �����ϴ� ���� �������? �ƴϸ� �ϳ��� �������� ���ļ�
				// �����ϴ� ���� �������?
				//ã�� �۾��� ���� ����ϴ� �۾��� ���� �ʿ䰡 ����
				
				//4. ���� �� ���� ������ �Լ���(����)���� ǥ���Ͻÿ�
				//1)���� ��ġ�� ������ ã��
				int idx = findOmok(x, y);
				
				//2)���� ��ġ�� ������ ����ϴ�
				printOmok(idx);
				
//����				int sum = add(3,4);
//					System.out.print(sum);
				
				
				
				/*
				for(int i=0; i<4; i++) 
					if(x==xs[i] && y==ys[i]) {//���� ��ġ�� �� ������ �߰ߵǾ��ٸ�
						if(i%2==0)
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
							
			}*/
			System.out.println();
			
			}
		}

	}

	


//���� private static float func1(int i, double d, char c) {
//	return 0.0f;
//}


private static void printOmok(int idx) {
	//������ �迭 idk ��° ������ ������ �������� ������ ����Ͻÿ�.
	if(colors[idx] == 1)
		System.out.printf("%c", '��');//���� ��ġ�� ������ ����ϰ�
	else
		System.out.printf("%c", '��');
}

private static int findOmok(int x, int y) {
	//������ ���� : ������ �迭���� ã�Ƽ� �� �ε����� ��ȯ�Ͻÿ�.
	for(int i=0; i<4; i++) 
		if(x==xs[i] && y==ys[i]) {
			return i;
		}
	return -1; 
}


//���� private static int add(int x, int y) {
//	return x+y;
//}


}
