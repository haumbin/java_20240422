package chapter02;

public class floatDoubleExample {
	public static void main(String[] args) {
		// 오류: 실수는 기본이 double
		//		float var1=3.14;
		//float var1=3.14f;
		float var1=3.14F;
		double var2=3.14;
		System.out.println("var1 :"+var1);
		System.out.println("var2 :"+var2);
		
		float var3=0.1234567890F;
		float var4=0.1234567891F;
		float var5=0.123456789123456789F;
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		// 값을 저장시 오류발생하지 않고, 출력시 짤림
		// 소수점 자리수 제한 없이 값을 가지나 출력시 짤림(소수점 자리수는 double > float)
		double var6=0.1234567890;
		double var7=0.1234567891;
		double var8=0.123456789123456789;
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		double var9=0.1234567791234567891234567987564;
		System.out.println(var9);
		
		double um = 3e6;
		System.out.println(um);
		float um2 = 3e6f;
		System.out.println(um2);
		float um3 = 2e-3f;
		System.out.println(um3);
		double um4 = 2e-3;
		System.out.println(um4);
	}
}
