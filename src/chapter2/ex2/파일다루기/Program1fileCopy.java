package chapter2.ex2.파일다루기;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Program1fileCopy {

	public static void main(String[] args) throws IOException {
		
		
		//1."D:\java\workspace\first.java"파일을 입력하기 위한 FileInputStream 객체를 fis 라는 이름으로 생성.
		

		FileInputStream fis = new FileInputStream("D:\\java\\workspace\\First.java");
		
		//2.위의 파일을 복사해서 사본으로 저장할 파일을 "D:\java\workspace\first_복사.java"파일로 저장하기 위한 FileOutputStream객체를 fos 라는 이름으로 생성
		

		FileOutputStream fos = new FileOutputStream("D:\\java\\workspace\\First_복사1.java");
		
		//3.파일을 복사
		// [][][][][][][][] ==> First.java가 8바이트 크기의 파일이라고 가정하면
		int b = 0;
		
		//fis.read()가 호출될 때, fis가 비어 있으면 block 상태에서 파일로부터 데이터를 가져와서 버퍼를 채움
		//예를 들어서 입력스트림 버퍼가 8바이트 버퍼라면 파일로부터 8바이트를 읽어서 버퍼를 채움
		while(b!=-1) { // read() method는 읽다가 마지막으로 읽어들일 때 -1 값을 반환하므로 정수형 변수로 사용함
			b = fis.read(); // _[][][][][][][] => 버퍼에서 첫 번째 바이트를 읽어들이고 나머지는 7개 바이트가 남음
			fos.write(b);
//			b=fis.read();  __[][][][][][] => 버퍼에서 두 번째 바이트를 읽어들이고 나머지는 6개 바이트가 남음
//			fos.write(b);     
		}
		
		
		//4. fis 와 fos를 닫는 코드를 작성한다.
		
		fos.close();
		
		fis.close();
		
		System.out.println("복사완료");
		
	}

}
