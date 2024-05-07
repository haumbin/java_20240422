package question01;

import java.util.Scanner;

public class Rectangle풀이 {
	public static void main(String[] args) {
	System.out.print("점(x,y)의 좌표를 입력하시오 >> ");
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	scanner.close();
	
	if(a>= 100 && a <=200 && b >=100 && b <= 200){
		System.out.println("(a,b)는 사각형 안에 있습니다.");
	}else {
		System.out.println("(a,b)는 사각형 안에 없습니다.");
	}
	

	}

}
