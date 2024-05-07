package question04;


import java.util.Scanner;

/*양수 7개를 입력 받아 배열에 저장하고, 제일 작은 수를 출력하는 프로그램을 작성하라. */
public class ArrayMin풀이 {
	public static void main(String[] args) {
//	int min=0;
//	2번째 방법
		int min = Integer.MAX_VALUE;
	Scanner scanner= new Scanner(System.in);
	System.out.println("양수 7개를 입력하세요");
	int[] intArray = new int[7]; //배열 생성
		
	for (int i = 0; i < intArray.length; i++) {
			intArray[i]=scanner.nextInt();
//			첫번째 방법
//			if(i==0) {
//				min = intArray[i]; //첫 반복할 때 무조건 배열원소를 min에 저장하고 시작하기
			if(intArray[i] <min) {
				min = intArray[i];
			}
	}
		
	System.out.println("가장 작은 수는 "+min+"입니다.");
	scanner.close();
	}
}
