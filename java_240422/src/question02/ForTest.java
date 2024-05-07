package question02;

public class ForTest {

	public static void main(String[] args) {
		int sum=0;
		
//		for(int i =0; i<100; i+=2) {
//			sum+=i;
//		}
//		System.out.println(sum);
//	}
	
	for(int i =0; i<100; i++) {
		if(i%2==0) {
			sum+=i;
	} else { sum = sum+i-i ; }

	}
	
	System.out.println(sum);
	
	}
}

