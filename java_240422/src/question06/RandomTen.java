package question06;

import java.util.Random;


public class RandomTen {
	public static void main(String[] args) {
		Random random = new Random();
		int sum =0;
		
		int [] intArray = new int[10];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = random.nextInt(10)+1;
			sum+=intArray[i];			
		}
		System.out.print("램덤한 정수들 : ");
		for(int number : intArray) {
			System.out.print(number+" ");
		}
		System.out.println();
		System.out.println("평균은 "+(double)sum/10);
		
	}

}
