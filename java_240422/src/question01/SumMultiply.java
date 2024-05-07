package question01;

import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
//		System.out.print("2개의 정수 입력>>"); 무엇을 입력할지 설명잘하기
		System.out.print("2개의 정수 입력>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("두수의 합은" + (a+b));
		System.out.println("두수의 곱은" + (a*b));
		scanner.close();
	}
}
