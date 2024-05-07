package question02;

import java.util.Scanner;

public class ComputeBalance {
	public static void main(String[] args) {
		int purchaseAmount = 0;
		int balance = 0;
		System.out.print("구매 금액을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		purchaseAmount = scanner.nextInt();
		scanner.close();
		if(purchaseAmount>=300000) {
			balance+=(purchaseAmount-30000);
		}else if(purchaseAmount<300000&&100000<=purchaseAmount) {
			balance +=(purchaseAmount-5000);
		}else {
			balance = purchaseAmount;
		}
		
		System.out.println("구매금액 = " + purchaseAmount);
		System.out.println("청구 금액 = " + balance);
		
		
	}
}
