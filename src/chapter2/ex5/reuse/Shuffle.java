package chapter2.ex5.reuse;

import java.util.Scanner;

public class Shuffle {

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

	private static void listClass(CourseList list) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			Course[] courses = list.courses;
			int current = list.current;
			System.out.println("====================================");
			System.out.println("#MAIN > #Class");
			System.out.println("┌────┬────────────────────────┬────┐");
			System.out.println("│ ID │          NAME          │CAPA│");
			System.out.println("├────┼────────────────────────┼────┤");

			if (current == 0) // 목록이 없을 경우
				System.out.println("│    │ Please add new class   │    │");
			else
				for (int i = 0; i < current; i++) {
					int id = courses[i].id;
					String name = courses[i].name;
					int capacity = courses[i].capacity;
					System.out.printf("│ %2d │%-24s│ %2d │\n", id, name, capacity);
				}
			System.out.println("└────┴────────────────────────┴────┘");
			System.out.println("1. Shake it");
			System.out.println("2. Add Class");
			System.out.println("3. View Class & Edit member");
			System.out.println("4. Delete Class");
			System.out.println("5. Go main");
			System.out.print("> ");

			int menu = Integer.parseInt(scan.nextLine());

			switch (menu) {
			case 1:
				shakeClass();
				break;
			case 2:
				addClass(list);
				break;
			case 3:
				viewClass(list);
				break;
			case 4:
				deleteClass(list);
				break;
			case 5:
				return;
			}
		}
	}

	private static void shakeClass() {

	}

	private static void addClass(CourseList list) {
		Scanner scan = new Scanner(System.in);
		Course[] courses = list.courses;
		int current = list.current;

		int id;
		String name;
		String[] members;

		System.out.println("====================================");
		System.out.println("#MAIN > #Class > #Add Class");
		System.out.println();
		System.out.print("▶ Class ID :  ");
		id = Integer.parseInt(scan.nextLine());
		System.out.print("▶ Class Name : ");
		name = scan.nextLine();
		System.out.print("▶ Member List : ");
		members = scan.nextLine().split(",");

		int save;
		do {
			System.out.println();
			System.out.println("Save? 1.Y / 2.N");
			System.out.print("> ");
			save = Integer.parseInt(scan.nextLine());

			if (save == 1) {
				courses[current] = new Course();
				courses[current].id = id;
				courses[current].name = name;
				courses[current].members = members;
				courses[current].capacity = members.length;
				current++;
				list.current = current;
			} else if (save == 2)
				System.out.println("저장하지 않습니다.");
			else
				System.out.println("사용방법 : 1 또는 2번만 입력할 수 있습니다.");
		} while (!(save == 1 || save == 2));
	}

	private static void viewClass(CourseList list) {
		Scanner scan = new Scanner(System.in);
		Course[] courses = list.courses;
		int current = list.current;
		int index = -1;
		int currentId = -1;

		System.out.print("Class ID > ");
		currentId = Integer.parseInt(scan.nextLine());
		System.out.println("====================================");
		System.out.println("#MAIN > #Class > #View Class & Edit member");
		System.out.println();

		for (int i = 0; i < current; i++)
			if (courses[i].id == currentId)
				index = i;

		if (index == -1) {
			System.out.println("선택한 id에 대한 과정 정보가 존재하지 않습니다.");
			return;
		}

		Course course = courses[index];

		System.out.printf("▶ Class ID : %d\n", course.id);
		System.out.printf("▶ Class Name : %s\n", course.name);
		System.out.print("▶ Member List : ");

		for (int i = 0; i < course.members.length; i++)
			if (i == course.members.length - 1)
				System.out.printf("%s", course.members[i]);
			else
				System.out.printf("%s, ", course.members[i]);
		System.out.println();
		System.out.println("1. Edit  2. Go back");
		System.out.print("> ");
		int menu = Integer.parseInt(scan.nextLine());
		String[] names = null;

		if (menu == 1) {
			System.out.print("▶ Member List :");
			names = scan.nextLine().split(",");
		} else if (menu == 2)
			return;
		System.out.println();
		System.out.println("Save? 1.Y / 2.N");
		System.out.print("> ");
		int save = Integer.parseInt(scan.nextLine());

		if (save == 1) {
			course.members = names;
			course.capacity = course.members.length;
		}
	}

	private static void deleteClass(CourseList list) {
		Scanner scan = new Scanner(System.in);
		Course[] courses = list.courses;
		int current = list.current;
		int index = -1;
		int currentId = -1;

		System.out.print("Class ID > ");
		currentId = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < current; i++)
			if (courses[i].id == currentId)
				index = i;

		if (index == -1) {
			System.out.println("선택한 id에 대한 과정 정보가 존재하지 않습니다.");
			return;
		}

		courses[index] = null;

		for (int i = 0; i < current - index - 1; i++)
			courses[index + i] = courses[index + 1 + i];

		current--;
		list.current = current;
	}

	private static void listHistory() {
	}
}