package question03;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean multiple= false;
		System.out.print("양의 정수를 입력하세요: ");
		int number = scanner.nextInt();
		scanner.close();
		
		if(number%3==0) {
			System.out.println("3의 배수이다");
			multiple =true;
			
		}else if(number%5==0) {
			System.out.println("5의 배수이다");
			multiple = true;
		}else if(number%8==0) {
			System.out.println("8의 배수이다");
		}else if(multiple==false) {
			System.out.println("어느 배수도 아니다.");
		}
		
		
		// 불린 값이 대체 어디에 쓰이는지 잘 모르겠다
		// 3의 경우 5의 경우 8의 경우
		// 3과 5의 경우 3과 8의 경우
		// 5와 8의 경우
		// 3 5 8의 경우를 다 입력하는 노가다말고는 떠오르지 않는다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
