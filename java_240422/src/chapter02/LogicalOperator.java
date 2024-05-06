package chapter02;

public class LogicalOperator {
	public static void main(String[] args) {
//		문자끼리는 비교시 유니코드 크기로 비교됨
		System.out.println('a'>'b');
		System.out.println('a'<'b');
		
		System.out.println(-1<0);
		System.out.println(3>=2);
		System.out.println("==================");
		System.out.println(3.45<=2);
		System.out.println(3==2);
		System.out.println(3!=2);
//		3은 2와 같다는 거짓이다 = 참
		System.out.println(!(3!=2));
//		(이 틀리다(3은 2와 같다는 거짓이다 = 참)) = 거짓
		System.out.println("==================");
		System.out.println((3>2)&&(3 > 4));
//		3은 2보다 크고 3은 4보다 크다 = 두번째가 틀림 거짓
		System.out.println((3!= 2)|| (-1 > 0));
//		3은 2와 같지않다 또는 -1이 0보다 크다 중 하나는 맞는 말인가? =참
		System.out.println((3!= 2)^(-1 > 0));
		System.out.println((3!= 2)^(-1 > 0));
//		하나는 거짓이고 하나는 참일 때 = 참 
		
		
		
		
		
	}
}
