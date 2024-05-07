package question02;

import java.util.Scanner;

public class ArithmeticExSwitch풀이 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산 >> ");
		int op1 = scanner.nextInt();
		String op = scanner.next();
		int op2 = scanner.nextInt();
		int res =0;
		scanner.close();
			switch (op) {
				case "+": res =op1+op2; break;
				case "-":
					res =op1-op2;
					break;
				case "*": res =op1*op2;	break;
				case "/":
					if(op2!=0) {res =op1/op2;
					break;
					}
					else if(op2==0) { System.out.println("0으로 나눌 수 없습니다.");
					return;}
//										분모가 0일때만 계산이 안됨 분자가 0인건 상관없음
				default: System.out.println("사칙연산이 아닙니다."); return;}		
					System.out.println(op1+op+op2+"의 계산 결과는 "+res);
		
		
		
	}
}
