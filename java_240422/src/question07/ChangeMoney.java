package question07;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int a = scanner.nextInt();
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for (int i = 0; i < unit.length; i++) {
			
			int won =a/unit[i]; 
			int b = a%unit[i];
			if(b>0) {a=a%unit[i];}
//			if(b!=0) {System.out.println(unit[i]+"원 짜리 : "+won+ "개");}
			if(won>0) {System.out.println(unit[i]+"원 짜리 : "+won+ "개");}// 풀이보고 적용
		}
		scanner.close();
	}
}

//값이 없을 때도 출력되는 문제
//1원 값이 씹힘