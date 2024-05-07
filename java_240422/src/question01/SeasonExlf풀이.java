package question01;

import java.util.Scanner;

public class SeasonExlf풀이 {
	public static void main(String[] args) {
		System.out.print("달을 입력하세요(1~12) >> ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		scanner.close();
		
		if(month <=5&&3<=month) {
			System.out.println("봄");
		}  else if (month <= 8 && 6 <= month){
			System.out.println("여름");}
			else if ( month <= 11 && 9 <= month){
				System.out.println("가을");}
				else if ( month == 12 || month ==1||month==2){
					System.out.println("겨울");
		}else {
			System.out.println("잘못입력");
	}
				}}
		
			
