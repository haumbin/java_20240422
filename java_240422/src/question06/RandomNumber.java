package question06;

import java.util.Random;



public class RandomNumber {
	public static void main(String[] args) {
		Random random =new Random();
		while(true) {
		int randomNomber = random.nextInt(9);
		System.out.println(randomNomber);
	
		if(randomNomber==7) {
		break;
	}
		}
		
	}
}


