package chapter2.ex1.cutting;

public class ShuffleProgram {

	public static void main(String[] args) {
		
		String[] names = new String[12] ;
		
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = new String("홍길동");
		
		System.out.println(name1 == name2); //객체가 같으냐
		System.out.println(name1 == name3);
		System.out.println(name1.equals(name3)); //값이 같으냐
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		String meme1 = "오성미";
		String meme2 = "오성미";
		String meme3 = new String("오성미");
		
		System.out.println(meme1 == meme2);
		System.out.println(meme1 == meme3);
		System.out.println(meme1.equals(meme2));

		
		System.out.println();
		System.out.println();
		System.out.println();
		
		String fileName = "photo.jpg";
		String ediyaName = "Vanilla.Latte";
		System.out.println(fileName.length());
		//위의 파일명에서 점(.)이 있는 곳의 위치가 몇 번째 인지를 출력하시오
		System.out.println(ediyaName.length());
		System.out.println(fileName.indexOf(".")); // "."의 위치는 0부터의 위치
		System.out.println(ediyaName.indexOf("."));
		System.out.println(fileName.substring(0,3));
		System.out.println(ediyaName.substring(0,3));
		int a = fileName.indexOf(".");
		System.out.println(fileName.substring(0,a)); // 0번째
		System.out.println(ediyaName.lastIndexOf("."));
		int b = ediyaName.lastIndexOf(".");              
		System.out.println(fileName.lastIndexOf(".")); 
		//"."을 찾지만 뒤에서부터 찾기 시작해서 처음 찾아진 것. 하지만 그 위치는 .indexOf(".")와 마찬가지로 앞에서 부터 셈.
		System.out.println(ediyaName.substring(b+1));
		System.out.println(fileName.substring(a+1));
		
		String data = "홍 길동,강 호동,이 승기,유 재석,차 태현";
		String group3 = "오 성미,방 규석,정 지혜,이 지연,차 태현";
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
