package chapter3.ex5.oop.isa;

import java.util.Scanner;

/*

 * 상속 : 물려받다..
 * 누구로부터 물려받는가? 부모(x) -> 부품(Dependendy)
 * A라는 친구로부터 상속받았다...
 * A라는 객체로부터 무엇을? 물려받았는가?
 * 사실 OOP에서 상속이란 객체의 능력을 물려 받는 것을 의미하는데..
 * 만약에 B라는 친구가 A 친구의 능력을 이용하려면?
 * B는 A를 가지고 있어야만 한다.
 * 
 * class B{
 *      private A a;
 *      public B(){a = new A();}
 *      public int add(int x, int y){
 *           // 덧셈을 어떻게 하지? 난 그런 능력이 없거나 구현하기 귀찮은데?
 *           return a.add(x, y);
 *      }
 * }
 * 
 * 다른 객체의 능력을 위와 같이 상속 받으려면 우리가 객체와 관계를 가지고 있어야 한다.
 * 그 방법이 두 가지가 있으니... 하나는 Has a 관계... 또 하나는 Is a 관계라더라..
 * 
 *  1. (B) Has A (A) 관계 : A부품(<->B제품) 관계
 *  2. (B) Is A (A) 관계 : A틀(<->B제품) 관계
 
 */

public class Program {

	public static void main(String[] args) {

		// 재료
		//Exam[] exams = new Exam[3];
		//int current = 0;
		ExamConsole console = new ExamConsole();//ExamList + () 객체생성함수
		//exams.init(); <- 사실 이건 초기화라기 보단 "exams.reset();"에 해당한다.
			
		//객체, 참조변수, 값변수
		
		// 반복
		// 1.메뉴 입력
		EXIT: 
			while (true) {

			int menu = inputMenu();

			// 2.메뉴에 따라서
			// 성적입력
			// 성적출력
			// 종료
			switch (menu) {

			case 1:
				//ExamList.inputExamList(exams);
				//ExamList.input(exams);
				console.input();
				break;

			case 2:
				console.print();
				break;

			case 3:
				System.out.println("\t\t\tByeBye~~~");
				break EXIT;

			default:
			}

		}

	}

	private static int inputMenu() {

		System.out.println();
		System.out.println("┌───────────────────────────┐");
		System.out.println("│          			메인 메뉴             		     │");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.print("\t선택> ");
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();

		return menu;
	}

}
