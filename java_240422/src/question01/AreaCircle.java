package question01;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
	Scanner test = new Scanner(System.in);
			System.out.println("반지름을 입력하세요>>");
			
			int r= test.nextInt();
			double pi = 3.14;
			System.out.println("원의 면적은"+(r*r*pi)+"입니다.");
			
			test.close();
}
}
