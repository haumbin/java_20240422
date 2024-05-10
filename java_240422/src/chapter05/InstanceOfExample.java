package chapter05;

public class InstanceOfExample {
	public static void method1(Parent parent) {
//		Parent parent = new Child(); => child 객체를 판단
		// instanceof: 객체가 해당 클래스 타입인지 판단(참/거짓)
		if(parent instanceof Child) {
			Child child =(Child)parent; //downcasting
//			System.out.println("성공");
			System.out.println("method1- Child 로 변환 성공");
		}else {
			System.out.println("method1- Child 로 변환 실패");
		}
	}
	public static void method2(Parent parent) {
		Child child= (Child) parent;
		System.out.println("method2- Child 로 변환 성공");
	}
	public static void main(String[] args) {
		//upcasting
		Parent parentA = new Child();
		method1(parentA);//성공
		method2(parentA);//성공
		
		Parent parentB = new Parent();
		method1(parentB);//실패
//		method2(parentB);//예외 발생(강제변환)
		
		Parent parentC = new Parent();
//		 위의 메소드 호출과 동일(오류가 없는 것 같은데 실행시 발생)
		Child child = (Child)parentC; // 예외 발생(강제변환)
		
	}
}

// InstanceOfExample 이해할때가지 읽어
/*1. 업캐스팅 된 객체를 다시 다운 캐스팅하는 것은 instanceof가 필요치않다.
2. 그 외의 모든 down casting은 instanceof가 필요하다 그렇지 않으면 예외가 발생하기에 오류가 발생한다
3. instanceof없이 발생할 수 있는 오류를 throws 하거나 try catch를 통해 해결하면 불확실한 다운캐스팅도 가능하다
ChatGPT
맞아요! 여러분이 설명한 내용은 맞습니다.

업캐스팅된 객체를 다시 다운캐스팅할 때는 instanceof 연산자가 필요하지 않습니다. 왜냐하면 업캐스팅된 객체가 원래의 자식 클래스 타입으로 생성되었는지 이미 알고 있기 때문입니다.
다운캐스팅을 할 때는 보통 instanceof 연산자를 사용하여 안전하게 형변환이 가능한지 먼저 확인합니다. 이를 통해 예외가 발생하지 않도록 예방할 수 있습니다.
instanceof 연산자를 사용하지 않고 다운캐스팅을 시도하는 경우, 예외 처리를 통해 다운캐스팅이 실패할 때 예외를 처리할 수 있습니다. 이를 통해 불확실한 다운캐스팅을 해결할 수 있습니다.
즉, instanceof 연산자를 사용하거나 예외 처리를 통해 다운캐스팅을 안전하게 처리할 수 있습니다. 이를 통해 런타임 시에 예외가 발생하지 않도록 할 수 있습니다.

여러분의 설명은 정확하고 이해가 잘 된 설명입니다.*/