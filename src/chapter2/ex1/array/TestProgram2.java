package chapter2.ex1.array;

public class TestProgram2 {

	public static void main(String[] args) {
		
		int[] xs = new int[] {3,3,4,4};
		int[] ys = new int[] {4,5,5,6};
		
		for(int y=1; y<=10; y++) {
				
			for(int x=1; x<=10; x++) {
				
			/*
				if(x==xs[0]&& y==ys[0])
					System.out.printf("%c", '¡Û');
				else if(x==xs[1]&&y==ys[1])
					System.out.printf("%c", '¡Ü');
				else if(x==xs[2]&&y==ys[2])
					System.out.printf("%c", '¡Û');
				else if(x==xs[3]&&y==ys[3])
					System.out.printf("%c", '¡Ü');
				else
					System.out.printf("%c", '¦«');
			*/
				boolean put = false;
				
				for(int i=0; i<4; i++)
					if(x==xs[i] && y==ys[i]) {
						System.out.printf("%c", '¡Û');
						put = true;
						break;
					}
				
				if(!put)
					System.out.printf("%c", '¦«');
					
			}
			
			System.out.println();
			
		}
		
	}

}
