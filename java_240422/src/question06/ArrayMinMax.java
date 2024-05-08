package question06;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("양수 10개를 입력하세요");
		int [] a = new int[10];
		for(int i=0; i<a.length; i++) {
			int c= scanner.nextInt();
			if(c>0) {
			a[i]= c;}else {System.out.println("양수가 아닙니다. 양수를 입력하세요"); i--;}	
		}
		int max =0;
		int min =a[0];
			for(int i=0; i<10; i++) {
				if(a[i]>max) {
					max= a[i];
				}
				if(a[0]>a[i]) {
					min = a[i];
				}
			}
		int sum = max+min;
		System.out.println("가장 작은 수는 "+min+"이고, 가장 큰 수는 "+max+"이고, 최소값+최대값은 " + sum+"입니다.");
		scanner.close();
	}

}
