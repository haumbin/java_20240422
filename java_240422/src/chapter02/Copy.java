package chapter02;
/*
 * 
 * 
 */
public class Copy {
	public static void main(String[] args) {
//		String 타입
//		origin : 변수(명)
//		String 타입의 변수 선언
//		String origin;
		String origin = "가나다라";
		String copy=origin;
		System.out.println(copy);
		System.out.println(origin);
	
		System.out.println(copy+"마바사");
		copy = copy +"마바사";
				System.out.println(copy);
	}

}