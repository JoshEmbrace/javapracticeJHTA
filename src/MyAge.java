import java.util.Scanner;

public class MyAge {

	public static void main(String[] args) {
		int age;

		age = 32;

		Scanner scan = new Scanner(System.in);

//		System.out.print("����");
//
//		age = scan.nextInt();
//
//		System.out.printf("����:%d", age);
//
//			while(age < 1 || 199 < age)
//				{
//					System.out.println("���̴� 1 �̻� 199 ���ϸ� �Է��� �� �ֽ��ϴ�.");
//					
//					System.out.printf("����:%d\n", age);
//
//					age = scan.nextInt();
//				}
			
		do 
		{
			System.out.print("����");
			age = scan.nextInt();
			System.out.printf("����:%d", age);
			
			if(age < 1 || 199 < age)
				System.out.println("���̴� 1 �̻� 199 ���ϸ� �Է��� �� �ֽ��ϴ�.");
		}
		while(age < 1 || 199 < age);
			
			
		scan.close();

	}

}
