package question08;

import java.util.Random;
import java.util.Scanner;

/*
 * 정수를 몇 개 저장할지 키보드로부터 개수를 입력받아
(100이하 개수) 정수 배열을 생성하고, 이곳에 1에서
100까지 범위의 정수를 랜덤하게 삽입하라.
 *.출력
 정수 몇개?24
 48 29 69 57 95 21 11 91 37 63
 56 88 20 6 81 8 4 24 7 65
 1 89 72 90
*/
public class RandomArray {
	public static void main(String[] args) {
		System.out.print("정수 몇개?");
		Scanner scanner = new Scanner(System.in);
		int input= scanner.nextInt();
		scanner.close();
		Random r = new Random();
		int[] array = new int[input];
		for (int i = 0; i < array.length; i++) {
			int R= r.nextInt(100)+1;
			array[i]= R;
			System.out.print(array[i]+" ");
			if(i%9==0&&i!=0){
				System.out.println();
				//10번씩 잘라서 출력하는 조건을 모르겠음
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
