package question01;

import java.util.Scanner;

//class Aa{}
//class aa{}
//class Baa{
//	 public static void aaa() {}
//	 public static void aad() {}
//	 public static void aax() {}

// method 여러개 사용해도 무관
// JVM이 수많은 method 에서 main 메소드를 찾아감
//public class : 자바 파일 안에 두개이상 존재시 오류
//JVM이 수많은 class 에서 public class 를 찾아감
public class ExCalculation {
	public static void main(String[] args) {
//		System.out.print("2개의 실수 입력>>"); 무엇을 입력할지 설명잘하기
		System.out.print("2개의 실수 입력>>");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
//		float로 받아도 됨
		System.out.println("두수의 덧셈은 " + (a+b));
//		문자열로 더하니까 괄호를 사용해서 미리 덧셈을 연산
		System.out.println("두수의 뺄셈은 " + (a-b));
		System.out.println("두수의 곱셈 " + (a*b));
		System.out.println("두수의 나눗셈은 " + (a/b));
		scanner.close();
	}
}
