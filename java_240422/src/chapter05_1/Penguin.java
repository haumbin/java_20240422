package chapter05_1;

//객체 생성시 멤버 5개
// extends Bird, Swim : 자바클래스는 다중 상속 불가 오류
//public class Penguin extends Bird, Swim{ //오류
//인터페이스 다중상속 됨(implements 키워드 사용)
//생명1개, 날개2개, 걷다, 먹는다. +수영한다. (인터페이스)
	public class Penguin extends Bird implements Swim2{
	
	@Override
	public void swim() {
		System.out.println("penguins swim.");
	}
		
//	public void swim() {		
//		System.out.println("penguins swim.");
//	}

}
