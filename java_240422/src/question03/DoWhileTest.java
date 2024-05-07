package question03;

public class DoWhileTest {
	public static void main(String[] args) {

		int i=0;
		
		int sum = 0;
//		
//		do {
//			sum = sum+i;
//			
//		i+=2;} while (i <100); 
//		
//		System.out.println(sum);
		
		
		do {
			if(i%2==0) {sum = sum+i;}else {}
			i++;
		} while(i<100);
		System.out.println(sum);
	} 
	
}
