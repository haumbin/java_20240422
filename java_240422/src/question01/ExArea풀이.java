package question01;

import java.util.Scanner;

// 삼각형 밑 높 나누기 2 사다리꼴 위 아래 더하기 곱 높이 나누기 2
public class ExArea풀이 {
	public static void main(String[] args) {
		System.out.println("정수를 입력하시오>> ");
		Scanner scanner = new Scanner(System.in);
		
		int l1 = scanner.nextInt();
		int l2 = scanner.nextInt();
		int l3 = scanner.nextInt();
		scanner.close();
//		마지막 숫자가 0이면 삼각형 넓이
		if(l3==0) {
			float triangle =(l1*l2)/2;
			System.out.println("삼각형의 넓이는"+ triangle);
		} else {
			float trapezium= (l1+l2)*l3/2;
			System.out.println("사다리꼴의 넓이는"+ trapezium);
		}
}
}
