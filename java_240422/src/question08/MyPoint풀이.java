package question08;

public class MyPoint풀이 {
	private int x,y;
	public MyPoint풀이(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	@Override
	public String toString() {
		return "Point("+x+","+y+")";
	}
	
	public static void main(String [] args) {
		MyPoint풀이 p = new MyPoint풀이(3, 50);
		MyPoint풀이 q = new MyPoint풀이(4, 50);
		System.out.println(p);
		
		if(p.equals(q)) System.out.println("같은 점");
		else System.out.println("다른 점");
		}
}
