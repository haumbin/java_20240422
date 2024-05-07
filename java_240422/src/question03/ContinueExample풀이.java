package question03;

import java.util.Scanner;

public class ContinueExample풀이 {
	public static void main(String[] args) {
		int n, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요");
		
		for(int i=0; i<5; i++){
			 n = scanner.nextInt();
//			 i++증감쪽으로 이동
			 if(n<=0) {continue;}
			 else {sum+=n;}}
//			양수일때
//			 if(n>0) {
//				sum +=n;}
//			}
		scanner.close();
		System.out.println("양수의 합은 "+sum);
		}
}
		
		
		
		
		
		
		
		
