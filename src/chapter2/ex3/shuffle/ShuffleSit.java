package chapter2.ex3.shuffle;

import java.util.Scanner;

public class ShuffleSit {
	static int current = 0;
	static Scanner scan = new Scanner(System.in);
	static 클래스[] classes = new 클래스[100]; //개념화 된 데이터
	static int currentId = -1;

	/*
	
	
	static int[] classIds = new int[100];
	static String[] classNames = new String[100];
	static int[] classCapacitys = new int[100];
	static int[] groupCountofClasses = new int[100];
	static String[][] names = new String[100][];
	static Object[] historyIds;
	static Object[] historyDates;
	*/
	
	public static void main(String[] args) {
		
		EXIT:
		while(true) {
			
			int menu = inputMainMenu();
			switch(menu) {
			
			case 1:
				listClass();
				break;
				
			case 2:
				listHistory();
				break;
				
			case 3:
				System.out.println();
				System.out.println();
				System.out.println("\t\t\tByeBye~~~");
				break EXIT;
				
			default:
			
			}
		}
	}
	
	private static void listClass() {
		while(true) {
			System.out.println();
			System.out.println("#Main > #Select Class");
			System.out.println();
			System.out.println("\t\t\tCLASS LIST");
			System.out.println();
			System.out.println("│ ID │ 	 	            NAME        	 		│CAPA│");
			if(current == 0) 
				System.out.println("\t\tPlease add new class");
			else {
				for(int i=0; i<current; i++) {
					//System.out.printf("  %3d\t   %20s\t\t\t\t  %3d",classIds[i],classNames[i],classCapacitys[i]);
					System.out.printf("  %3d\t   %20s\t\t\t\t  %3d",classes[i].id,classes[i].name,classes[i].capacity);
					System.out.println();
				}
			}
			System.out.println();
			System.out.println();
			System.out.println("\t\t1. Shake it");
			System.out.println("\t\t2. Add Class");
			System.out.println("\t\t3. View Class & Edit member");
			System.out.println("\t\t4. Delete Clas");
			System.out.println("\t\t5. Go main");
			System.out.println();
			System.out.println("\t\t\tGo to> ");
			int menu = Integer.parseInt(scan.nextLine());
			System.out.println();
			System.out.println("________________________________________");
			
			switch(menu) {
				case 1:
					shakeClass();
					break;
					
				case 2:
					addClass();
					break;
					
				case 3:
					System.out.print("ID를 입력하세요 > ");
					currentId = Integer.parseInt(scan.nextLine());
					viewClass();
					break;
					
				case 4:
					
 					deleteClass();
					break;
				
				case 5:
					return;
			}
		}
		
		
	}
	
	private static void deleteClass() {
		// TODO Auto-generated method stub
		
	}

	private static void viewClass() {
		
		System.out.println();
		System.out.println("#Main > #Select Class > #View Class & Edit member");
		System.out.println();
		
		int index = -1;
		int edit;
		String[] members;
		
		for(int i=0; i<current; i++) {
			if(classes[i].id==currentId) {
				index = i;
			}
		}
		/*
		클래스 course = classes[index];
		
		System.out.printf("\t\t▶ Class ID : %d", course.id);
		System.out.printf("\t\t▶ Class Name : %s", course.name);
		System.out.printf("\t\t▶ Member List : %s", course.members);
		*/
		System.out.printf("\t\t▶ Class ID : %d\n", classes[index].id);
		System.out.printf("\t\t▶ Class Name : %s\n", classes[index].name);
		System.out.printf("\t\t▶ Member List : ");
		
		for(int i=0; i<classes[index].members.length;i++) {
			if(i==classes[index].members.length-1) {
				System.out.printf("%s", classes[index].members[i]);
			}
			else
				System.out.printf("%s,", classes[index].members[i]);	
		}
		System.out.println();
		
		
		do {
		System.out.print("\t\t1. Edit\t2. Go back \n");
		System.out.print("\t\t> ");
		edit = Integer.parseInt(scan.nextLine());
		if(edit == 1) {
			System.out.println();
			System.out.print("\t\t▶ Member List : ");
			members = scan.nextLine().split(",");
			classes[index].members = members;
			classes[index].capacity = members.length;
		}
		else if(edit == 2) ; // ; 만 찍으면 문장없음
		else {
			System.out.println("사용방법 : 1 또는 2번만 입력할 수 있습니다.");
		}
		} while(!(edit == 1 || edit == 2));
		
	}

	private static void addClass() {
		
		int id;
		String name;
		String[] members;
		System.out.println();
		System.out.println("#Main > #Select Class > #Add Class");
		System.out.println();
		System.out.print("\t\t▶ Class ID : ");
		id = Integer.parseInt(scan.nextLine());
		System.out.print("\t\t▶ Class Name : ");
		name = scan.nextLine();
		System.out.print("\t\t▶ Member List : ");
		members = scan.nextLine().split(",");
		
		int save;
		
		do {
			System.out.print("\t\t▶ Save?  1.Y  /  2.N ");
			System.out.print("\t\t> ");
			save = Integer.parseInt(scan.nextLine());
			if(save == 1) {
				classes[current] = new 클래스();
				classes[current].id = id;
				classes[current].name = name;
				classes[current].members = members;
				classes[current].capacity = members.length;
				current ++;
			}
			else if(save == 2) ; // ; 만 찍으면 문장없음
			else {
				System.out.println("사용방법 : 1 또는 2번만 입력할 수 있습니다.");
			}
		} while(!(save == 1 || save == 2));
		System.out.println();
		System.out.println("________________________________________");
	}
		
		


	private static void shakeClass() {
		
		
		
	}

	private static void listHistory() {

		System.out.println();
		System.out.println("#Main > #History");
		System.out.println();
		System.out.println("\t\t\tSHAKE HISTORY");
		System.out.println();
		System.out.println("\t│No│    Date	  │  Class Name      │Groups│");
		for(int i=0; i<=current; i++) {
			if(current == 0) {
				System.out.println("\t\tPlease shake new class");
			}
			else {
				System.out.printf(" ");
			}
		}
		System.out.println();
		System.out.println("\t\t1. View detail");
		System.out.println("\t\t2. Go main");
		System.out.println();
		System.out.println("\t\t\tGo to> ");
		int menu = Integer.parseInt(scan.nextLine());
		System.out.println();
		System.out.println("________________________________________");
		
	}



	private static int inputMainMenu() {
		
		System.out.println();
		System.out.println("#Main");
		System.out.println();
		System.out.println();
		System.out.println("\t\t\tSHAKE IT! SHAKE IT!");
		System.out.println();
		System.out.println();
		System.out.println("\t\t1. Class");
		System.out.println("\t\t2. History");
		System.out.println("\t\t3. Quit");
		System.out.println();
		System.out.print("\t\t\tGo to> ");
		int menu = Integer.parseInt(scan.nextLine());
		System.out.println();
		System.out.println("________________________________________");
		return menu;
		
		
	}

}
