package question01;

import java.util.Scanner;

// 삼각형 밑 높 나누기 2 사다리꼴 위 아래 더하기 곱 높이 나누기 2
public class ExArea {
	public static void main(String[] args) {
		int a =0, b=0, c=0;
		System.out.println("정수를 입력하시오>> ");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		scanner.close();
		double tri = a*b/2;
		double sq = (a+b)*c/2;
		if(c==0) {
			System.out.println("삼각형의 넓이는"+ tri);
		} else {
			System.out.println("사다리꼴의 넓이는"+ sq);
		}
}
}
