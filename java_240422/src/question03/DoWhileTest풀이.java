package question03;

public class DoWhileTest풀이 {
	public static void main(String[] args) {
		int sum=0, i=0;
			
		do {
//			99까지 반복 > 99보다 크면 break
			if(i>99) {break;}
		sum += i;
		i +=2;
		} while (true); 
		System.out.println(sum);
	} 
}
