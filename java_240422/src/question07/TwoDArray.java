package question07;


import java.util.Random;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] intArray = new int[4][4];
		Random random = new Random();
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
					intArray[i][j] = random.nextInt(10)+1;
				System.out.print(intArray[i][j]+"\t");
			}
			System.out.println(" ");
			}
	}

}
