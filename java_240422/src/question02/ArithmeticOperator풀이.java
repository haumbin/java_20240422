package question02;
// 1분 = 60초 1시간 =60분 =3600초
import java.util.Scanner;

public class ArithmeticOperator풀이 {
	public static void main(String[] args) {

		
		System.out.print("정수를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		 scanner.close();
		int hour = time /3600; //시간
		int min = (time/60)%60; //분
		int second = time%60; //초
		
		System.out.println(time+"초는 "+hour+"시간,"+min+"분,"+second+"초입니다.");
		
	}
}
