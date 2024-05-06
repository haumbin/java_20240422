package chapter02;

public class TypeConversion {
	public static void main(String[] args) {
		byte b=127;
		int i=10;
		System.out.println(b+i);
//		연산 결과는 큰타입으로 int 타입 암시적 형변환
		System.out.println(10/4);
//		정수 기본타입 int로 계산 2라는 나누기 값과 2라는 나머지 값을 가지나 출력되지 않음
		System.out.println(10.0/4);
//		실수와 정수의 계산이므로 실수로 자동 형변환 계산됨 int > double
		System.out.println(2.9+1.8);
//		실수 연산으로 결과는 실수가 출력됨
		System.out.println((int)2.9+1.8);
//		2+1.8 =3.8 앞만 int로 명시적 형변환 됨
		System.out.println((int)2.9+(int)1.8);
//		2+1 =3 모두 명시적 형변환 됨
		System.out.println((int)(2.9+1.8));
//		처리 우선순위대로 먼저 더한 뒤 정수로 형변환됨. 4.7이 4로 형변환
	}
}
