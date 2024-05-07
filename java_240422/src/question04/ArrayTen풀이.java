package question04;

import java.util.Scanner;

public class ArrayTen풀이 {
	public static void main(String[] args) {
	
	int[] intArray = new int[10];	
	int sum=0;
	
	Scanner scanner = new Scanner(System.in);
	System.out.print(intArray.length+"개의 정수를 입력하세요>>");
	
	for (int i = 0; i < intArray.length; i++) {
		intArray[i]= scanner.nextInt();
		sum+= intArray[i];
	}
	
	System.out.print("합계는 "+sum);	
	scanner.close();/*스캐너는 메인 메소드가 끝나는 지점에서 닫자*/
	}
}
