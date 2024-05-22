package question09;

class TV {
	private static int size;
	public TV(int size) { this.size = size; }
	protected static int getSize() { return size; }
}
public class ColorTV extends TV {
	private int nColor;
	public ColorTV(int size, int nColor) {
		super (size);
		this.nColor = nColor;
		
	}
		
	
	private void printProperty() {
		System.out.println(getSize()+"인치 "+nColor+"컬러");	
		
	}

	public static void main(String [] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		}



}
