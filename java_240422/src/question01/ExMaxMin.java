package question01;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력 >> ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		int max=0;
		int min=0;
		if(a<b&&a<c&&b<c) {
			max =c;
			min =a;
		} else if(a<b&&a<c&&c<b) {
			max =b;
			min =a;
		}else if(b<a&&c<a&&b<c) {
			max =a;
			min =b;
		}else if(b<a&&a<c&&b<c) {
			max =c;
			min =b;
		}else if(c<a&&c<b&&b<a) {
			max =a;
			min =c;
		}else if(c<b&&c<a&&a<b) {
			max =b;
			min =c;
		} else {
			System.out.println("중복되지 않는 숫자를 입력해 주세요");
		}
		if((a<b&&a<c&&b<c)||(a<b&&a<c&&c<b)||(b<a&&c<a&&b<c)||(b<a&&a<c&&b<c)||(c<a&&c<b&&b<a)||(c<b&&c<a&&a<b))
		{System.out.println("최대값은 "+ max +"최소값은"+ min);}
	else {}

	}}




//public class ExMaxMin {
//	public static void main(String[] args) {
//		System.out.print("정수 3개 입력 >> ");
//		Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		int c = scanner.nextInt();
//		scanner.close();
//
//		int max = a;
//		int min = a;
//
//		// 최대값 구하기
//		if (b > max) max = b;
//		if (c > max) max = c;
//
//		// 최소값 구하기
//		if (b < min) min = b;
//		if (c < min) min = c;
//
//		if (a != b && a != c && b != c) {
//			System.out.println("최대값은 " + max + "이고, 최소값은 " + min + "입니다.");
//		} else {
//			System.out.println("중복되지 않는 숫자를 입력해 주세요.");
//		}
//	}
//} 챗 gpt의 실력
