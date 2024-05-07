package question03;

import java.util.Scanner;

public class Multiple풀이 {
	public static void main(String[] args) {
		
	int number;
	boolean multiple;
	multiple= false;
	
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("양의 정수를 입력하세요: ");
	number = scanner.nextInt();
	// 3의 배수(아닌 경우(5의 배수 or not(8의 배수 or net)))
//		if else if (if else(if else))
		if(number %3 ==0) {
			System.out.println("3의 배수이다.");
			multiple=true;
		}
		if(number %5 ==0) {
			System.out.println("5의 배수이다.");
			multiple=true;
		}
		if(number %8 ==0) {
			System.out.println("8의 배수이다.");
			multiple=true;
		}
		// 3 5 8 배수의 조건이 하나도 아닐때
		if(multiple==false) {
			System.out.println("어느 배수도 아니다.");
			
		}
				
		scanner.close();
	}
}
