package question08;

import java.util.Scanner;

public class RandomArray2풀이 {
	
	// 난수의 중복체크하는 메소드
	// int a[]: array[], to: 0, r:23
	public static boolean exists(int a[], int to, int r) {
		//0: 반복안함
//		0<1
//		0<2
		for (int i = 0; i < to; i++) {
//			a[0]:23, r:33
//			a[0]:23, r:33, a[1]:33, r:33
			if (a[i] == r) {
				return true;
			}

		}
		return false;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n= scanner.nextInt(); //ex>24
		int[] array = new int[n]; // 배열크기가 24
				
		for (int i = 0; i < array.length; i++) {
			int r= (int)(Math.random()*100+1);//1~100까지의 난수를 발생
//			i=0, r=23, i=1, r=33
//			i=0, r=23, i=1, r=33, i=2, r=33
			if(exists(array,i,r)) {
				i--;
				continue;
			}
			//array[0]=23
			//array[1]=33
			array[i]= r;
			if(i == 0) {// 첫번째는 엔터 안친다
				System.out.print(array[i]+" ");}
			else {
				if(i%10 ==0) {//10번째마다 엔터친다
					System.out.println();
				}
			System.out.print(array[i]+" ");
			}
			
						}	
		scanner.close();

	}
}