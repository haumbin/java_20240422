package question02;

import java.util.Scanner;

public class ExGlobalStock풀이 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int purchaseAmount = 0;
		int saleAmount = 0;
		double transferTax ;
		System.out.print("매수금액을 입력하세요: ");
		purchaseAmount = scanner.nextInt();
		System.out.print("매도금액을 입력하세요: ");
		saleAmount = scanner.nextInt();
		scanner.close();
	if(saleAmount>purchaseAmount) {
		transferTax=(saleAmount-purchaseAmount)*0.22;
	}else {transferTax = 0;}
		
		
		
		System.out.println("양도세 = " + transferTax);
	}
}
