package question09;
class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}
public class ColorPoint extends Point {
	String color;

	public ColorPoint(int i, int j, String color) {
		super(i,j);
		this.color = color;
}
	public void setXY(int i, int j) {
		 move(i,j);
	}
	@Override
	public String toString() {
		//RED색의 (10,20)의 점
		return color+"색의 ("+getX()+","+getY()+")의 점";
	}
	private void setColor(String color) {
		this.color =color;
		
	}
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");

}
}