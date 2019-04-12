package chapter2.ex1.cutting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ShuffleProgram1 {
	static boolean play = false;
	static Scanner scan = new Scanner(System.in);
	static int[] classIds = new int[100];
	static String[] classNames = new String[100];
	static int[] classCapacitys = new int[100];
	static int[] groupCountofClasses = new int[100];
	static String[][] names = new String[100][30];
	
	static int current = 0;
	
	public static void main(String[] args) throws IOException {
		
		EXIT:
		while(true) {
		
			int menu = inputMainMenu();
			
			switch(menu) {
			case 1: //new Class
				addClass(); //addClass, insertClass, regClass, createClass, appendClass,.....
				break;
			case 2: //Open Class
				listClass();//editClass, modifyClass, ...showClass, detailClass, getinfoClass, ...
				break;
			case 3:
				System.out.println("Bye~~~");
				break EXIT;
			default:
			}
	
		}
	}

	private static void listClass() {
		// TODO Auto-generated method stub
		
	}

	private static void addClass() throws IOException {
		System.out.println();
		System.out.println();
		System.out.printf("\t \t \t \t PROGOOGLERS");
		System.out.println();
		System.out.println();
		System.out.printf("\t \t ▶ Class ID : ");
		classIds[current] = Integer.parseInt(scan.nextLine());
		System.out.printf("\t \t ▶ Class name : ");
		classNames[current] = scan.nextLine(); // 엔터친곳까지 읽어옴 (next는 스페이스까지)
		System.out.printf("\t \t ▶ Total members : ");
		classCapacitys[current] = Integer.parseInt(scan.nextLine());
		System.out.printf("\t \t ▶ Total groups : ");
		groupCountofClasses[current] = Integer.parseInt(scan.nextLine());
        System.out.print("\t\t ▶ GOOGLER names : ");
        String line = scan.nextLine();
        String[] ns = line.split(",");
		for(int i=0; i<ns.length; i++) {
			names[current][i] = ns[i];
//		System.out.printf("\t \t ▶ GOOGLER names : ");
//		names[current][30] = scan.next();
		}
		System.out.println();
		System.out.printf("\t \t 1. Save class\n");
		System.out.printf("\t \t 2. Go back\n");
		System.out.printf("\t \t Go to > ");
		int menu = Integer.parseInt(scan.nextLine());
		
		라벨벨:
		
		while(!play){
			switch(menu) {
			
			case 1:
				saveClass();
				break;
				
			case 2:
				goMain();
				break;
				
			default:
				
			}
		}
		
		
		//current++;
		
	}

	private static void saveClass() throws IOException {
		
		FileOutputStream fos = new FileOutputStream("D:\\java\\workspace\\class_save.txt");
		PrintStream fout = new PrintStream(fos);
		
				
		fout.format("\n\n\t \t \t \t PROGOOGLERS\n\n\t\t▶ Class ID : %d\n"
				+ "\t\t▶ Class name : %s\n\t\t▶ Total members : %d\n"
				+ "\t\t▶ Total groups : %d\n\t\t▶ GOOGLER names : ", classIds[current], classNames[current],
				classCapacitys[current],groupCountofClasses[current]);

		

		
		System.out.println();
		System.out.println("\t\t\t\t저장 완료");
		play = true;
		
	}
	
	private static void goMain() {

		
		
	}



	private static int inputMainMenu() {
		System.out.println();
		System.out.println();
		System.out.printf("\t \t \t SHAKE IT! SHAKE IT!");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.printf("\t \t 1. New Class\n");
		System.out.printf("\t \t 2. Open Class\n");
		System.out.printf("\t \t 3. Quit\n");
		System.out.println();
		System.out.printf("\t \t Go to > ");
		int menu = Integer.parseInt(scan.nextLine());
		return menu;
	
	}

}
