package question06;

import java.util.Scanner;

public class MutipleOfThree {
	public static void main(String[] args) {
		System.out.println("정수 10개를 입력하시오>>");
		int[] array =new int[10];
		String three= "";
		Scanner scanner =new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i]= scanner.nextInt();
			if(array[i]<0) {System.out.println("양수를 입력해주세요");--i;}
			
			if(array[i]%3==0) {
				three+=array[i]+" ";
			}
		}
		System.out.println("3의 배수는 " +three);
		scanner.close();
	}

}
