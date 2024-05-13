/*
 * 사다리꼴 면적 = 0.5*(아랫변+윗변)*높이
 * 필드: 아랫변, 윗변, 높이
 * 아랫변, 윗변, 높이 입력 받아서 객체에 필드로 접근해서 입력*/
package question07;

import java.util.Scanner;

public class Trapezoid풀이 {
	
	int down =0;
	int up =0;
	int height=0;
	public double getArea() {
		return 0.5*(down+up)*height;//0.5*(아랫변+윗변)*높이
	}
		
	
	public static void main(String[] args) {
		
		Trapezoid풀이 tra = new Trapezoid풀이();// 객체 생성 -> 생성자 호출(기본생성자 만들어서 호출<- 컴파일러)
		Scanner scanner =new Scanner(System.in);
		System.out.print(">>");
		tra.down = scanner.nextInt();// 객체로 멤버에 접근
		tra.up = scanner.nextInt(); // 객체로 멤버에 접근
		tra.height = scanner.nextInt(); //객체로 멤버에 접근
		System.out.println("사다리꼴의 면적은 "+tra.getArea());
		scanner.close();
		
	}
}
