package chapter03;

/*
 * 예외처리
 * 배열 인덱스 벗어나는 것
 * */
public class ArrayException {
	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0]= 0;

		try {
			for (int i = 0; i < intArray.length; i++) {
				intArray[i+1]=intArray[i]+i+1;
				System.out.println(intArray[i]);
			
			}
			
//		} catch (Exception e) {//예외처리 종류 상관없이 다 처리(실무에서 많이 사용)
		} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
		
		
//		0 [0]은 0 일때 [1]은 1을 담는다
//		1 [1]은 1 [2]는 3
//		3 [2]는 3 [3]은 6
//		6 [3]은 6 [4]는 10
//		10[4]는 10 [5]는 15 배열의 인덱스(0 1 2 3 4)가 범위를 벗어났습니다.

		

		
				
		
		
		
	}
}
