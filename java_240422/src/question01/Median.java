package question01;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>> ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); 
		int b = scanner.nextInt(); 
		int c = scanner.nextInt(); 
		scanner.close();
		
		
		if((a<b && c<a&&c<b)||(a<c && b<a&&b<c)) {
			System.out.println("중간 값은" +a);
		}else if((a<b && c>b&&a<c )||( c<b && b<a&&c<a )) {
			System.out.println("중간 값은" +b);
	} else if( ( a < c && c < b&&a<b )||( b < c && c < a&&b<a)){
		System.out.println("중간 값은" +c);}
	else {System.out.println("중복되지 않는 수를 입력해 주세요");}

}}
