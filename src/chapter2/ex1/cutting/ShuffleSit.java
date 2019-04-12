package chapter2.ex1.cutting;

import java.util.Scanner;

public class ShuffleSit {

	static Scanner scan = new Scanner(System.in);
	static int current = 0;
	static int[] classIds = new int[100];
	static String[] classNames = new String[100];
	static int[] classCapacitys = new int[100];
	static int[] groupCountofClasses = new int[100];
	static String[][] names = new String[100][];
	static Object[] historyIds;
	static Object[] historyDates;
	
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
				for(int i=0; i<current; i++)
					System.out.printf("  %3d\t   %20s\t\t\t\t  %3d",classIds[i],classNames[i],classCapacitys[i]);
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
					detailClass();
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

	private static void detailClass() {
		
		
		
	}

	private static void addClass() {
		
		int id;
		String name;
		String[] members;
		
		System.out.print("▶ Class ID : ");
		id = Integer.parseInt(scan.nextLine());
		System.out.print("▶ Class Name : ");
		name = scan.nextLine();
		System.out.print("▶ Member List : ");
		members = scan.nextLine().split(",");
		
		int save;
		
		do {
			System.out.print("▶ Save?  1.Y  /  2.N ");
			System.out.print("> ");
			save = Integer.parseInt(scan.nextLine());
			if(save == 1) {
				classIds[current] = id;
				classNames[current] = name;
				names[current] = members;
				classCapacitys[current] = members.length;
				current ++;
			}
			else if(save == 2) ; // ; 만 찍으면 문장없음
			else {
				System.out.println("사용방법 : 1 또는 2번만 입력할 수 있습니다.");
			}
		} while(!(save == 1 || save == 2));
		
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
				System.out.printf("  %3d\t%14d\t%17s\t%d", historyIds[i], historyDates[i], classNames[i], groupCountofClasses [i]);
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
