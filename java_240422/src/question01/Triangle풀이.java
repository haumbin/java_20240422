package question01;

import java.util.Scanner;

public class Triangle풀이 {

	public static void main(String[] args) {
		
		
		System.out.print("정수 3개를 입력하시오>>" );
		Scanner scanner = new Scanner(System.in);
			int	l1 = scanner.nextInt();
			int	l2 = scanner.nextInt();
			int	l3 = scanner.nextInt();
				scanner.close();
	
	if((l1+l2)>l3&&(l2+l3)>l1&&(l3+l1)>l2) {
		System.out.println("삼각형이 됩니다.");
	} else {
		System.out.println("삼각형이 될 수 없습니다.");
	}
	
//	거꾸로도 가능 안되는 조건을 두고 아닐 경우 삼각형이 될 수 있다고 출력하기
	
	
	
	}

}
