package question05;

public class IrregularArray2풀이 {
	public static void main(String[] args) {
		int intArray[][] = new int[5][];
		intArray[0] = new int[5];
		intArray[1] = new int[1];
		intArray[2] = new int[4];
		intArray[3] = new int[2];
		intArray[4] = new int[3];
		
		//intArray.length:5 (5번 반복)
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				//intArray[i].length(5 1 4 2 3)
				intArray[i][j] = (i*10+j*1+35);/*(i+3)*10+5+j*/
				System.out.print(intArray[i][j]+" ");
			}System.out.println();
		}
		
	}
}
