package chapter3.ex6.oop.abtract.ybm;

import chapter3.ex6.oop.abtract.Exam;

public class YBMExam extends Exam {
	
	private int toeic;
	
	public int getToeic() {
		return toeic;
	}
	public void setToeic(int toeic) {
		this.toeic = toeic;
	}
	public YBMExam(int kor, int eng, int math, int toeic) {
		super(kor, eng, math);
		this.toeic = toeic;
		
	}
	public YBMExam() {
		this(0,0,0,0);
		
	}

	@Override
	public float avg() {
		
		return 0;
		
	}

	@Override
	public int total() {
		//return getKor() + getEng() + getMath() + toeic;
		return baseTotal() + toeic;
		
	}

}
