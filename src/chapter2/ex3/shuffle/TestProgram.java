package chapter2.ex3.shuffle;

import java.util.Random;

public class TestProgram {

	public static void main(String[] args) {
		
		//Course cls; //Value type Variable. Reference Type Variable
		
		//cls = new Course();
		/*
		클래스 cls = new 클래스();
		
		cls.id = 3;
		cls.name = "자바 풀스택";
		
		클래스[] classes = new 클래스[10];
		
		classes[0] = new 클래스();
		classes[0].id = 3;

		
		
		클래스 classes0, classes1, classes2, classes3;
		
		classes0 = new 클래스();
		classes0.id = 3;
		
		
		클래스[] classess = new 클래스[4];
		
		for(int i=0; i<4; i++) {
			classess[i] = new 클래스();
			//classess[i].id=3;
			System.out.println(classess[i]);
		}
		*/
		/*
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		int[] nums2 = new int[20];
		
		//1. nums2의 값들을 출력
		for(int i=0; i<20; i++)
			System.out.printf("%d ", nums2[i]);
		
		System.out.println();
		
		for(int i=0; i<nums2.length; i++)
			System.out.printf("%d ", nums2[i]);
		*/
		/*
		int[] nums = {3,4,5,2,12,23,55,75};
		//문제 : nums 배열에서 55 값을 찾아서 그 인덱스 (위치)를 출력하시오
		for(int i=0; i<8; i++) {
			if(nums[i]==55) {
				System.out.printf("nums[%d]", i);
			}
				
		}
		*/
		
		int[][] lottos = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] temp = new int[3][3];
		
		temp[0] = lottos[2];
		lottos[2] = lottos[0];
		lottos[0] = temp[0];

		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
				System.out.print(lottos[i][j]);
		}
		
		/*
		int[] temp; 
	      int[][] lottos = {{1,2,3},{4,5,6},{7,8,9}};
	      
	      temp=lottos[0];
	      lottos[0] = lottos[2];
	      lottos[2] = temp;
	       System.out.printf("%d ",lottos[0][2]);
	      
	      for(int i=0;i<3; i++) {
	         for(int j=0; j<3; j++)
	          System.out.printf("%d ", lottos[i][j]);
	      }
		*/
		/*
		
		int[] nums1 = {1,2,3};
		int[] nums2 = {4,5,6};
		int[] nums = new int[6];
		
		for(int i=0; i<nums.length; i++) {
			if( i<nums1.length)
				nums[i] = nums1[i];
			else
				nums[i] = nums2[i-nums1.length];
		}
		
		
		for(int j=0; j<nums.length; j++)
			System.out.printf("%d ", nums[j]);
		
		*/
		/*
		 int[] nums1 = {1,2,3};
      int[] nums2 = {4,5,6};
      
      int[] nums = new int[6];
      
      int j=0;
      for(int i=0; i<nums.length; i++)
      {
         if(i<3)
            nums[i] = nums1[i];
         else 
         {
            nums[i] = nums2[j];
            j++;
         }
      }
      
      for(int k=0; k<nums.length; k++)
         System.out.printf("%d ", nums[k]);
		 */
/*		
		
//		System.out.println();
//		for(int j=0; j<10; j++)
//			nums2[j] = nums[j];
		
		
		//2. nums의 값들을 출력 nums2로 이주시키고
		System.out.println();
		for(int j=0; j<nums.length; j++)
			nums2[j] = nums[j];
		
//		for(int k=0; k<10; k++)
//			System.out.printf("%d", nums2[k]);
		
		//3. nums2의 값들을 출력
		for(int k=0; k<nums2.length; k++)
			System.out.printf("%d ", nums2[k]);
*/		
		
		/*
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<10; i++)
			System.out.printf("%d ", nums[i]);
		
		System.out.println();
		
		Random rand = new Random(); 
		
		int leftIdx = rand.nextInt(10);
		int rightIdx = rand.nextInt(10);
	
		
		//두 인덱스 위치의 값을 바꾸기
		int a;
		a = nums[leftIdx];
		nums[leftIdx] = nums[rightIdx];
		nums[rightIdx] = a;
		
		for(int i=0; i<10; i++)
			System.out.printf("%d ", nums[i]);
			
		 */
//		classess[0] = new Course();
//		classess[0].id = 3;
		
		
	}

}
