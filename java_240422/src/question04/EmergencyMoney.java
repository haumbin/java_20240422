package question04;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		System.out.print("가구수를 입력하시오>> ");
		Scanner scanner = new Scanner(System.in);
		int fam = scanner.nextInt();
		scanner.close();
		
		int won; //받는 돈
		if(fam>0&&fam<2) {
			won=400_000;
		}else if(fam<3) {
			won=600_000;
		}else if(fam<4) {
			won=800_000;
		}else {
			won=1_000_000;
		}
		
		int dol= won/1200; //달러
		
		int res = dol/100;
		if(res>0) {
			System.out.println("100달러짜리 "+res+"매");
		}
		 res = dol%100/10;
		if(res>0) {
			System.out.println("10달러짜리 "+res+"매");
		}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
