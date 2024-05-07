package chapter04;

public class Circle {
	// 멤버변수 (필드)
	int radius;
	String name;
	
	
	//오버로딩 : 다른 매개변수를 사용하면 같은 이름의 메소드를 만들 수 있는 작동방식
	public Circle() {}/*클래스하고 이름이 똑같은 메소드 : 생성자*/
	public Circle(int a) {}/*클래스하고 이름이 똑같은 메소드 : 생성자 (매개변수 1개)*/
	public Circle(int a, int b) {}/*클래스하고 이름이 똑같은 메소드 : 생성자 (매개변수 2개)*/
	
	public double getArea() {//멤버함수(메소드)
		return 3.14*radius*radius; }
	
	
	public static void main(String[] args) {
		Circle pizza; /*참조변수 (태명 비슷) 선언, Circle이 클래스(객체를 생성하는 틀/판/설계도) 우리는 써클 클래스를 참조해서 피자라는 객체를 만들 준비중이다.*/
//		Circle 이라는 설계도를 이용해 pizza라는 객체를 만들어보려한다 (아직 만들지 않음);
//		new Circle(); //이름없는 Circle이라는 객체만 생성함
		pizza = new Circle(); //객체 생성// 이름이 피자 /*생성한 Circle이라는 객체를 pizza 참조변수에 할당한다. */
		pizza/*객체*/.radius=10;/*필드 멤버변수 값 셋팅*/
		pizza.name="자바피자";//멤버변수 값 셋팅
		pizza.getArea();//멤버함수 호출
		double area = pizza.getArea();// 멤버함수 호출
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle dount/*참조변수*/= new Circle(); /*Circle이라는 객체를 생성하고 참조변수 dount에 할당한다. */
 
		
		dount.radius=2;
		dount.name="자바도넛";
		area = dount.getArea();
		System.out.println(dount.name+"의 면적은 "+area); //멤버변수 값 사용
	}
}