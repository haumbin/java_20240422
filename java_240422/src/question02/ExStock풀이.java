package question02;

import java.util.Scanner;

public class ExStock풀이 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("코스피 지수를 입력하세요(1800~2500)");
		int kospi = scanner.nextInt();
		System.out.print("환율을 입력하세요(1100~1200)");
		int rate = scanner.nextInt();
		scanner.close();
		
		if(rate <1150) {
			if(kospi>=2300)/*?2300?**/ {System.out.println("상승장");}
			else if(kospi>=2000) {
				System.out.println("횡보장");}
			else {System.out.println("하락장");}
		}
		else {if(kospi>=2200){
			System.out.println("상승장");}
		else if(kospi>=2000) {
			System.out.println("횡보장");
			}else {
				System.out.println("하락장");}
	}		
	
	}
}


