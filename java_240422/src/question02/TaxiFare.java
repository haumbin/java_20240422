package question02;

import java.util.Scanner;

public class TaxiFare {
	public static void main(String[] args) {
		int fare = 0;
		int income = 0;
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.print("요금을 입력하세요: ");
			fare = scanner.nextInt();
			income+=fare;			
		
		}
		System.out.println("총 수입: "+income);
		scanner.close();/*스캐너 반복문안에 생성까지 넣을필요없음*/
	}

}
//public class TaxiFare { gpt는 요렇게
//	public static void main(String[] args) {
//		int fare = 0;
//		int income = 0;
//			Scanner scanner = new Scanner(System.in);
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.print("요금을 입력하세요: ");
//			fare = scanner.nextInt();
//			income+=fare;					
//		}
// 			scanner.close();
//		System.out.println("총 수입: "+income);
//	}
//	
//}
