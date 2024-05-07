package question04;

/*4행 3 2 3 2열 2차원 비정방형 배열 생성*/
public class IrregularArray {
	public static void main(String[] args) {
		int [][] irregularArray = {{0,0,0},
									{0,0},
									{0,0,0},
									{0,0}};

		for (int i = 0; i < irregularArray.length; i++) {
			for (int j = 0; j < irregularArray[i].length; j++) {
				irregularArray[i][j]= (i+1)*10+j;
				System.out.print(irregularArray[i][j]+" ");
			}System.out.println();
		}
	
	}
}



//GPT가 알려주는 비정방형 배열 선언 및 초기화법
//// 비정방형 배열 선언 및 초기화
//int[][] jaggedArray = new int[3][];
//
//// 각 행마다 배열 할당
//jaggedArray[0] = new int[3]; 
//jaggedArray[1] = new int[4]; 
//jaggedArray[2] = new int[5]; // 크기만 정하고 초기화되지 않은 상태
//
//// 비정방형 배열 출력 (초기값은 0으로 채워져 있음)
//for (int i = 0; i < jaggedArray.length; i++) {
//    for (int j = 0; j < jaggedArray[i].length; j++) {
//        System.out.print(jaggedArray[i][j] + " ");
//    }
//    System.out.println();