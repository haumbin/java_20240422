package question06;

import java.util.Scanner;

public class ArrayMinMax풀이 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 10개를 입력하세요");
		
		int [] intArray = new int[10];
		int max =0;
		int min =0;
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			
			if(i ==0) {
				min = intArray[i];};
		if(intArray[i]<min) {
			min =intArray[i];}
		if(intArray[i]>max) {
			max= intArray[i];
							}
/*sum으로 따로 뺄 필요없이 한번에 해도 됨 어차피 한번만 출력하니까*/
		/*입력값을 배열에 바로 받을 수 있다.*/
		}
		
	System.out.println("가장 작은수는 "+min+"이고, ");
	System.out.println("가장 큰 수는 "+max+"이고, ");
	System.out.print("최소값+최대값은 " + (min+max)+"입니다.");
	scanner.close();
	}
}

			
		
