package question04;

import java.util.Scanner;

/*양수 7개를 입력 받아 배열에 저장하고, 제일 작은 수를 출력하는 프로그램을 작성하라. */
public class ArrayMin {
	public static void main(String[] args) {
	
	int[] number = new int[7];
	int i;
	
	System.out.println("양수 7개를 입력하세요");
	Scanner scanner = new Scanner(System.in);
	for ( i = 0; i < number.length; i++) {
		int j;
		j = scanner.nextInt();
		if(j>=0) {
			number[i]=j;
		} else {System.out.println("양수가 아닙니다. 양수를 입력해주세요");
		scanner.close();
			i--; }
	}
	
		int min =number[0];
		
		for (int j = 0; j < number.length; j++) {
			if(min>number[j]) {
				min=number[j];
			}
		}
		
	System.out.print("가장 작은 수는 "+min+"입니다.");
	}
}

//GPT:무한히 스캐너가 열려있는 이유는 else 블록에서 i--를 사용하여 루프를 다시 실행하는 부분 때문입니다. i--를 사용하여 반복문을 재실행하는 대신에, 사용자로부터 올바른 입력을 받을 때까지 루프를 계속해서 실행하도록 변경해야 합니다.

//다음은 수정된 코드입니다:
//package question04;
//
//import java.util.Scanner;
//
///*양수 7개를 입력 받아 배열에 저장하고, 제일 작은 수를 출력하는 프로그램을 작성하라. */
//public class ArrayMin {
//	public static void main(String[] args) {
//	
//	int[] number = new int[7];
//	int i;
//	
//	System.out.println("양수 7개를 입력하세요");
//	Scanner scanner = new Scanner(System.in);
//	for ( i = 0; i < number.length; i++) {
//		int j;
//		j = scanner.nextInt();
//		if(j>=0) {
//			number[i]=j;
//		} else {System.out.println("양수가 아닙니다. 양수를 입력해주세요");
//			i--;}
//	}
//	scanner.close();
//	
//		int min =number[0];
//		
//		for (int j = 0; j < number.length; j++) {
//			if(min>number[j]) {
//				min=number[j];
//			}
//		}
//		
//	System.out.print("가장 작은 수는 "+min+"입니다.");
//	}
//}
