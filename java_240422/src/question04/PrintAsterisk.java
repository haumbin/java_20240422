package question04;

import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		System.out.print("정수를 입력하시오 >> ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		for(int i=number; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}System.out.println();
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
