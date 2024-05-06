package chapter02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue=44032;
//		int 타입 char로 바로 저장하려하면 오류
//			char charValue =intValue;
			char charValue =(char)intValue;
			System.out.println(charValue);
			// char 로 변환(casting)해서 저장
//			44032 유니코드에 해당하는 '가'문자가 저장
			
//			정수 작은타입에서 큰 타입으로 변환(자동 변환 > 묵시적 변환)
//			long longValue=500;
//			int로는 표현이 불가능한 수를 L을 붙이지 않으면 int로 인식해서 오류
			long longValue=5000999888L;
			intValue = (int) longValue;
//			정수 큰타입에서 작은 타입으로 변환(명시적 변환을 하지않으면 오류)
			System.out.println(intValue);
//			인트가 담을 수 있는 최대치까지만 담고 나머지는 손실되어 출력됨
			
			double doubleValue=3.14;
			intValue = (int)doubleValue;
			System.out.println(intValue);
//			int가 받을 수 있는 정수만 받고 실수는 소실
	
	
	
	
	
	
	}

}
