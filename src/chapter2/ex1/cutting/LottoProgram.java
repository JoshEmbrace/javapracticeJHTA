package chapter2.ex1.cutting;

import java.util.Random;

public class LottoProgram {

	public static void main(String[] args) {
		
		//�ζ� ���α׷�
		//1. �غ�
		//���� : ��ȣ�� ������ �� �ִ� ����
		//�Է¹޴� ��ȣ (����ڷκ��� �޾ƾ� �� ��ȣ : 6��)
		//int[] lotto.
		Random rand = new Random();
		
		//2.�ʱ�ȭ : �ζ� ��ȣ�� �ʱ�ȭ
		for(int i =0; i<6; i++) {
			int x = rand.nextInt(45)+1;
			
			System.out.printf("%d ", x);
		}
		

		
		
		//4.���
		
		

	}

}
