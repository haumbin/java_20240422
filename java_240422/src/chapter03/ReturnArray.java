package chapter03;
/*
 * 배열 리턴(메소드 이용)
 * */
public class ReturnArray {
	//  makeArray() : 메소드
//	int[]: 반환 (리턴) 타입(리턴을 안하면 오류)
	static int[] makeArray() {
//		리턴 타입에 배열크기를 표시하면 오류
//		static int[4] makeArray() { 
//		배열 생성시 타입이 불일치시 오류
//			int[] temp = new String[4];
			int[] temp = new int[4];
			
			for(int i =0; i< temp.length; i++) {
				temp[i] =i;//0 1 2 3
			}
		
			
		return temp;
//		return 0; > 정수배열이 아닌 정수 값이라 타입이 일치하지 않음
//		return temp[]; /*리턴할 때 []을 추가하면 오류*/
	}
	
	public static void main(String[] args) {
		int intArray[];
//	 메소드 호출
		intArray= makeArray(); // temp 배열 받음// 0123
		
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]+" ");
			
		}
	}
}
