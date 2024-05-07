package question03;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		System.out.print("10~99 사이의 정수를 입력하시오 >> ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		if(number>=10&&number<100) {if(number/10==3||number/10==6||number/10==9) {
			if(number%10==3||number%10==6||number%10==9) {
			System.out.println("박수짝짝");
			}else {System.out.println("박수짝");}
			
		}else {if(number%10==3||number%10==6||number%10==9) {
			System.out.println("박수짝");}else {}}
		
			
		}else {
			System.out.println("10~99 사이의 정수를 입력해 주세요");
		}
	
		
	}

}
