package question02;

import java.util.Scanner;

public class ComputeBalance풀이 {
	public static void main(String[] args) {
		int purchaseAmount = 0;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("구매 금액을 입력하세요: ");
		purchaseAmount = scanner.nextInt();
		scanner.close();
		if(purchaseAmount>=300000) {
			balance=purchaseAmount-30000;
		}else if(100000<=purchaseAmount) {
			balance =purchaseAmount-5000;
		}else {
			balance = purchaseAmount;
		}
		
		System.out.println("구매금액 = " + purchaseAmount);
		System.out.println("청구 금액 = " + balance);
		
		
	}
}
