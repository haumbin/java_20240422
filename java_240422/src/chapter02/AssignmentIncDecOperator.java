package chapter02;

public class AssignmentIncDecOperator {
	public static void main(String[] args) {
		int a=3, b=3, c=3;
	
		a+=3;
//		a=a+3;
		b*=3;//b=b*3;
		c%=2;//c=c%2;
		System.out.println("a="+a+",b="+b+",c="+c);
		
		int d=3;//a=6,d=3;
		a=d++; // d를 a에 먼저 넘기고 그 후 1을 증가
		//뒤에 붙은 ++/--는 후위 연산자임
		System.out.println("a="+a+",d="+d);
		a=++d;//a=5, d=5;
//		전위 연산자: 먼저 d가 1 먼저 증가하고 그 후 a에 저장
		System.out.println("a="+a+",d="+d);
		a=d--; //a=5, d=4;
		System.out.println("a="+a+",d="+d);
		a=--d; //a=3, d=3;
		System.out.println("a="+a+",d="+d);
		
		
		
	}

}
