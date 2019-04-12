package chapter3.ex6.oop.abtract;

public abstract class Exam { //Ʋ�θ� �� �� �ְ� ����. (new�� ��üȭ ����)
	
	private int kor;
	private int eng;
	private int math;
	
	public Exam() { //�������Լ��� �ٽ� �� ��(�θ� ��)�� �����Ƿ� �Լ��̸��� ����
		/* �׷��� Exam�̶�� ��ü�� �̸�(������)�� ���ذ���
		this.kor = 0;
		this.eng = 0;
		this.math = 0; 
		*/
		this(0,0,0); 
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setKor() {
		this.setKor(0);
	}
/*	public int total() {
		return kor+eng+math;
	}
	*/
	protected int baseTotal() {
		return kor+eng+math;
	}
	
/*	public float avg() {
		return total() / 3.0f;
	}*/
	public abstract int total();
	public abstract float avg(); //������ '����'�ϵ��� �ڵ����� �������� �׾���
	
}
