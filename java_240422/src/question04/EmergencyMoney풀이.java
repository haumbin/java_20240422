package question04;

import java.util.Scanner;

public class EmergencyMoney풀이 {
	public static void main(String[] args) {
		// 상수로 100달러 원화 계산
		final int hundred=120000;
		final int ten=12000;
		int res, money, num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가구수를 입력하시오>> ");
		 num = scanner.nextInt();
		scanner.close();
		
		if(num ==1) {
			money=400000;
		}else if(num == 2) {
			money =600000;
		}else if(num == 3 ) {
			money =800000;
		}else {
			money = 1000000;
		}
		
		res = money/hundred;
		
//		100달러짜리가 1매 이상일 때
		if(res>0) {
			System.out.println("100달러짜리 "+res+"매");
		}
//		나머지 돈을 다시 셋팅
		 money = money%hundred;
		 
		 res = money/ten;
		 
//		 10달러짜리가 1매 이상일 때
		if(res>0) {
			System.out.println("10달러짜리 "+res+"매");
		}
	}
}