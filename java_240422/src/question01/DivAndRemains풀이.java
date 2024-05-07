package question01;

import java.util.Scanner;

public class DivAndRemains풀이 {
	public static void main(String[] args) {
		System.out.println("2자리수 정수 입력(10~99)>> ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
//		11로 나누었을 때 나머지가 없으면 10과 1의자리 수가 같다.
//		10의 자리 : 나누기 10을 해서 몫
//		1의 자리 : 나누기 10을 해서 나머지
		int ten = n/10;
		int one =n%10;
		
		if(ten == one) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
	}

}
