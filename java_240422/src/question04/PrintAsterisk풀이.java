package question04;

import java.util.Scanner;

public class PrintAsterisk풀이 {
	public static void main(String[] args) {
		System.out.print("정수를 입력하시오 >> ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
//		구구단 2중 for문 (행과 열을 출력하기)
//		행과 열 출력 2중 for문
//		감소시키는 로직을 위해서 역으로 진행
		for(int i=n; i>0; i--) {
//			하나씩 줄이기 위해 i 값 사용
			for(int j=0; j<i; j++) {
				System.out.print('*');
			}System.out.println();
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
