package question02;

import java.util.Scanner;

public class ArithmeticExSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산 >> ");
		int op1 = scanner.nextInt();
		String op = scanner.next();
		int op2 = scanner.nextInt();
		int res =0;
		scanner.close();
			switch (op) {
				case "+":
				res =op1+op2;
					break;
				case "-":
					res =op1-op2;
					break;
				case "*":
					res =op1*op2;
					break;
				case "/":
					if(op2!=0&&op1!=0) {res =op1/op2;
					break;
					}
					else if(op2==0) { System.out.println("0으로 나눌 수 없습니다.");
					return;}
					else if(op1==0) { System.out.println("0으로 나눌 수 없습니다.");
					return;}
										
				default:
					System.out.println("사칙연산이 아닙니다.");
					break;
						}		
					System.out.println(op1+op+op2+"의 계산 결과는 "+res);
		
		
		
	}
}
