package question01;

import java.util.Scanner;

public class SeasonExSwitch {
	public static void main(String[] args) {
		System.out.println("달을 입력하세요(1~12)>> ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		scanner.close();
		
//		switch (month) {
//		
//		case (12):
//			System.out.println("겨울");
//		break;
//		
//		case (1):
//			System.out.println("겨울");
//		break;
//			
//		case (2):
//			System.out.println("겨울");
//				break;
//		case (3):
//			System.out.println("봄");
//		break;
//		case (4):
//			System.out.println("봄");
//		break;
//		case (5):
//			System.out.println("봄");
//		break;
//		case (6):
//			System.out.println("여름");
//		break;
//		case (7):
//			System.out.println("여름");
//		break;
//		case (8):
//			System.out.println("여름");
//		break;
//		case (9):
//			System.out.println("가을");
//		break;
//		case (10):
//			System.out.println("가을");
//		break;
//		case (11):
//			System.out.println("가을");
//		break;
//
//		default:
//			System.out.println("잘못입력");
//			break;
//		}
		
		
		
		switch (month) {
		
		case (12):
//		
		case (1):
			
		case (2):
			System.out.println("겨울");
		break;
		case (3):
			
		case (4):
		
		case (5):
			System.out.println("봄");
		break;
		case (6):
			
		case (7):
			
		case (8):
			System.out.println("여름");
		break;
		case (9):
			
		case (10):
			
		case (11):
			System.out.println("가을");
		break;
		
		default:
			System.out.println("잘못입력");
			break;
		}
//		또는 입력값을 달로 하지말고 범위로 따로 변수를 만든 뒤에? 그 범위 안일시 출력하게하면 5개로 케이스를 줄일 수 있을 것
		
		
		
		
		
		
		
	}
}
