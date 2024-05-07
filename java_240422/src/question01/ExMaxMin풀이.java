package question01;

import java.util.Scanner;

public class ExMaxMin풀이 {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력 >> ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		int max=0;
		int min=0;
		
		if(a>b && a<c) {
			max= a;
		}else if(b>a && b>c) {
			max= b;
		}else {max=c;}
		if(a<b && a<c) {
			min= a;
		}else if(b<a && b<c) {
			min= b;
		}else {min=c;}
		
		System.out.println("최대값은 "+max);
		System.out.println("최소값은 "+min);
		
		
	}
}
		
		
//		if(a<b&&a<c&&b<c) {
//			max =c;
//			min =a;
//		} else if(a<b&&a<c&&c<b) {
//			max =b;
//			min =a;
//		}else if(b<a&&c<a&&b<c) {
//			max =a;
//			min =b;
//		}else if(b<a&&a<c&&b<c) {
//			max =c;
//			min =b;
//		}else if(c<a&&c<b&&b<a) {
//			max =a;
//			min =c;
//		}else if(c<b&&c<a&&a<b) {
//			max =b;
//			min =c;
//		} else {
//			System.out.println("중복되지 않는 숫자를 입력해 주세요");
//		}
//		if((a<b&&a<c&&b<c)||(a<b&&a<c&&c<b)||(b<a&&c<a&&b<c)||(b<a&&a<c&&b<c)||(c<a&&c<b&&b<a)||(c<b&&c<a&&a<b)) {System.out.println("최대값은 "+ max +"최소값은"+ min);}
//	else {}
//
//	}}
