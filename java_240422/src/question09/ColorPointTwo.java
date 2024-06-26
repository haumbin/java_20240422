package question09;
class Point2 {
	private int x, y;
	public Point2(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }	
}

public class ColorPointTwo extends Point2 {
	private String color;
	public ColorPointTwo(){this(0,0);}
	@Override
	public String toString() {
		return color+"색의 "+"("+getX()+","+getY()+")의 점";
	}
	public ColorPointTwo(int x, int y) {
		super(x,y);
		 this.color="BLACK";
	}
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String color) {
		this.color =color;
	}
	public static void main(String[] args) {
		ColorPointTwo zeroPoint = new ColorPointTwo(); // BLACK 색에 (0,0) 위치의 점
		System.out.println(zeroPoint.toString() + "입니다.");
		ColorPointTwo cp = new ColorPointTwo(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
}

/*BLACK색의 (0,0)의 점입니다.
 RED색의 (5,5)의 점입니다.*/