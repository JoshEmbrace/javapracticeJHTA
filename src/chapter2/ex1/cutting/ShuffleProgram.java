package chapter2.ex1.cutting;

public class ShuffleProgram {

	public static void main(String[] args) {
		
		String[] names = new String[12] ;
		
		
		String name1 = "ȫ�浿";
		String name2 = "ȫ�浿";
		String name3 = new String("ȫ�浿");
		
		System.out.println(name1 == name2); //��ü�� ������
		System.out.println(name1 == name3);
		System.out.println(name1.equals(name3)); //���� ������
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		String meme1 = "������";
		String meme2 = "������";
		String meme3 = new String("������");
		
		System.out.println(meme1 == meme2);
		System.out.println(meme1 == meme3);
		System.out.println(meme1.equals(meme2));

		
		System.out.println();
		System.out.println();
		System.out.println();
		
		String fileName = "photo.jpg";
		String ediyaName = "Vanilla.Latte";
		System.out.println(fileName.length());
		//���� ���ϸ��� ��(.)�� �ִ� ���� ��ġ�� �� ��° ������ ����Ͻÿ�
		System.out.println(ediyaName.length());
		System.out.println(fileName.indexOf(".")); // "."�� ��ġ�� 0������ ��ġ
		System.out.println(ediyaName.indexOf("."));
		System.out.println(fileName.substring(0,3));
		System.out.println(ediyaName.substring(0,3));
		int a = fileName.indexOf(".");
		System.out.println(fileName.substring(0,a)); // 0��°
		System.out.println(ediyaName.lastIndexOf("."));
		int b = ediyaName.lastIndexOf(".");              
		System.out.println(fileName.lastIndexOf(".")); 
		//"."�� ã���� �ڿ������� ã�� �����ؼ� ó�� ã���� ��. ������ �� ��ġ�� .indexOf(".")�� ���������� �տ��� ���� ��.
		System.out.println(ediyaName.substring(b+1));
		System.out.println(fileName.substring(a+1));
		
		String data = "ȫ �浿,�� ȣ��,�� �±�,�� �缮,�� ����";
		String group3 = "�� ����,�� �Լ�,�� ����,�� ����,�� ����";
		String[] infos = data.split(",");
		String[] group3s = group3.split(",");
		System.out.println(infos[1]);
		System.out.println(infos.length);
		System.out.println(group3s[1]);
		System.out.println(group3s.length);
		for(int i=0; i<group3s.length; i++) {
			System.out.println(group3s[i]);
		}
		for(int i=0; i<infos.length; i++) {
			System.out.println(infos[i]);
		}
		
	}

}
