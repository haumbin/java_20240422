/*
 * 아래변, 윗변과 높이를 입력 받아 사다리꼴의 면적을 출력하는 프로그램을
작성하라. 아랫변(down), 윗변(up)와 높이(height) 필드, 그리고 면적 값을
제공하는 getArea() 메소드를 가진 Trapezoid 클래스를 만들어 활용하라. */
/*
 * >> 5 4 10
사다리꼴의 면적은 45.0*/
package question07;

import java.util.Scanner;

public class Trapezoid {
	
	int down =0;
	int up =0;
	int height=0;
	public Trapezoid(int down, int up, int height) {
		this.down = down;
		this.up = up;
		this.height = height;
		
	}
	public double getArea() {
		return (down+up)*height/2;
	}
	public static void main(String[] args) {
		
		System.out.print(">>");
		Scanner scanner =new Scanner(System.in);
		Trapezoid a = new Trapezoid(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		System.out.println("사다리꼴의 면적은 "+a.getArea());
		scanner.close();
		
	}
}
