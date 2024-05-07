package question03;

import java.util.Scanner;

public class CalculateGrade {
	public static void main(String[] args) {
		boolean cheating; //부정행위 여부
		int attendrate; //출석률
		int totalscore; // 총점
		char grade; //학점
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("부정행위여부(true 혹은 false):");
		cheating = scanner.nextBoolean();
		
		System.out.print("출석률(0~100 사이의 정수값):");
		attendrate = scanner.nextInt();
		
		System.out.print("총점(0~100 사이의 정수값):");
		totalscore = scanner.nextInt();
		scanner.close();
		if(cheating==false) /*부정행위 안함*/{if(attendrate>=80)/*출석률 80 이상*/{
			
			if(totalscore>=90) {grade ='A';}
			else if(totalscore>=80) {grade ='B';}
			else if(totalscore>=70) {grade ='C';}
			else if(totalscore>=60) {grade ='D';}
			else {grade ='F';}
			
		}else {grade='F';} // 출석 낮으면 f
		
		
		}else {grade = 'F';}// 부정행위 했으면 f
	
	
	System.out.println("학점 = "+grade);
	}
}
