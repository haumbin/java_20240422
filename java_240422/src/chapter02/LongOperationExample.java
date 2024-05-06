package chapter02;

public class LongOperationExample {
	public static void main(String[] args) {
		
		byte value1=10;
		int value2=100;
		long value3=1000;
//		int result =value1+value2+value3; 
		//오류 long으로 암묵적 형변환 되었는데 타입을 int로 출력하려니 오류
		int result =(int) (value1+value2+value3); //int로 casting
		System.out.println(result);
		
		byte a =1;
		int b=2;
		int s = a+b;
		System.out.println(s);
//				암묵적 형변환 된 값이 출력하고자하는 값고 일치하면 따로 캐스팅이 필요없다.
		
		
		
		
		
		
		
		
	}

}
