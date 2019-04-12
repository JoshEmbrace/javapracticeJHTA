package chapter2.ex1.array;

public class TestProgram {

	public static void main(String[] args) {
		
		for(int y=1; y<=10; y++) {
				
			for(int x=1; x<=10; x++) 
				if(x==3 && y==4)
					System.out.printf("%c", '¡Û');
				else if(x==3&&y==5)
					System.out.printf("%c", '¡Ü');
				else
					System.out.printf("%c", '¦«');
				
			System.out.println();
			
		}
		
	}

}
