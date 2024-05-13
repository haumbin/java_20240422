package question07;


import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		int years = 0;
		Scanner scanner =new Scanner(System.in);
		System.out.print("원금을 입력하세요: ");
		double principal = scanner.nextDouble();
		System.out.print("연이율을 입력하세요: ");
		double rate = scanner.nextDouble();
		System.out.println("연도수\t원리금");
		double balance =principal;
		while(true){			
			if(balance<=principal*2) {
				years = years +1;
			balance = balance*((1.0)+rate/100.0);
			System.out.println(years+"\t"+balance);				
			}else {break;}
			
		}
		
		System.out.println("필요한 연도수 = "+years);
		scanner.close();
	}

}
