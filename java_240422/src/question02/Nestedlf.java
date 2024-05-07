package question02;

import java.util.Scanner;

public class Nestedlf {
	public static void main(String[] args) {
		int c = 0;
		int g = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100)");
		c = scanner.nextInt();
		System.out.print("학년을 입력하세요(1~4)");
		g = scanner.nextInt();
		scanner.close();
	if(g==4&&c>=70) {System.out.println("합격");}
	else if(g==4&&c<=70) {System.out.println("불합격!");}
	 else if(g<4&&c>=60) {System.out.println("합격");} 
	else { System.out.println("불합격!");}
		
	

	}
		

}
