package question02;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int buy = 0;
		int sell = 0;
		double tax = 0;
		System.out.print("매수금액을 입력하세요: ");
		buy = scanner.nextInt();
		System.out.print("매도금액을 입력하세요: ");
		sell = scanner.nextInt();
		scanner.close();
	if(sell>buy) {
		tax=(sell-buy)*22/100;
	}else {}
		
		
		
		System.out.println("양도세 = " + tax);
	}
}
