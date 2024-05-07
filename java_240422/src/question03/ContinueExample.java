package question03;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		int a= 0;
		int sum = 0;
		System.out.println("정수를 5개 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<5; i++){
			 a = scanner.nextInt();
			if(a>0) {
				sum = sum+a;}else {continue;}
			}
		scanner.close();
		System.out.println("양수의 합은 "+sum);
		}
}
		
		
		
		
		
		
		
		
