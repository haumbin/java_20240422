package chapter02;

import java.util.Scanner;

/*
 * 점수를 입력받아서 80점 이상이면 합격
 * */
public class SuccessOrFail {
	public static void main(String[] args) {
		System.out.println("점수를 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		int score =	scanner.nextInt();
		if(score >= 80) {
			System.out.println("축하합니다! 합격입니다.");}
		if(score >= 80) System.out.println("축하합니다! 합격입니다.");
		scanner.close();

	if(score >= 80) {
	System.out.println( score+"축하합니다!");}
//	한줄만 중괄호 생략시 적용됨
	System.out.println( score+"합격입니다.");
	System.out.println("입니다.");
}}
