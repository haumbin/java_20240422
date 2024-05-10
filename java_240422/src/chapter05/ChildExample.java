package chapter05;

public class ChildExample {
	public static void main(String[] args) {
		//upcasting(super class 타입으로 sub class 객체 생성 자동 업캐스팅)
		//Child 클래스에 기본 생성자 만들어서 호출 하기에 Parent도 갔다가 거기도 없으니 자동생성 만들어서 호출후 Child 호출해서 옴
		Parent parent =new Child();
		parent.field1="data1";
		// upcasting 된 객체는 서브클래스 멤버접근 불가
//		parent.field2="data2"; //오류
		parent.method1();
		parent.method2();
		//upcasting 된 객체는 서브클래스 멤버 접근 불가
//		parent.method3();// 오류
		
		Child child= (Child)parent;// down casting
//		down casting 객체는 서브클래스 멤버 접근 가능
		child.field2="yyy";
//		down casting 객체는 서브클래스 멤버 접근 가능
		child.method3();
		
	}

}
