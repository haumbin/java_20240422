package chapter03;

/*
 * do while 문 사용
 * 변화되는 i 값 출력
 * */
public class LoopExample3 {
	public static void main(String[] args) {
		int i= 10;
//		do while 문 최소 한번 실행은 보장한다.
		do {
			System.out.println("i의 값 : " +i);
			i--; //9로 바뀜
//			9<3 => 거짓으로 종료
		} while (i<3);
	}
	
	
	
	
	
	
}
