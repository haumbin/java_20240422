package question02;
/*
 * if(op.equals("+")){ 만약 문자가 +와 같다면
 * res = op1+op2;} 변수에 더하기 연산한 값을 담자
 * **/
import java.util.Scanner;

public class ArithmeticExlf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("연산 >> ");
		int a =scanner.nextInt();
		String c =scanner.next();
		int b =scanner.nextInt();
		int resault =0;
		scanner.close();
		
		if(c.equals("+")) {
			resault= a+b;
		}else if(c.equals("-")) {
			resault= a-b;
		}else if(c.equals("*")) {
			resault= a*b;
		}else if(c.equals("/")) {
			resault= a/b;
		}else if(c.equals("/")&&a==0||b==0){
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		 {System.out.println(a+c+b+"의 계산 결과는 " +resault);}
	
		
		
	}

}
