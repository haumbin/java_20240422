package question01;

import java.util.Scanner;

public class ExExchange풀이 {
	public static void main(String[] args) {
		final double DOLLAR_RATE = 1200.0;
		final double EURO_RATE = 1500.0;

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>> ");
		int won = scanner.nextInt();
		scanner.close();
		double euro = won/EURO_RATE;
		double dollar = won/DOLLAR_RATE;
		System.out.println(won+"원은 "+"$"+dollar+"입니다.");
		System.out.println(won+"원은 "+"E"+euro+"입니다.");
	}
}
