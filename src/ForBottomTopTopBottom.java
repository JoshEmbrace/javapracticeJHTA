
public class ForBottomTopTopBottom {

	public static void main(String[] args) {
		for( int i=0; i<40; i++){
			
			if(i<20) {
			 	System.out.println(i+1);
			}
			
			if(19<i && i<40) {
			 	System.out.println(40-i);		 	
			}
			
		}
		
	}

}
