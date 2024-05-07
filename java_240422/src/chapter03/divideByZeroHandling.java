package chapter03;

import java.util.Scanner;

public class divideByZeroHandling {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;
		
		while (true) {
			
		System.out.print("분자를 입력하시오: ");
		dividend = scanner.nextInt();
		System.out.print("분모를 입력하시오: ");
		divisor = scanner.nextInt();
		
//		 불능일 때 정상적인 메시지로 처리
		try {
//		불능이 발생할 수 있는 실행문(오류 발생 가능성이 있는 실행문)	
			System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
			break; // 브레이크를 통해 무한 반복에서 올바른 결과가 나올 시 반복문에서 나옴
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
		}
	}
		scanner.close(); //무한반복이라 도달할 수 없어서 오류
	}	
}

		
	



