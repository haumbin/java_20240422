package question01;

import java.util.Scanner;

public class Median풀이 {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>> ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); 
		int b = scanner.nextInt(); 
		int c = scanner.nextInt(); 
		scanner.close();
		int median=0;
		
		if((a>b && a<c)||(a>c && b>a)) {
			median= a;
		}else if((b<a && b<c )||( b>c && b<a)) {
			median=b;
		}else {
			median=c;}
System.out.println("중간 값은"+median);
}}
