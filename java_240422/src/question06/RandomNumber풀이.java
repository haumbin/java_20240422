package question06;

import java.util.Random;

/*
 * 난수를 발생 Math(클래스), Random(클래스)*/

public class RandomNumber풀이 {
	public static void main(String[] args) {
		int rNumber;
		Random generator =new Random();
//		rNumber = generator.nextInt(10); // 난수발생(0~9의 정수)
//		rNumber = generator.nextInt(10)+1; // 난수발생(1~10의 정수)
//		rNumber = generator.nextInt(10)*-1; // 난수발생(-9~0의 정수)
		//generator.nextInt()난수 발생(범위: int타입 범위 > -2의 31승 ~2의 31승 -1까지)
//		generator.nextDouble(); double 범위 .nextFloat(); float범위 .nextLong(); long타입범위 .nextBoolean(); 참/거짓
		while(true) {
			rNumber = generator.nextInt(10)+1;//난수 발생(1~10의 정수)
			System.out.println(rNumber);
			if(rNumber==7) {
				break;
			}
		}
		
	}
}


