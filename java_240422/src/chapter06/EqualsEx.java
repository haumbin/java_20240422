package chapter06;

class Point3{
	private int x,y;
	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
//	equals 오버라이딩해서 객체의 값을 비교
	@Override
	public boolean equals(Object obj) {
		Point3 p=(Point3)obj;
		if (x == p.x && y == p.y) { //a의 x y 값과 b의 xy의 값이 같으면 으로 변경
			//a를 기반으로 b라는 객체를 입력값으로 시행하는 것이니까 a의 x값과 b를 object로 업하고 다시 point3로 다운한 그 객체의 xy값을 말한다.
			return true;
		} else {return false;

		}
	}
}
public class EqualsEx {
	public static void main(String[] args) {
		Point3 a =new Point3(2,3);
		Point3 b =new Point3(2,3);
		Point3 c =new Point3(3,4);
		
		if (a==b) {//객체 비교
			System.out.println("a==b");
		} else {System.out.println("a != b");

		}
		// equals : 기본은 객체 비교
		// a is equal not to b
		// a is equal  to b(객체의 값 비교)
		if (a.equals(b)) {//객체 비교
			System.out.println("a is equal to b");
		} else {System.out.println("a in equal not to b");
		
		}
		// a is equal  to c
		if (a.equals(c)) {//객체 비교
			System.out.println("a is equal to b");
		} else {System.out.println("a in equal not to b");
		
		}
		
	}
}
