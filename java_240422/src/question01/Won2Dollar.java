package question01;

import java.util.Scanner;

public class Won2Dollar {
	
	public static void main(String[] args) {
	System.out.print("원화를 입력하세요(단위 원)>> ");
	Scanner scanner = new Scanner(System.in);
	int won = scanner.nextInt();
	double coin =	(double)won;
	double dollor = change(coin);
	System.out.println(won+"원은 $"+dollor+"입니다.");
	scanner.close();
	}
	
	public static double change(double d) {
		double f = (d/1100);
		return f;	
	} 
}
