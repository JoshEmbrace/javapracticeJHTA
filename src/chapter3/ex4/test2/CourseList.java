package chapter3.ex4.test2;

import java.util.Scanner;

//캡슐화-데이터 구조, 함수 묶은것.
public class CourseList {
	Course[] courses;
	int current;

	// CourseList 형식의 객체가 생성될 때만 호출될 수 있는 생성자 함수
	public CourseList() {
		this.courses = new Course[10];// 이름만 정의
		this.current = 0;
	}

	public void list() {
		while (true) {
			Scanner scan = new Scanner(System.in);
			// 임시변수
			Course[] courses = this.courses;
			int current = this.current;
			System.out.println("====================================");
			System.out.println("#MAIN > #Class");
			System.out.println("┌────┬────────────────────────┬────┐");
			System.out.println("│ ID │          NAME          │CAPA│");
			System.out.println("├────┼────────────────────────┼────┤");

			if (current == 0) // 목록이 없을 경우
				System.out.println("│    │ Please add new class   │    │");
			else
				for (int i = 0; i < current; i++) {
					Course course = courses[i];
					int id = course.getId(); //courses[i].id;
					String name = course.getName();
					int capacity = course.getCapacity();
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
				// shakeClass();
				break;
			case 2:
				add();
				break;
			case 3:
				view();
				break;
			case 4:
				delete();
				break;
			case 5:
				return;
			}
		}
	}

	public void add() {
		Scanner scan = new Scanner(System.in);
		Course[] courses = this.courses;
		int current = this.current;

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
				Course course = new Course(id, name, members, members.length);
				courses[current] = course;
//            course.setId(id);
//            course.setName(name);
//            course.setMembers(members);
//            course.setCapacity(members.length);
				current++;
				this.current = current;
			} else if (save == 2)
				System.out.println("저장하지 않습니다.");
			else
				System.out.println("사용방법 : 1 또는 2번만 입력할 수 있습니다.");
		} while (!(save == 1 || save == 2));
	}

	public void view() {
		Scanner scan = new Scanner(System.in);
		Course[] courses = this.courses;
		int current = this.current;
		int index = -1;
		int currentId = -1;

		System.out.print("Class ID > ");
		currentId = Integer.parseInt(scan.nextLine());
		System.out.println("====================================");
		System.out.println("#MAIN > #Class > #View Class & Edit member");
		System.out.println();

		for (int i = 0; i < current; i++) {
			Course course = courses[i];
			if (course.getId() == currentId)
				index = i;
		}
		if (index == -1) {
			System.out.println("선택한 id에 대한 과정 정보가 존재하지 않습니다.");
			return;
		}

		Course course = courses[index];

		System.out.printf("▶ Class ID : %d\n", course.getId());
		System.out.printf("▶ Class Name : %s\n", course.getName());
		System.out.print("▶ Member List : ");

		int length = course.getCapacity();

		for (int i = 0; i < length; i++)
			if (i == length - 1)
				System.out.printf("%s ", course.getMembers()[i]);
			else
				System.out.printf("%s, ", course.getMembers()[i]);
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
			course.setMembers(names);
			course.setCapacity(course.getCapacity());
		}
	}

	public void delete() {
		Scanner scan = new Scanner(System.in);
		Course[] courses = this.courses;
		int current = this.current;
		int index = -1;
		int currentId = -1;

		System.out.print("Class ID > ");
		currentId = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < current; i++) {
			Course course = courses[i];
			if (course.getId() == currentId)
				index = i;
		}
		if (index == -1) {
			System.out.println("선택한 id에 대한 과정 정보가 존재하지 않습니다.");
			return;
		}

		courses[index] = null;

		for (int i = 0; i < current - index - 1; i++)
			courses[index + i] = courses[index + 1 + i];

		current--;
		this.current = current;
	}
}