package question03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		
		
		System.out.print("매수 수량을 입력하시오>> ");
		Scanner scanner = new Scanner(System.in);
		int j= scanner.nextInt();
		scanner.close();

		int w = j*520;
		int h= w/100;
		int t= w%100/10;
		
	if(j!=0) {
		System.out.println("100 달러짜리"+h+"매");
		if(t!=0) {System.out.println("10 달러짜리"+t+"매");}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
