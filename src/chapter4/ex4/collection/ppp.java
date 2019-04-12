package chapter4.ex4.collection;

public class ppp {

	public static void main(String[] args) {
		
		ObjectList obj = new ObjectList();
		
		for(int i=0; i<20; i++) {
			obj.add(new Object());
			System.out.printf("%d-%d\n", obj.getCurrent(), obj.getCapacity());
		}

	}

}
