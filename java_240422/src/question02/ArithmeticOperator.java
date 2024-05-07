package question02;
// 1분 = 60초 1시간 =60분 =3600초
import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {

		int hour=0,  min=0,  sec=0;
		System.out.print("정수를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		 scanner.close();
		
		if(time>=3600) {
			hour = time/3600;
			min = time%3600/60;
			sec = time%3600%60;
		}else if(time>=60) {
			min = time/60;
			sec = time%60;
					}else {sec = time;}
		System.out.println(time+"초는"+hour+"시간,"+min+"분,"+sec+"초입니다.");
		
	}
}
