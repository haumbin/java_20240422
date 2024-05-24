package question09;
/*나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
 * 컬러 Tv 상속*/

class TV2 {
	private static int size;
	public TV2(int size) { this.size = size; }
	protected static int getSize() { return size; }
}
 class ColorTV2 extends TV2 {
	private int nColor;
	public ColorTV2(int size, int nColor) {
		super (size);
		this.nColor = nColor;
		
	}
		
	
	public void printProperty() {
		System.out.println(getSize()+"인치 "+nColor+"컬러");	
		
	}
 }
public class IPTV extends ColorTV2{
	private String ipAddr;
		public IPTV(String ipAddr, int size, int nColors) {
		super (size,nColors);
		this.ipAddr = ipAddr;
		
	}
	public void printProperty() {
		System.out.print("나의 IPTV는 "+ipAddr+" 주소의 ");
		super.printProperty();
}
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
}
}