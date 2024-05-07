package question03;

import java.util.Scanner;

public class BreakExample풀이 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("exit을 입력하면 종료합니다.");
//	무한반복 : 반복횟수는 알수 없음(exit가 나오면 break)		
		while (true/*무한 반복은 트루*/) {
			System.out.print(">>"); 
			String text = scanner.next();
		// 문자의 값을 비교할 때는 문자열 변수.equals(값)
//			 즉 while 의 조건을 나중에 만드는 것이 성립?
			if(text.equals("exit")) {break;}
									}
		System.out.println("종료합니다...");
		scanner.close();
	}
}
	
	
	
	
	
	
	
	
	
		
