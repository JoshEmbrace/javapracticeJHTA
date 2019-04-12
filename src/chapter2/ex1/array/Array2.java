package chapter2.ex1.array;
import java.util.Random;


public class Array2 {

	//Declare a variable that holds an array of random integers.
	//Remove the duplication.

		public static void main(String[] args) {
		
			Random ran = new Random();
			int[] nums = new int[6];
			
			for(int i=0; i<6; i++) {
				nums[i] = ran.nextInt(45)+1;
				
				for(int j=0; j<i; j++) {
					
					if(nums[i]==nums[j]) {
						i--;
						break;
					}

				}
				
			}
			
			for(int i=0; i<6; i++)
				System.out.println(nums[i]);

		}

	}