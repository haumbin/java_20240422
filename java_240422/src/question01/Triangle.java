package question01;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int a=0, b=0, c=0;
		
		System.out.print("정수 3개를 입력하시오>>" );
		Scanner scanner = new Scanner(System.in);
				a = scanner.nextInt();
				b = scanner.nextInt();
				c = scanner.nextInt();
				scanner.close();
	
	if((a+b)>c&&(b+c)>a&&(c+a)>b) {
		System.out.println("삼각형이 됩니다.");
	} else {
		System.out.println("삼각형이 될 수 없습니다.");
	}
	
	
	
	
	
	}

}
