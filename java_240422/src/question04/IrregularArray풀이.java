package question04;

/*4행 3 2 3 2열 2차원 비정방형 배열 생성*/
public class IrregularArray풀이 {
	public static void main(String[] args) {

		// 비정방형 배열 : 행만 정의하고 열은 비워둠
		int n[][] = new int[4][];
		n[0]=new int[3]; // 1행(n[0])의 열의 크기는 3
		n[1]=new int[2];
		n[2]=new int[3];
		n[3]=new int[2];
		
		
// 4번 반복		
		for (int i = 0; i < n.length; i++) { //행의 크기만큼 반복
//			3,2,3,2번 반복
			for (int j = 0; j < n[i].length; j++) {
				n[i][j]= (i+1)*10+j;
				System.out.print(n[i][j]+" ");
			}System.out.println();
		}
		
		
		
		
		
		//// 바로 초기값을 줘서 비정방형 배열을 만드는 법
//		int [][] irregularArray = {{10,11,12},
//									{20,21},
//									{30,31,32},
//									{40,41}};
//
//		for (int i = 0; i < irregularArray.length; i++) {
//			for (int j = 0; j < irregularArray[i].length; j++) {
//			System.out.print(irregularArray[i][j]+" ");
//			}System.out.println();
//		}
	
	}
}
