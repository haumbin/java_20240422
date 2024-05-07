package question01;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		int d = 1200;
		int e = 1500;
		
		System.out.print("원화를 입력하세요(단위 원)>> ");
		Scanner scanner = new Scanner(System.in);
		int won = scanner.nextInt();
		double euro = (double)won/e;
		double coin = (double)won/d;
		scanner.close();
		System.out.println(won+"원은 "+"$"+coin+"입니다.");
		System.out.println(won+"원은 "+"E"+euro+"입니다.");
	}
}
