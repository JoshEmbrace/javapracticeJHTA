package chapter4.ex1.����ó��;


public class Calculator {
	// �������� ���� ������ ���� 1000�� ���� �� ����.
	public static int add(int x, int y) throws õ���Ѵ¿���{

		int result = x + y;
		
		if(result > 1000)
			throw new õ���Ѵ¿���();
		//��, ������, �ܼ�...
		return result;
		
	}

	// �и�� 0�� �� �� ����. �и�� ������ �� �� ����.
	public static int div(int x, int y) throws �и��0�����۰ų����������¿��� {

		int result = x / y;
		
		if(y<=0)
			throw new �и��0�����۰ų����������¿���();

		return result;
		
	}
	
}