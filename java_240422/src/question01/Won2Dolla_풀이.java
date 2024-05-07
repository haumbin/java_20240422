package question01;

import java.util.Scanner;

public class Won2Dolla_풀이 {
//	int rate=1100;
//	환율 고정할 때 상수 사용(관습적으로 대문자)
	public static void main(String[] args) {
//		final int RATE=1100;
		final double RATE=1100;
		Scanner scanner = new Scanner(System.in);
	System.out.print("원화를 입력하세요(단위 원)>> ");
	int won = scanner.nextInt();
//	int dollar = won/ RATE;
	double dollar = won/ RATE;
	System.out.println(won+"원은 $"+dollar+"입니다.");
	scanner.close();
	}
	
}
