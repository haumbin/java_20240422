package question04;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
 
	Scanner scanner = new Scanner(System.in);
	System.out.print("금액을 입력하시오 >> ");
	int money = scanner.nextInt();
	scanner.close();
	int res=money/50000;
	
	if(res>0) {
		System.out.println("오만원권 "+res+"매");
	}
	
	money = money%50000;
	res = money/10000;
	
	if(res>0) {
		System.out.println("만원권 "+res+"매");
	}
	money = money%10000;
	res = money/5000;
	
	if(res>0) {
		System.out.println("오천원권 "+res+"매");
	}
	money = money%5000;
	res = money/1000;
	
	if(res>0) {
		System.out.println("천원권 "+res+"매");
	}
	money = money%1000;
	res = money/500;
	
	if(res>0) {
		System.out.println("오백원 "+res+"개");
	}
	money = money%500;
	res = money/100;
	
	if(res>0) {
		System.out.println("백원 "+res+"개");
	}
	money = money%100;
	res = money/50;
	
	if(res>0) {
		System.out.println("오십원 "+res+"개");
	}
	money = money%50;
	res = money/10;
	
	if(res>0) {
		System.out.println("십원 "+res+"개");
	}
	money = money%10;
	res = money/1;
	
	if(res>0) {
		System.out.println("일원 "+res+"개");
	}
	
	
	
}
}