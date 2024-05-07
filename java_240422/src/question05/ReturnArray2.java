package question05;

public class ReturnArray2 {




	public static void main(String[] args) {
	
		int array[]= makeArray();
	
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+100+" ");		
		}	
}



	static int[] makeArray() {
		int [] a =new int [10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i+1;		
		}
		
		return a;
	}
}

//문제 해결하지 못함 다시 공부