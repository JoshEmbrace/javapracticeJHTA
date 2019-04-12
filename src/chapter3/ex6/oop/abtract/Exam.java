package chapter3.ex6.oop.abtract;

public abstract class Exam { //틀로만 쓸 수 있게 만듦. (new로 객체화 못함)
	
	private int kor;
	private int eng;
	private int math;
	
	public Exam() { //생성자함수는 다시 쓸 일(부를 일)이 없으므로 함수이름이 없다
		/* 그래서 Exam이라는 객체의 이름(한정사)을 써준거임
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
	public abstract float avg(); //구현을 '강요'하도록 자동으로 빨간줄이 그어짐
	
}
