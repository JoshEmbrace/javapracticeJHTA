import java.util.Scanner;

public class MyAge {

	public static void main(String[] args) {
		int age;

		age = 32;

		Scanner scan = new Scanner(System.in);

//		System.out.print("나이");
//
//		age = scan.nextInt();
//
//		System.out.printf("나이:%d", age);
//
//			while(age < 1 || 199 < age)
//				{
//					System.out.println("나이는 1 이상 199 이하만 입력할 수 있습니다.");
//					
//					System.out.printf("나이:%d\n", age);
//
//					age = scan.nextInt();
//				}
			
		do 
		{
			System.out.print("나이");
			age = scan.nextInt();
			System.out.printf("나이:%d", age);
			
			if(age < 1 || 199 < age)
				System.out.println("나이는 1 이상 199 이하만 입력할 수 있습니다.");
		}
		while(age < 1 || 199 < age);
			
			
		scan.close();

	}

}
