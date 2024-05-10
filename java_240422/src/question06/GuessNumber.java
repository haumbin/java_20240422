package question06;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random n = new Random();
	int a =	n.nextInt(10)+1;
	System.out.print("추측한 숫자를 입력하세요: ");
	while(true){
	int b = scanner.nextInt();
	if(b<a) {
		System.out.println("추측한 숫자가 틀렸습니다");
		System.out.println("추측한 숫자가 너무 작습니다.");
		System.out.print("추측한 숫자를 입력하세요: ");
	}else if(a<b) {
		System.out.println("추측한 숫자가 틀렸습니다");
		System.out.println("추측한 숫자가 너무 큽니다.");
		System.out.print("추측한 숫자를 입력하세요: ");
	}else {
		System.out.println("맞추셨습니다");
		scanner.close();
		break;
	}
	}
	}
}
