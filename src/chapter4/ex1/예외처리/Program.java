package chapter4.ex1.����ó��;
//������ ���� �ƴ� �޴� ���� ó���Ѵ�(�������α׷�)
//�޼����� ���� ������ �ϴ� ��.
public class Program {

	public static void main(String[] args)  {
	
		try {
			int x = Calculator.add(1000, 20);
			System.out.println("x: " + x);
			x = Calculator.div(50, -1);
		}
		catch (�и��0�����۰ų����������¿��� e) {
			//var nums = new int[200000];
			//nums = null;
			System.out.println(e.getMessage());
		}
		catch(Exception e) { //��� ����ó���� �޾���
			System.out.println(e.getMessage());
			//System.out.println("�˼��մϴ�. ����ġ ���� ������ ������ ����� �˼��մϴ�.");
		} 
		finally {
			System.out.println("�˼��մϴ�. ����ġ���� ������ ������ ����� �˼��մϴ�.");
		}
		
		/*catch(õ���Ѵ¿��� e) {
			System.out.println("�˼��մϴ�. ����ġ ���� ������ ������ ����� �˼��մϴ�.");
		} 
		catch (�и��0�����۰ų����������¿��� e) {
			System.out.println("�и�� 0���� Ŀ���Ѵٴϱ�!!!!");
		}*/
		
		System.out.println("����");

	}

}
