package question04;

public class Print2DArray풀이 {
	public static void main(String[] args) {
//	영의 크기가 각각 달라서 비정방형 배열	
	int n [][] = { {1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
	
	
//	n.length:5(행의 크기)=> 중괄호 안에 중괄호 갯수
	for (int i = 0; i < n.length; i++) {
//		n[0].length=1;
//		n[1].length=3;
//		n[2].length=1;
//		n[3].length=4;
//		n[4].length=2;
		for (int j = 0; j < n[i].length; j++) {
			
			System.out.print(n[i][j]+" "); //n[i][j] : 2차원배열원소ㄴ 
		}System.out.println();
	}
	
	
	}
}
// i 와 j를 화면에 출력해서 진행됨에 따라 변하는 값들을 체크할 수 있다.
