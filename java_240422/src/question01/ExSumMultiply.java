package question01;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		System.out.println("3자리수 정수 입력(100~999)>> ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int one = (n%100)%10;
//		321 예시면 100으로 나누면 21이 남음 그걸 10으로 나눈 나머지는 1 즉 1의 자리가 남는다. 
		int ten = n%100/10;
//		321 예시로 100으로 나누면 21이 남고 그걸 10으로 나누면 2하고 나머지 1이 남는데 정수는 나머지를 생략함 즉 2
		int mil = n/100;
//		321 예시로 100으로 나누면 3하고 21이 나머지로 남으나 나머지는 손실됨
		System.out.println("100의 자리와 10의 자리의 합은 "+(mil+ten));
		System.out.println("10의 자리와 1의 자리의 곱은 "+(ten*one));
//		System.out.println(one);
//		System.out.println(ten);
//		System.out.println(mil);
		
	}

}
