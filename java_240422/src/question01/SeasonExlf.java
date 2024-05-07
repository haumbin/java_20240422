package question01;

import java.util.Scanner;

public class SeasonExlf {
	public static void main(String[] args) {
		System.out.print("달을 입력하세요(1~12) >> ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		scanner.close();
		String season;
		
		if(month <6&&2<month) {
			season = "봄";
		}  else if (month < 9 && 5 < month){
			season = "여름";}
			else if ( month < 12 && 8 < month){
				season = "가을";
		}else {
			season = "겨울";
	}
		System.out.println(month+"월은 "+season+"입니다.");
			}}

