package chapter03;
/*
 * 구구단 배열로 생성
 * 값을 넣어본다 ex> 2*7=14, 9*4=36*/
public class Ex3_9 {
public static void main(String[] args) {
//	정수 타입의 2차원 배열 선언 (1차원은 열로 구성, 1차원을 2개이상 가진 행으로 구성)
//	int[][] gugudan;
//	//2차원 배열 선언, 생성(9행 9열)
//	int[][] gugudan= new int[9][9];//index 0~8까지
	int[][] gugudan= new int[10][10];//index 0~9까지
	
//	1*1=1~9*9=81 시행
	for (int i = 1; i <= 9; i++) {// 행 기준
		for(int j= 1; j<=9; j++) { //열 기준
//			행렬에 1*1~9*9까지 값을 2차원 배열원소로 저장
			gugudan[i][j]=i*j; //i: 행, j:열(gugudan[i][j]) 반복문을 통해 배열에 값을 입력하는 과정?
		}
	}
	
	System.out.println("2 X 7 = "+gugudan[2][7]);
	System.out.println("9 X 4 = "+gugudan[9][4]);
	
}
}
