package question01;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		System.out.print/*ln*/("가로, 세로 길이를 입력하세요>>");
		Scanner g = new Scanner(System.in);
		
			int a =	g.nextInt();
			int b = g.nextInt();
				System.out.println("사각형의 면적은"+(a*b)+"입니다.");
				g.close();
//				
	}

}