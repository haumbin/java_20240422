package question04;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int[] Array = new int[5];
		int sum = Array[0];
		
		System.out.print("5개의 정수를 입력하세요 >> ");
		Scanner scanner = new Scanner(System.in);
		
		
		for (int i = 0; i < Array.length; i++) {
		Array[i]= scanner.nextInt();
		sum+=(double)Array[i];
		}
		scanner.close();
		double ave =sum/Array.length;
	
			System.out.println("평균은 "+ave);
	
	
	
	}
}
