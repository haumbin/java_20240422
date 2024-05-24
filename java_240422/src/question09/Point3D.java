package question09;
class Point3 {
	private int x, y;
	public Point3(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x= x; this.y = y; }	
}
public class Point3D extends Point3 {
	private int z;
	 public Point3D(int x, int y, int z) {
		 super(x,y);
		 this.z=z;
	}
	 public int getZ() { return z; }
	 @Override
		public String toString() {
			return "("+getX()+","+getY()+","+getZ()+")의 점";}
	 
	 public void moveUp() {
		 this.z = z+1;
	 }
	 public void moveDown() {
		 this.z = z-1;
	 }
	 protected void move(int x, int y, int z) { move(x,y); this.z =z; }	
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3); // 1, 2, 3은 각각 x, y, z축의 값.
		System.out.println(p.toString() + "입니다.");
		p.moveUp(); // z 축으로 위쪽 이동
		System.out.println(p.toString() + "입니다.");
		p.moveDown(); // z 축으로 아래쪽 이동
		p.move(10, 10); // x, y 축으로 이동
		System.out.println(p.toString() + "입니다.");
		p.move(100, 200, 300); // x, y, z 축으로 이동
		System.out.println(p.toString() + "입니다.");
		}
}
/*
 * (1,2,3)의 점입니다.
 (1,2,4)의 점입니다.
 (10,10,3)의 점입니다.
 (100,200,300)의 점입니다.
*/
