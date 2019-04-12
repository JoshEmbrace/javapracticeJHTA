package chapter2.ex3.shuffle;

import java.util.Scanner;

public class ShuffleSit2 {
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
					System.out.printf("  %3d\t %20s\t\t\t\t\t\t%3d",classes[i].id,classes[i].name,classes[i].capacity);
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
			System.out.print("\t\t\tGo to> ");
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
					System.out.println();
					System.out.print("\t\tID를 입력하세요 > ");
					currentId = Integer.parseInt(scan.nextLine());
					viewClass();
					break;
					
				case 4:
					System.out.println();
					System.out.print("\t\tID를 입력하세요 > ");
					currentId = Integer.parseInt(scan.nextLine());
 					deleteClass();
					break;
				
				case 5:
					return;
			}
		}
		
		
	}
	
	private static void deleteClass() {
		System.out.println();

		int index = -1;
  
		for(int i=0; i<current; i++)
			if(classes[i].id == currentId)
				index = i;         

		if(index == -1) {
			System.out.println("선택한 id에 대한 과정 정보가 존재하지 않습니다.");
         return;
		}
		/*
	       courses
	             [0] ->  null;
	             [1] ->  2009호;
	             [2] ->  2018호;
	current -> [3] -> null; 
	==============================
	
		classes[index] = null;
		classes[index+1] = 2009;
		classes[index+2] = 2018;
		
		classes[index] = 2009;
		classes[index+1] = 2009;
		classes[index+2] = 2018;
		
		classes[index] = 2009;
		classes[index+1] = 2018;
		classes[index+2] = 2018;
		
		classes[index] = 2009;
		classes[index+1] = 2018;
		classes[index+2] = null;
	*/	
		classes[index] = null;
		
		for(int i=index; i<current; i++) {
			if(i==current-1) {
				classes[i]=null;
				current=current-1;
			}
			classes[i] = classes[i+1];
		}
			
		/*
		 
	      index == 3 <- 삭제
	      current == 9
	      
	     반복횟수 : current-index-1
	                  
	      [0][1][2][3][4][5][6][7][8]
	      
	      for(int i=0; i<current-index-1; i++)
	         courses[index+i] = courses[index+1+i];
	         
	      current--;
	      
	      */
		/*
	1 단계
	      courses
	             [0] ->  2009호;
	             [1] ->  2009호;
	               [2] ->  2018호;
	current -> [3] -> null; 

	-------------------------------
	2 단계
	      courses
	             [0] ->  2009호;
	             [1] ->  2018호;
	               [2] ->  2018호;
	current -> [3] -> null; 

	-------------------------------
	3 단계
	      courses
	             [0] ->  2009호;
	             [1] ->  2018호;
	               [2] ->  null;
	current -> [3] -> null; 

	-------------------------------
	최종 단계
	      courses
	             [0] ->  2009호;
	             [1] ->  2018호;
	current -> [2] ->  null;
	             [3] -> null; 
	       */

  
  /*
   classes-> [1004][null][1012]
   */
	}

	private static void viewClass() {
		   System.out.println();
		   System.out.print("#MAIN > #Select Class > #View Class & Edit member");

	      int index = -1;
	      
	      for(int i=0; i<current; i++)
	         if(classes[i].id == currentId)
	            index = i;         
	      
	      if(index == -1) {
	         System.out.println("선택한 id에 대한 과정 정보가 존재하지 않습니다.");
	         return;
	      }
	         
	      클래스 course = classes[index];         
	      System.out.println();
	      System.out.println();
	      System.out.printf("\t\t▶ Class ID : %d\n", course.id);
	      System.out.printf("\t\t▶ Class Name : %s\n", course.name);
	      System.out.print("\t\t▶ Member List : ");
	      
	      for(int i=0; i< course.members.length; i++)
	         if(i == course.members.length-1)
	            System.out.printf("%s", course.members[i]);
	         else
	            System.out.printf("%s, ", course.members[i]);
	      
	      System.out.println();
	      System.out.println();
	      System.out.println("1. Edit  2. Go back");
	      
	      int menu = Integer.parseInt(scan.nextLine());
	      String[] names = null;
	      
	      if(menu == 1) {         
	         System.out.print("\t\t▶ Member List :");
	         names = scan.nextLine().split(",");
	      }
	      else if(menu == 2)
	         return;
	      System.out.println();
	      System.out.println("Save? 1.Y / 2.N");
	      System.out.println();
	      System.out.print("\t>");
	      int save = Integer.parseInt(scan.nextLine());
	      
	      if(save == 1) {
	         course.members = names;
	         course.capacity = names.length;
	      }
			System.out.println();
			System.out.println("________________________________________");
		      
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
