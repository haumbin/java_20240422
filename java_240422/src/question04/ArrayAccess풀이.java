package question04;

import java.util.Scanner;


public class ArrayAccess풀이 {
	public static void main(String[] args) {
	int max=0;
	Scanner scanner = new Scanner(System.in);
	int [] intArray = new int[5];
	System.out.println("양수 5개를 입력하세요.");
	
	for (int i = 0; i < intArray.length; i++) {
//		5번 반복해서 양수 5개를 배열원소에 저장 거쳐갈 필요없이 바로 담을 수 있음
		intArray[i] = scanner.nextInt();
		}
	scanner.close();
	
	for (int i = 0; i < intArray.length; i++) {
		if(intArray[i]>max) {
			max = intArray[i];
		}
			
	}
	
System.out.println("가장 큰 수는 " +max + "입니다.");
	}
}

