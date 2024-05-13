package chapter05_2;

class OuterClass{//외부 클래스 // 이너클래스가 퍼블릭이든 프라이빗이든 상관없이 외부클래스만이 접근가능하다. 자동으로 프라이빗으로 관리가능
	private String secret="Time is money";
//	public String secret="Time is money";
	public OuterClass() {//2. 달걀의 생성자 호출됨
//		new InnerClass();//3. 노른자객체 생성
	InnerClass obj = new InnerClass();//3. 노른자객체 생성
	obj.method();//a.
	}
	public class InnerClass{ // 내부 (중첩 or inner)클래스
//		private class InnerClass{ // 내부 (중첩 or inner)클래스 //아우터클래스에서 이너가 프라이빗이라도 접근 됨
		public InnerClass() {//4. 노른자의 생성자 호출됨
			System.out.println("내부 클래스의 생성자 입니다.");  
		}
		//b.
		public void method() {
			//노른자에서 달걀의 private 접근
			//c.
			System.out.println(secret);
		}
	}
}

public class OuterClassTest {//외부에서는 내부 클래스에 아예접근할 수 없음
	public static void main(String[] args) {
//		new OuterClass();//1.달걀 객체 생성
		OuterClass outer = new OuterClass(); //1. 달갈 객체 생성
//		outer.secret="";//접근 제한(private 이면)
		//private를 안해도 접근 제한
//		new InnerClass();// 접근 제한, 노른자 객체 생성(오류)
	}
}
