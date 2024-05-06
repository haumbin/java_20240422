package chapter02;

public class CharExample {
	public static void main(String[] args) {
		char c1='A';
		System.out.println(c1);
//		유니코드 65는 A다.
		char c2= 65;
		System.out.println(c2);
//		u~:16진수
		char c3= '\u0041';
		System.out.println(c3);
		char c4= '가';
		System.out.println(c4);
//		유니코드 44032는 가
		char c5= 44032;
		System.out.println(c5);
//		ac00 16진수는 44032 10진수임
		char c6= '\uac00';
		System.out.println(c6);
	}
}
