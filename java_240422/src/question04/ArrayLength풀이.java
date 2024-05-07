package question04;

import java.util.Scanner;

public class ArrayLength풀이 {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		int sum = intArray[0];
		
		System.out.print(intArray.length+"개의 정수를 입력하세요 >> ");
		Scanner scanner = new Scanner(System.in);
		
		
		for (int i = 0; i < intArray.length; i++) {
		// 5번 반복해서 배열원소에 정수를 저장
		intArray[i]= scanner.nextInt();
		sum+=intArray[i];
		}
		scanner.close();
	
	System.out.println("평균은 "+(double)sum/intArray.length);
	
	
	
	}
}
