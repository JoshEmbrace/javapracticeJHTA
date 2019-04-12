package chapter2.ex1.cutting;

import java.util.Scanner;

public class ShuffleSits {

	static Scanner scan = new Scanner(System.in);
	static int[] classIds = new int[100];
	static String[] classNames = new String[100];
	static int[] classCapacitys = new int[100];
	static int[] groupCountofClasses = new int[100];
	static String[][] names = new String[100][30];
	
	static int current = 0;
	
	public static void main(String[] args) {
		EXIT:
		while(true) {
			
			int menu = inputMainMenu();
			
			switch(menu) {
			case 1: //new Class
				listClass(); //addClass, insertClass, regClass, createClass, appendClass,.....
				break;
			case 2: //Open Class
				listHistory();//editClass, modifyClass, ...showClass, detailClass, getinfoClass, ...
				break;
			case 3:
				System.out.println("Bye~~~");
				break EXIT;
			default:
			}
		
		}

	}

	private static void listHistory() {
		
		
	}

	private static void listClass() {
		if(current==0) { // 목록이 없을경우
			System.out.println();
			System.out.println("#MAIN > #Select Class");
			System.out.println();
			System.out.println("	│ID│  	        NAME	 	   │CAPA│");
			System.out.println("		Please add new class");
		}
		else {
			for(int i=0; i<current; i++) {
				System.out.println("	|ID|			NAME			|CAPA|");
				System.out.printf("|%3d|%20s| %3d |", classIds[i], classNames[i], classCapacitys[i]);
			}
		}
		System.out.println();
		System.out.println();
		System.out.printf("\t \t 1. Shake it\n");
		System.out.printf("\t \t 2. Add Class\n");
		System.out.printf("\t \t 3. View Class & Edit member\n");
		System.out.printf("\t \t 4. Delete Class\n");
		System.out.printf("\t \t 5. Go main\n");
		System.out.println();
		System.out.printf("\t \t Go to > ");
		System.out.println();
		System.out.println("_______________________________________________");
		
		int menu = Integer.parseInt(scan.nextLine());
		
		switch(menu) {
		case 1:
			//inputClassId
		case 2:
		case 3:
		case 4:
			
		case 5:
			return;
		
		}
	
	}

	private static int inputMainMenu() {
		System.out.println();
		System.out.println("#MAIN");
		System.out.println();
		System.out.println();
		System.out.printf("\t \t \t SHAKE IT! SHAKE IT!");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.printf("\t \t 1. Class\n");
		System.out.printf("\t \t 2. History\n");
		System.out.printf("\t \t 3. Quit\n");
		System.out.println();
		System.out.printf("\t \t Go to > ");
		int menu = Integer.parseInt(scan.nextLine());
		System.out.println();
		System.out.println("_______________________________________________");
		return menu;
		
	}

}
