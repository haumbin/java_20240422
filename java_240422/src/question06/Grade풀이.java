package question06;

import java.util.Scanner;

public class Grade풀이 {
	private int math =0;
	private int science =0;
	private int english =0;
	
	public Grade풀이(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;				
	}
	public int average() {
		return (math+science+english)/3;}
	
	public static void main(String [] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		 int math = scanner.nextInt();
		 int science = scanner.nextInt();
		 int english = scanner.nextInt();
		 Grade풀이 me = new Grade풀이(math, science, english);
		 System.out.println("평균은 " + me.average());
		 scanner.close();
		 }

}
