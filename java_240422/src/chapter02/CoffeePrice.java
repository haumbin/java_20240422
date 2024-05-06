package chapter02;

import java.util.Scanner;

public class CoffeePrice {
	public static void main(String[] args) {
		System.out.print("무슨 커피 드릴까요?");
		Scanner scanner = new Scanner(System.in);
//		next() : 문자열을 입력받는 메소드
		String order = scanner.next();
		scanner.close();
//		커피가격 변수 선언
		int price = 0;
		
		switch (order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price=3500;
			break;
		case "아메리카노":
			price=2000;
			break;

//		default:
//			break;
//			디폴트는 생략가능
		default:
			System.out.println ("메뉴에 없습니다!");
				
			break;
			}
		if(price !=0) { 
		System.out.println(order+"의 가격은 "+ price +"원 입니다.");}
	}}
