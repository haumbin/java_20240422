package question04;

import java.util.Scanner;


public class ArrayAccess {
	public static void main(String[] args) {
	int max;
		System.out.println("양수 5개를 입력하세요.");
	Scanner scanner = new Scanner(System.in);
	int [] number = new int[5];
	for (int i = 0; i < number.length; i++) {
		int n = scanner.nextInt();
		number[i]= n;
	}/*정수를 배열에 담기*/
/*제일 큰 수라는 것을 어떻게 표현하지?*/
	if(number[0]>number[1]&&number[0]>number[2]&&number[0]>number[3]&&number[0]>number[4]) {
		 max = number[0];
	}else if(number[1]>number[0]&&number[1]>number[2]&&number[1]>number[3]&&number[1]>number[4]) {
		 max = number[1];}
	else if(number[2]>number[0]&&number[2]>number[1]&&number[2]>number[3]&&number[2]>number[4]) {
		max = number[2];}
	else if(number[3]>number[0]&&number[3]>number[1]&&number[3]>number[2]&&number[3]>number[4]) {
		max = number[3];}
	else {
		max = number[3];}
scanner.close();
System.out.println("가장 큰 수는 " +max + "입니다.");


//GPT버전
//public class ArrayAccess {
//	public static void main(String[] args) {
//		System.out.println("양수 5개를 입력하세요.");
//	Scanner scanner = new Scanner(System.in);
//
//	int i =0;
//	
//	int [] number = new int[5];
//	
//	
//	for ( i = 0; i < number.length; i++) {
//		int n = scanner.nextInt();
//		number[i]= n;}
//	scanner.close();
//	int max = number[0];
//	for (  i = 1; i < number.length; i++) {
//        if (number[i] > max) {
//            max = number[i];
//        }
//    }
//	
//System.out.println("가장 큰 수는 " + max + "입니다.");
//
//






}
}
