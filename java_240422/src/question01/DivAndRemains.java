package question01;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		System.out.println("2자리수 정수 입력(10~99)>> ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
//		11로 나누었을 때 나머지가 없으면 10과 1의자리 수가 같다.
		if(number%11 == 0) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
	}

}
