package chapter2.ex1.array;

public class BoardProgram2 {

	public static void main(String[] args) {
		//����3. ���� �����Ϳ� ������ ���� ������ �߰��Ǿ���. �� ���� �迭�� �̿��Ͽ� ���, ��� ������ �ε��� ����.
		int[] colors = new int[] {0,1,0,1};
		
		int[] xs = new int[] {3,3,4,4};
		int[] ys = new int[] {4,5,5,6};
		
		
		
		for(int y=1; y<=10; y++)
		{
			
			for(int x=1; x<=10; x++) {
				
				boolean put = true;
				//����迭(xs, ys)���� ���� x,y��ġ�� ����� ������ �ִٸ�
				//����迭�� �׸��� �������̹Ƿ� �ݺ������� �����ϴ� �帧�� �ʿ��ϴ�.
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
							
			}
			System.out.println();
			
		}

	}

}
