package question04;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
	
	int[] intArray = new int[10];	
	int sum=0;
	System.out.print("정수를 입력하세요>>");	
	Scanner scanner = new Scanner(System.in);
	for (int i = 0; i < intArray.length; i++) {
		intArray[i]= scanner.nextInt();
		sum+= intArray[i];
	}
	scanner.close();
	System.out.print("합계는 "+sum);	
	}
}
