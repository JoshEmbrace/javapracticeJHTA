package chapter3.ex4.test3_reuse;

import java.util.Scanner;

public class Shuffle_main {

	public static void main(String[] args) {
		//°´Ã¼»ý¼º
		ShuffleConsole courselist = new ShuffleConsole();

		EXIT: while (true) {
			int menu = inputMainMenu();

			switch (menu) {
			case 1: // New Class
				courselist.list(); // addClass, insertClass, regClass, createClass, appendClass, .....
				break;
			case 2: // List Class
				listHistory(); // editClass, modifyClass, .... showClass, detailCalss, getInfoClass, ....
				break;
			case 3: // Quit
				System.out.println("Bye~~~");
				break EXIT;
			default:
			}
		}
	}

	private static int inputMainMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("#1. MAIN");
		System.out.println();
		System.out.println("\tSHAKE IT! SHAKE IT!");
		System.out.println();
		System.out.println("1. Class");
		System.out.println("2. History");
		System.out.println("3. Quit");
		System.out.print("> ");

		int menu = Integer.parseInt(scan.nextLine());
		return menu;
	}

	private static void listHistory() {
	}
}