package chapter02;

//1. public class 찾아감
//2. 메인 메소드로 찾아감
//3. 메소드 호출
//4. 호출된 내용 처리
//5. 리턴값을 필요자리에 반환
public class Square {
	public static void main(String[] args) {
//		void : 리턴 타입(리턴[반환] 할 것이 없다.)
		int n=4;
//		square();//메소드 호출부
//		square(4);//메소드 호출부
		square(n);//메소드 호출부
		int s =	square(n);//메소드 호출부
		System.out.println("한변의 길이가 "+n+"인 정사각형의 넓이 : "+s);
		}
//	square : 메소드명(호출부에서 피라미터가 있으면 오류)
//	public static void square() {//메소드 정의부
//	public static void square(int n) {//메소드 정의부
//	 int length : int 타입의 매개변수(인자, 파라미터): n < length 로 받음
//	public static void square(int length) {//메소드 정의부
//	int : 리턴타입	
	public static int square(int length) {//메소드 정의부
//		return; // 보이드는 리턴값이 없음
//		return; ""; 
//		타입 불일치시 오류(String) void 타입
//		return 0; 
//		타입 불일치시 오류(int) void 타입
		return length * length;
	}
}
