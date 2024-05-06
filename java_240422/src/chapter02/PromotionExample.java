package chapter02;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue=10;
//		int byteValue=1000;
		int intValue=byteValue;
		System.out.println("intValue :"+intValue);
		// 작은 타입을 큰 타입으로 받음: 자동 변환
		
		
		char charValue='가';
		intValue =charValue;
		System.out.println("intValue :" +intValue);
//		문자형을 정수형에 받을 때 출력하면 해당 유니코드가 표기됨
		intValue=50;
//		  작은 타입을 큰타입으로 자동 형변환
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		longValue=100;
		float floatValue = longValue;
		System.out.println("floatValue : "+floatValue);
//		정수를 실수로
		floatValue=100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue : "+ doubleValue);
	}
}
