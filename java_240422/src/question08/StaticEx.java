package question08;

class ArrayUtil {
 public static int [] concat(int[] a, int[] b) {
 int [] c= new int[a.length+b.length];
 for (int i = 0; i < c.length; i++) {
	c[i]=a[i];
}
	 return c;}
 public static void print(int[] a) {
	 System.out.println();
 }
 }
 // 내접근이 맞았어

public class StaticEx {
	public static void main(String [] args){
		 int [] array1 = { 1, 5, 7, 9 };
		 int [] array2 = { 3, 6, -1, 100, 77 };
		 int [] array3 = ArrayUtil.concat(array1, array2);
		 ArrayUtil.print(array3);
		 }

}
